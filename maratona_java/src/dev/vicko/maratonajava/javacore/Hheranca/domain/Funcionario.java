package dev.vicko.maratonajava.javacore.Hheranca.domain;

public class Funcionario extends Pessoa {
	 private double salario;


	 /*
	 Ao adicionar construtor na classe mãe, obrigatoriamente precisamos implementar esse construtor em todas as classes filhas.
	 Chamar o super() sem argumentos não precisa. essa chamada é implícita.
	  */
	 public Funcionario (String nome) {
		  super(nome);
	 }

	 public void  imprime(){
		  super.imprime();
		  System.out.println(this.salario);

	 }

	 public void relatorioPagamento(){
		  System.out.println("Eu " +this.nome+ "recebi o salário de " +this.salario);
	 }



	 public double getSalario () {
		  return salario;
	 }

	 public void setSalario (double salario) {
		  this.salario = salario;
	 }
}
