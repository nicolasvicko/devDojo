package dev.vicko.maratonajava.javacore.Ycolections.test;

import dev.vicko.maratonajava.javacore.Ycolections.domain.Smartphone;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
	 public static void main (String[] args) {
		  Smartphone s1 = new Smartphone("1ABC1", "Iphone");
		  Smartphone s2 = new Smartphone("22222", "Pixel");
		  Smartphone s3 = new Smartphone("33333", "Samsung");

		  List<Smartphone> smartphone = new ArrayList<>(6);

		  smartphone.add(s1);
		  smartphone.add(s2);
		  smartphone.add(0, s3);

		  for (Smartphone smartphoneList : smartphone) {
				System.out.println(smartphoneList);
		  }

		  Smartphone s4 = new Smartphone("22222", "Pixel");
		  System.out.println(smartphone.contains(s4));
		  int indexSmartphone4 = smartphone.indexOf(s4);
		  System.out.println(smartphone.get(indexSmartphone4));
	 }
}
