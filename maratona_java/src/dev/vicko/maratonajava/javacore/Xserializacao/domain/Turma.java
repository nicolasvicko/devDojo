package dev.vicko.maratonajava.javacore.Xserializacao.domain;

public class Turma {
	 private String nome;

	 public String getNome () {
		  return nome;
	 }

	 public void setNome (String nome) {
		  this.nome = nome;
	 }

	 public Turma (String nome) {
		  this.nome = nome;
	 }

	 @Override
	 public String toString () {
		  return "Turma{" +
					 "nome='" + nome + '\'' +
					 '}';
	 }
}