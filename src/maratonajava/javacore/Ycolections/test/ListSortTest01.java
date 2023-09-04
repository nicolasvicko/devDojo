package maratonajava.javacore.Ycolections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
	 public static void main (String[] args) {
		  List<String> mangas = new ArrayList<>(6);
		  mangas.add("Beserk");
		  mangas.add("Hellsing Ultimate");
		  mangas.add("Pokemon");
		  mangas.add("Dragon Ball Z");
		  mangas.add("Attack on Titan");

		  Collections.sort(mangas);

		  List<Double> dinheiros = new ArrayList<>();
		  dinheiros.add(100.21);
		  dinheiros.add(23.98);
		  dinheiros.add(21.21);
		  dinheiros.add(98.10);

		  Collections.sort(dinheiros);

		  for (String manga : mangas) {
				System.out.println(manga);
		  }

		  for (Double dinheiro : dinheiros) {
				System.out.println(dinheiro);
		  }


	 }
}
