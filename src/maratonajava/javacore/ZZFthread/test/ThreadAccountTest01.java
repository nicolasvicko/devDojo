package maratonajava.javacore.ZZFthread.test;

import maratonajava.javacore.ZZFthread.domain.Account;

public class ThreadAccountTest01 implements Runnable {
	 private final Account account = new Account();


	 public static void main (String[] args) {
		  ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
		  Thread t1 = new Thread(threadAccountTest01, "Hestia");
		  Thread t2 = new Thread(threadAccountTest01, "Bell Cranel");

		  t1.start();
		  t2.start();


	 }

	 @Override
	 public void run () {
		  for (int i = 0; i < 5; i++) {
				withdrawal();
				if (account.getBalance() < 0) {
					 System.out.println("Deu ruim...");
				}
		  }
	 }

	 private void withdrawal () {
		  System.out.println(getThreadName() + " ###########Fora do synchronized");
		  synchronized (account) {
				System.out.println(getThreadName() + " dentro do synchronized");
				if (account.getBalance() >= 10) {
					 System.out.println(getThreadName() + "Está indo sacar dinheiro");
					 account.withdrawal(10);
					 System.out.println(getThreadName() + "Completou o saque, valor atual da conta:  " + account.getBalance());
				} else {
					 System.out.println("Sem dinheiro para " + getThreadName() + "efetuar o saque " + account.getBalance());
				}
		  }
	 }

	 private static String getThreadName () {
		  return Thread.currentThread().getName();
	 }
}
