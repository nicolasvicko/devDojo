package dev.vicko.maratonajava.javacore.Zgenerics.service;

import dev.vicko.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.List;

public class RentalService<T> {
	 private List<T> objetosDisponiveis;
	 public RentalService (List<T> objetosDisponiveis) {
		  this.objetosDisponiveis = objetosDisponiveis;
	 }

	 public T buscarObjetoDisponivel(){
		  System.out.println("Buscando Objeto disponível...");
		  T t = objetosDisponiveis.remove(0);
		  System.out.println("Alugando objeto: "+ t);
		  System.out.println("Carros disponíveis para alugar");
		  System.out.println(objetosDisponiveis);
		  return t;

	 }
	 public void retornarObjetoAlugado(T t){
		  System.out.println("Devolvendo Objeto " + t);
		  objetosDisponiveis.add(t);
		  System.out.println("Objeto disponíveis para alugar: ");
		  System.out.println(objetosDisponiveis);
	 }
}
