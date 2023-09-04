package maratonajava.javacore.ZZAclassesinternas.test;

import maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
	 public static void main (String[] args) {
		  List<Barco> barcoList = new java.util.ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
		  barcoList.sort(new Comparator<Barco>() {
				@Override
				public int compare (Barco o1, Barco o2) {
					return o1.getNome().compareTo(o2.getNome());
				}
		  });
	 }
}
