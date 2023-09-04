package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
	 public static void main (String[] args) {
		  criarArrayComUmObjeto(new Barco("Canoa Marota"));

	 }

	 private static <T> List<T> criarArrayComUmObjeto(T t){
		  return List.of(t);
	 }

	/* private static <T extends Comparable>  List<T> criarArrayComUmObjeto(T t){
		  return List.of(t);
	 }*/
}

