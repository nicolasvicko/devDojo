package dev.vicko.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
	 private String nome;
	 public static final double VELOCIDADE_LIMITE = 250;
	 /*
	 Usando O final, a referência para o objeto comprador nunca poderá ser alterada.
	 porém. os dados(atributos) do objeto podem ser alterados.
	  */
	 public final Comprador COMPRADOR = new Comprador();

	 public final void imprime(){
		  System.out.println(this.nome);
	 }

	 public String getNome () {
		  return nome;
	 }

	 public void setNome (String nome) {
		  this.nome = nome;
	 }


}
