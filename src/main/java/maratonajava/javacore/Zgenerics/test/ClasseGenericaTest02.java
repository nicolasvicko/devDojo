package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.domain.Barco;
import maratonajava.javacore.Zgenerics.domain.Carro;
import maratonajava.javacore.Zgenerics.service.BarcoRentalService;
import maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
	 public static void main (String[] args) {
		  BarcoRentalService barcoRentalService= new BarcoRentalService();
		  Barco barco = barcoRentalService.buscarBarcosDisponivel();
		  System.out.println("Usando o carro por um mês...  ");
		  barcoRentalService.retornarBarcoAlugado(barco);
	 }
}
