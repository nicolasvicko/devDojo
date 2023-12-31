package maratonajava.javacore.ZZFthread.test;

import maratonajava.javacore.ZZFthread.domain.Members;
import maratonajava.javacore.ZZFthread.services.EmailDeliveryService;

import javax.swing.*;
/*
Wait, notify e notifyAll
Precisam estar dentro de um Syncronized para ter o lock.
 */
public class EmailDeliveryTest01 {
	 public static void main (String[] args) {
		  Members members = new Members();
		  Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
		  Thread kakashi = new Thread(new EmailDeliveryService(members), "Kakashi");
		  Thread pain = new Thread(new EmailDeliveryService(members), "Pain");
		  Thread naruto = new Thread(new EmailDeliveryService(members), "Naruto");

		  jiraya.start();
		  kakashi.start();
		  pain.start();
		  naruto.start();

		  while (true) {
				String email = JOptionPane.showInputDialog("Entre com seu email");
				if (email == null || email.isEmpty()) {
					 members.close();
					 break;
				}
				members.addMemberEmail(email);
		  }
	 }
}
