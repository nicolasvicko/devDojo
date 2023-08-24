package dev.vicko.maratonajava.javacore.Ycolections.test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
	 public static void main (String[] args) {
		  List<String> nomes = new ArrayList(16);
		  nomes.add("William");
		  nomes.add("DevDojo Academy");

		  for (String nome : nomes) {
				System.out.println(nome);
		  }

		  nomes.add("Suane");
		  System.out.println("---------------");

		  for (int i = 0; i < nomes.size(); i++) {
				System.out.println(nomes.get(i));

		  }



	 }
}
