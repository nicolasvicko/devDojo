package dev.vicko.maratonajava.javacore.Hheranca.test;

import dev.vicko.maratonajava.javacore.Hheranca.domain.Funcionario;

public class HerancaTest02 {
	 /*  Etapas de criação de um objeto:
		  0 - Bloco de inicialização estático da super classe é excutado quando o JVM carregar a classe filha;
		  1 - Bloco de inicialização estático da sub classe é executado;
		  2 - Alocado espaço em memória pro objeto da classe pai
		  3 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe pai;
		  4 - Bloco de inicialização da superClasse (pai) é executado na ordem em que aparece;
		  5 - Construtor da superClasse é executado.
		  6 - Alocado espaço em memória pro objeto da subClasse
		  7 - Cada atributo de subClasse é criado e inicializado com valores default ou o que for passado da subClasse;
		  8 - Bloco de inicialização da subClasse é executado na ordem em que aparece;
		  9 - Construtor da subClasse é executado.
	  */
	 //Blocos de inicialização se coloca no começo depois dos atributos e antes dos construtores.
	 public static void main (String[] args) {
		  Funcionario funcionario = new Funcionario("Jiraya");
	 }
}
