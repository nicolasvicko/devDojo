package maratonajava.javacore.Ycolections.test;

import maratonajava.javacore.Ycolections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

	 @Override
	 public int compare (Manga manga1, Manga manga2) {
		  return manga1.getId().compareTo(manga2.getId());
	 }
}

public class MangaSortTest01 {
	 public static void main (String[] args) {
		  List<Manga> mangas = new ArrayList<>(6);
		  mangas.add(new Manga(5L, "Hellsing Ultimate", 19.9));
		  mangas.add(new Manga(1L, "Beserk", 9.5));
		  mangas.add(new Manga(4L, "Pokemon", 3.2));
		  mangas.add(new Manga(3L, "Attack on Titan", 11.20));
		  mangas.add(new Manga(2L, "Dragon Ball Z", 2.99));

		  // Por ordem de inserção
		  for (Manga manga : mangas) {
				System.out.println(manga);
		  }

		  Collections.sort(mangas);
		  System.out.println(("----------"));

		  // Ordenado por nome
		  for (Manga manga : mangas) {
				System.out.println(manga);
		  }

		  //Collections.sort(mangas, new MangaByIdComparator());
		  mangas.sort(new MangaByIdComparator());
		  System.out.println(("----------"));
		  // Ordenado por ID
		  for (Manga manga : mangas) {
				System.out.println(manga);
		  }

	 }
}
