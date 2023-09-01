package dev.vicko.maratonajava.javacore.ZZGconcorrencia.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.System.out;

public class Members {
	 private final Queue<String> emails = new ArrayBlockingQueue<>(10);
	 private final ReentrantLock lock = new ReentrantLock();
	 private final Condition condition = lock.newCondition();
	 private boolean open = true;

	 public boolean isOpen () {
		  return open;
	 }

	 public int pendingEmails () {
		  lock.lock();
		  try {
				return emails.size();
		  } finally {
				lock.unlock();
		  }
	 }

	 public void addMemberEmail (String email) {
		  lock.lock();
		  try {
				String threadName = Thread.currentThread().getName();
				out.println(threadName + "Adicionou email na lista");
				this.emails.add(email);
				//Todo voltar quando a thread estiver esperando.
				condition.signalAll();
		  } finally {
				lock.unlock();
		  }
	 }

	 public String retrieveEmail () throws InterruptedException {
		  out.println(Thread.currentThread().getName() + " checking if there are emails");
		  lock.lock();
		  try {
				while (this.emails.isEmpty()) {
					 if (!open) return null;
					 out.println(Thread.currentThread().getName() + " Não tem email disponível na lista, entrando em modo de espera.");
					 condition.await();
				}
				return this.emails.poll();
		  } finally {
				lock.unlock();
		  }
	 }

	 public void close () {
		  lock.lock();
		  try {
				out.println(Thread.currentThread().getName() + "  Notificando todo mundo que não estamos mais pegando emails.");
				condition.signalAll();

		  } finally {
				lock.unlock();
		  }
	 }
}
