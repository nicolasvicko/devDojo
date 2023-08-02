package dev.vicko.maratonajava.javacore.Gassociacao.test;

import dev.vicko.maratonajava.javacore.Gassociacao.domain.Jogador;

public class JogadorTest01 {
	 public static void main (String[] args) {
		  Jogador jogador1 = new Jogador("Pelé");
		  Jogador jogador2 = new Jogador("Romário");
		  Jogador jogador3 = new Jogador("Cafú");

		  Jogador[] listaJogadores = {jogador1, jogador2, jogador3};

		  for (Jogador listaJogador : listaJogadores) {
				listaJogador.imprime();
		  }


	 }
}
