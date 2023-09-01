package dev.vicko.maratonajava.javacore.ZZGconcorrencia.services;

import dev.vicko.maratonajava.javacore.ZZGconcorrencia.domain.Members;

import static java.lang.System.out;

public class EmailDeliveryService implements Runnable {
	 private final Members members;

	 public EmailDeliveryService (Members members) {
		  this.members = members;
	 }

	 @Override
	 public void run () {
		  String threadName = Thread.currentThread().getName();
		  out.println(threadName + " starting to deliver emails...");
		  while (members.isOpen() || members.pendingEmails() > 0) {
				try {
					 String email = members.retrieveEmail();
					 if (email == null) continue;
					 out.println(threadName +" Enviando email para"+email);
					 Thread.sleep(2000);
					 out.println(threadName + " enviou email com sucesso para "+email);
				} catch (InterruptedException e) {
					 throw new RuntimeException(e);
				}
		  }
		  out.println("Todos os emails foram enviados com sucesso!");
	 }
}
