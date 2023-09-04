package maratonajava.javacore.ZZestreams.test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
	 public static void main (String[] args) {
		  Stream.iterate(1, n -> n + 2)
					 .limit(100)
					 .forEach(System.out::println);

		  Stream.iterate(new int[] {0, 1}, n -> new int[]{n[1], n[0]+n[1]})
					 .limit(100)
					 .map(a->a[0])
					 .forEach(System.out::println);

		  ThreadLocalRandom random = ThreadLocalRandom.current();
		  Stream.generate(()-> random.nextInt(1,1000))
					 .limit(90)
					 .forEach(System.out::println);
	 }
}
