package maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static java.lang.System.out;

public class BlockingQueueTest01 {
	 public static void main (String[] args) throws InterruptedException {
		  BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
		  bq.put("William");
		  out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());
		  out.println("Trying to add another value");
		  bq.put("Suane");
		  out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());

	 }

	 static class RemoveFromQueue implements Runnable{
		  private final BlockingQueue<String> bq;

		  RemoveFromQueue (BlockingQueue<String> bq) {
				this.bq = bq;
		  }

		  @Override
		  public void run () {
				out.printf("%s added the value %s%n", Thread.currentThread().getName(), bq.peek());

		  }
	 }
}
