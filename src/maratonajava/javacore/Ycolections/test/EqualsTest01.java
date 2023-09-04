package maratonajava.javacore.Ycolections.test;

import maratonajava.javacore.Ycolections.domain.Smartphone;

public class EqualsTest01 {
	 public static void main (String[] args) {
		  String nome = "William Suane";
		  String nome2 ="William Suane";

		  System.out.println(nome == nome2);

		  String nome3 = "William Suane";
		  String nome4 = new String("William Suane");
		  System.out.println(nome3 == nome4);
		  System.out.println(nome3.equals(nome4));

		  Smartphone s1 = new Smartphone("1ABC1", "Iphone");
		  Smartphone s2 = new Smartphone("1ABC1", "Iphone");
		  System.out.println(s1.equals(s2));


		  Smartphone s3 = new Smartphone("1ABC1", "Iphone");
		  Smartphone s4 = s3;
		  System.out.println(s3.equals(s4));



	 }
}
