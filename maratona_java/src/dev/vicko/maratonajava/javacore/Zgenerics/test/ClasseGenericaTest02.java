package dev.vicko.maratonajava.javacore.Zgenerics.test;

import dev.vicko.maratonajava.javacore.Zgenerics.domain.Barco;
import dev.vicko.maratonajava.javacore.Zgenerics.domain.Carro;
import dev.vicko.maratonajava.javacore.Zgenerics.service.BarcoRentalService;
import dev.vicko.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
	 public static void main (String[] args) {
		  BarcoRentalService barcoRentalService= new BarcoRentalService();
		  Barco barco = barcoRentalService.buscarBarcosDisponivel();
		  System.out.println("Usando o carro por um mês...  ");
		  barcoRentalService.retornarBarcoAlugado(barco);
	 }
}
