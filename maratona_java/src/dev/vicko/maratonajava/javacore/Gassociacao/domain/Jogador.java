package dev.vicko.maratonajava.javacore.Gassociacao.domain;

public class Jogador {
	 private String nome;
	 private Time time;

	 public void imprime () {
		  System.out.println(this.nome);
		  if (time != null) {
				System.out.println(time.getNome());
		  }
	 }

	 // Constructor
	 public Jogador (String nome) {
		  this.nome = nome;
	 }

	 // End constructors

	 // Start Getters e Setters

	 public String getNome () {
		  return nome;
	 }

	 public void setNome (String nome) {
		  this.nome = nome;
	 }

	 public Time getTime () {
		  return time;
	 }

	 public void setTime (Time time) {
		  this.time = time;
	 }

	 // End Getters e Setters
}
