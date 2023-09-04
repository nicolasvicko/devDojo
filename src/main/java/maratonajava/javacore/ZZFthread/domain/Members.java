package maratonajava.javacore.ZZFthread.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import static java.lang.System.*;

public class Members {
	 private final Queue<String> emails = new ArrayBlockingQueue<>(10);
	 private boolean open = true;

	 public boolean isOpen () {
		  return open;
	 }

	 public int pendingEmails () {
		  synchronized (emails) {
				return emails.size();
		  }
	 }

	 public void addMemberEmail (String email) {
		  synchronized (this.emails) {
				String threadName = Thread.currentThread().getName();
				out.println(threadName + "Adicionou email na lista");
				this.emails.add(email);
				//Todo voltar quando a thread estiver esperando.
				this.emails.notifyAll();
		  }
	 }

	 public String retrieveEmail () throws InterruptedException {
		  out.println(Thread.currentThread().getName() + " checking if there are emails");
		  synchronized (this.emails) {
				while (this.emails.isEmpty()) {
					 if (!open) return null;
					 out.println(Thread.currentThread().getName() + " Não tem email disponível na lista, entrando em modo de espera.");
					 this.emails.wait();
				}
				return this.emails.poll();
		  }
	 }

	 public void close () {
		  open = false;
		  synchronized (this.emails) {
				out.println(Thread.currentThread().getName() + "  Notificando todo mundo que não estamos mais pegando emails.");

		  }
	 }
}
