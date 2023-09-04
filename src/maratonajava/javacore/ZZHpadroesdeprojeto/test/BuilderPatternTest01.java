package maratonajava.javacore.ZZHpadroesdeprojeto.test;

import maratonajava.javacore.ZZHpadroesdeprojeto.domain.Person;

public class BuilderPatternTest01 {
	 public static void main (String[] args) {
		  Person build = new Person.PersonBuilder()
					 .firstName("William")
					 .lastName("Suane")
					 .username("ViradoNoJiraya")
					 .email("william.suane@devdojo.academy")
					 .build();
		  System.out.println(build);

	 }





}
