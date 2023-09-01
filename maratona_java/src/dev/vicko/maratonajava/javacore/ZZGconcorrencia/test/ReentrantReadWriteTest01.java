package dev.vicko.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import static java.lang.System.*;

class MapReadWrite {
	 private final Map<String, String> map = new LinkedHashMap<>();
	 private final ReentrantReadWriteLock rwl;

	 MapReadWrite (ReentrantReadWriteLock rwl) {
		  this.rwl = rwl;
	 }

	 public void put (String key, String value) {
		  rwl.writeLock().lock();
		  try {
				if (rwl.isWriteLocked()) {
					 out.printf("%s obteve o WRITE lock%n", Thread.currentThread().getName());
				}
				map.put(key, value);
				Thread.sleep(500);
		  } catch (InterruptedException e) {
				e.printStackTrace();
		  } finally {
				rwl.writeLock().unlock();
		  }
	 }


	 public Set<String> allKeys () {
		  rwl.readLock().lock();
		  try {
				return map.keySet();
		  } finally {
				rwl.readLock().unlock();
		  }

	 }


}

public class ReentrantReadWriteTest01 {
	 public static void main (String[] args) {
		  ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
		  MapReadWrite mapReadWrite = new MapReadWrite(rwl);

		  Runnable writer = () -> {
				for (int i = 0; i < 20; i++) {
					 mapReadWrite.put(String.valueOf(i), String.valueOf(i));
				}
		  };

		  Runnable reader = () -> {
				if (rwl.isWriteLocked()) {
					 out.println("WRITE LOCKED!!!");
				}
				rwl.readLock().lock();

				out.println("FINALLY I GOT THE DAWN LOCK");

				try {
					 out.println(Thread.currentThread().getName() + " " + mapReadWrite.allKeys());
				} finally {
					 rwl.readLock().unlock();
				}
		  };
		  Thread t1 = new Thread(writer);
		  Thread t2 = new Thread(reader);
		  Thread t3 = new Thread(reader);

		  t1.start();
		  t2.start();
		  t3.start();
	 }
}
