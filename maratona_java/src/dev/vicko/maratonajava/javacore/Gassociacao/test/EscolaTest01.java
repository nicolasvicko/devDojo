package dev.vicko.maratonajava.javacore.Gassociacao.test;

import dev.vicko.maratonajava.javacore.Gassociacao.domain.Escola;
import dev.vicko.maratonajava.javacore.Gassociacao.domain.Professor;

public class EscolaTest01 {
	 public static void main (String[] args) {
		  Professor jirayaSensei = new Professor("Jiraya Sensei");
		  Professor KakashiSensei = new Professor("Kakashi Sensei");
		  Professor[] listaDeProfessores = {jirayaSensei,KakashiSensei};
		  Escola konoha = new Escola("Konoha", listaDeProfessores);

		  konoha.imprime();
	 }
}
