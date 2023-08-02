package dev.vicko.maratonajava.javacore.Gassociacao.domain;

public class Time {
	 private String nome;


	 public void imprime(){
		  System.out.println(this.nome);
	 }

	 public Time (String nome) {
		  this.nome = nome;
	 }

	 public String getNome () {
		  return nome;
	 }

	 public void setNome (String nome) {
		  this.nome = nome;
	 }
}
