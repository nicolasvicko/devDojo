package dev.vicko.maratonajava.javacore.Jmodificadorfinal.test;

import dev.vicko.maratonajava.javacore.Jmodificadorfinal.domain.Carro;

public class CarroTest01 {
	 public static void main (String[] args) {
		  Carro carro = new Carro();


		  System.out.println(Carro.VELOCIDADE_LIMITE);
		  System.out.println(carro.COMPRADOR);
		  /*Alterando o nome do carro.COMPRADOR
		   Variáveis do tipo referência como são finais o que não posso alterar é
		  a referência para o objeto.
		  */
		  carro.COMPRADOR.setNome("Kuririn");
		  System.out.println(carro.COMPRADOR);

	 }
}
