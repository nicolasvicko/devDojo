package dev.vicko.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
	 private String nome;
	 private double velocidadeMaxima;

	 /*
	 Atributo estático não pertence mais a uma instância de um objeto criada pelo construtor.
	 Static agora pertence a classe. E toda instância criada vai ter o mesmo valor.
	 E ao alterar um valor Static, vai ser alterado para todas as instâncias criadas.
	 O atributo static pertence a classe e todos os objetos vão fazer referência ao mesmo valor.
	  */
	 public static double velocidadeLimite = 250;

	 public Carro (String nome, double velocidadeMaxima) {
		  this.nome = nome;
		  this.velocidadeMaxima = velocidadeMaxima;

	 }

	 public void imprime () {
		  System.out.println("-------------");
		  System.out.println(this.nome);
		  System.out.println(this.velocidadeMaxima);
		  System.out.println(Carro.velocidadeLimite);
	 }

	 public String getNome () {
		  return nome;
	 }

	 public void setNome (String nome) {
		  this.nome = nome;
	 }

	 public double getVelocidadeMaxima () {
		  return velocidadeMaxima;
	 }

	 public void setVelocidadeMaxima (double velocidadeMaxima) {
		  this.velocidadeMaxima = velocidadeMaxima;
	 }

	 ;
}