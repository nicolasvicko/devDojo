package dev.vicko.maratonajava.javacore.Ycolections.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
	 public static void main (String[] args) {
		  Map<String, String> map = new HashMap<>();

		  map.put("Teklado", "teclado");
		  map.put("mouze", "mouse");
		  map.put("vc", "você");

		  map.putIfAbsent("vc2", "você");

		  System.out.println(map);

		  System.out.println("---------1-----------");

		  for (String key : map.keySet()) {
				System.out.println(key+ " : "+map.get(key));
		  }

		  System.out.println("---------2-----------");

		  for (String value : map.values()) {
				System.out.println(value);
		  }

		  System.out.println("---------3-----------");
		  for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
				System.out.println(stringStringEntry);
		  }


	 }
}
