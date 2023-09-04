package maratonajava.javacore.Zgenerics.service;

import maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
	 private List<Carro> carrosDisponíveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));

	 public Carro buscarCarroDisponivel(){
		  System.out.println("Buscando carro disponível...");
		  Carro carro = carrosDisponíveis.remove(0);
		  System.out.println("ALugando carro: "+carro);
		  System.out.println("Carros disponíveis para alugar");
		  System.out.println(carrosDisponíveis);
		  return carro;

	 }
	 public void retornarCarroAlugado(Carro carro){
		  System.out.println("Devolvendo carro " + carro);
		  carrosDisponíveis.add(carro);
		  System.out.println("Carro disponíveis para alugar: ");
		  System.out.println(carrosDisponíveis);
	 }

}
