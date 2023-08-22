package dev.vicko.maratonajava.javacore.Xserializacao.domain;

import java.io.Serializable;

public class Aluno implements Serializable {
	 private Long id;
	 private String nome;
	 private String Password;

	 public Aluno (Long id, String nome, String password) {
		  this.id = id;
		  this.nome = nome;
		  Password = password;
	 }

	 public Long getId () {
		  return id;
	 }

	 public void setId (Long id) {
		  this.id = id;
	 }

	 public String getNome () {
		  return nome;
	 }

	 public void setNome (String nome) {
		  this.nome = nome;
	 }

	 public String getPassword () {
		  return Password;
	 }

	 public void setPassword (String password) {
		  Password = password;
	 }

	 @Override
	 public String toString () {
		  return "Aluno{" +
					 "id=" + id +
					 ", nome='" + nome + '\'' +
					 ", Password='" + Password + '\'' +
					 '}';
	 }
}
