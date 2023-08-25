package dev.vicko.maratonajava.javacore.Ycolections.test;

import dev.vicko.maratonajava.javacore.Ycolections.domain.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
	 public static void main (String[] args) {

		  NavigableMap<String, String> map = new TreeMap<>();

		  map.put("A", "Letra A");
		  map.put("D", "Letra D");
		  map.put("B", "Letra B");
		  map.put("C", "Letra C");
		  map.put("E", "Letra E");

		  for (Map.Entry<String, String> entry : map.entrySet()) {
				System.out.println(entry.getKey()+" : "+entry.getValue());
		  }


		  System.out.println("---------");

		  	  /*
		  Lower <
		  Floor <=
		  Higher >
		  Ceiling >=
		   */

		  System.out.println(map.headMap("C", true));
		  System.out.println(map.ceilingEntry("C"));
		  System.out.println(map.higherEntry("C"));
		  System.out.println(map.lowerEntry("C"));
		  System.out.println(map.floorEntry("C"));

	 }
}
