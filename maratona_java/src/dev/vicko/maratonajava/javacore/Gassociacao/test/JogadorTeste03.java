package dev.vicko.maratonajava.javacore.Gassociacao.test;

import dev.vicko.maratonajava.javacore.Gassociacao.domain.Jogador;
import dev.vicko.maratonajava.javacore.Gassociacao.domain.Time;

public class JogadorTeste03 {
	 public static void main (String[] args) {
		  Jogador cafu = new Jogador("Cafu");
		  Jogador pele = new Jogador("Pelé");
		  Time brasil = new Time("Brasil");
		  Jogador[] listaDeJogares = {cafu, pele};

		  cafu.setTime(brasil);
		  pele.setTime(brasil);

		  brasil.setJogadores(listaDeJogares);

		  System.out.println("--- Início da Lista de Jogadores ---");

		  for (Jogador listaDeJogare : listaDeJogares) {
				System.out.println(listaDeJogare.getNome());
		  }
		  System.out.println("--- Fim da Lista de Jogadores ---");

		  System.out.println("--- Lista de Time ---");
		  for (Jogador brasilJogadores : brasil.getJogadores()) {
				System.out.println(brasilJogadores.getNome());
		  }
		  System.out.println("--- Fim da lista de Time ---");

	 }
}
