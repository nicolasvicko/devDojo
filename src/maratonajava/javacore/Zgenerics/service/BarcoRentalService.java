package maratonajava.javacore.Zgenerics.service;

import maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentalService {
	 private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Iate")));

	 public Barco buscarBarcosDisponivel(){
		  System.out.println("Buscando Barco disponível...");
		  Barco barco = barcosDisponiveis.remove(0);
		  System.out.println("ALugando Barco: "+barco);
		  System.out.println("Carros disponíveis para alugar");
		  System.out.println(barcosDisponiveis);
		  return barco;

	 }
	 public void retornarBarcoAlugado(Barco barco){
		  System.out.println("Devolvendo Barco " + barco);
		  barcosDisponiveis.add(barco);
		  System.out.println("Barco disponíveis para alugar: ");
		  System.out.println(barcosDisponiveis);
	 }

}
