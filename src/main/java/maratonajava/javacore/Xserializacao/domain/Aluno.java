package maratonajava.javacore.Xserializacao.domain;

import java.io.*;

public class Aluno implements Serializable {
	 private static final long serialVersionUID = -6601664530645254850L;
	 private Long id;
	 private String nome;
	 private transient String Password;
	 private static final String NOME_ESCOLA = "DevDojo Viradão no Jiraya";
	 private transient Turma turma;

	 public Aluno (Long id, String nome, String password, Turma turma) {
		  this.id = id;
		  this.nome = nome;
		  Password = password;
		  this.turma = turma;
	 }

	 public Aluno (long id, String williamSuane, String number) {
	 }

	  //@Serial introduzido na versão 14
	 private void writeObject (ObjectOutputStream oos) {
		  try {
				oos.defaultWriteObject();
				oos.writeUTF(turma.getNome());
		  } catch (IOException e) {
				e.printStackTrace();
		  }
	 }

	  //@Serial introduzido na versão 14
	 private void readObject (ObjectInputStream ois) {
		  try {
				ois.defaultReadObject();
				String nomeTurma = ois.readUTF();
				turma = new Turma(nomeTurma);
		  } catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
		  }
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

	 public Turma getTurma () {
		  return turma;
	 }

	 public void setTurma (Turma turma) {
		  this.turma = turma;
	 }

	 @Override
	 public String toString () {
		  return "Aluno{" +
					 "id=" + id +
					 ", nome='" + nome + '\'' +
					 ", Password='" + Password + '\'' +
					 ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
					 ", Turma='" + turma + '\'' +
					 '}';
	 }
}
