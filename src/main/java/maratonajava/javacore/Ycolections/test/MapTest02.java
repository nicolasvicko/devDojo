package maratonajava.javacore.Ycolections.test;

import maratonajava.javacore.Ycolections.domain.Consumidor;
import maratonajava.javacore.Ycolections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
	 public static void main (String[] args) {
		  Consumidor consumidor1 = new Consumidor("William Suane");
		  Consumidor consumidor2 = new Consumidor("DevDojo Academy");

		  Manga manga1 = new Manga(5L, "Hellsing Ultimate", 19.9);
		  Manga manga2 = new Manga(1L, "Beserk", 9.5);
		  Manga manga3 = new Manga(4L, "Pokemon", 3.2);
		  Manga manga4 = new Manga(3L, "Attack on Titan", 11.20);
		  Manga manga5 = new Manga(2L, "Dragon Ball Z", 2.99);


		  Map<Consumidor, Manga> consumidorManga = new HashMap<>();

		  consumidorManga.put(consumidor1, manga1);
		  consumidorManga.put(consumidor2, manga4);

		  for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
				System.out.println(entry);
				System.out.println(entry.getKey().getNome() + " - "+entry.getValue().getNome());
		  }


	 }
}
