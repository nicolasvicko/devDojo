package dev.vicko.maratonajava.javacore.Gassociacao.domain;

public class Local {
	 private String endereco;

	 public String getEndereco () {
		  return endereco;
	 }

	 public void setEndereco (String endereco) {
		  this.endereco = endereco;
	 }

	 public Local (String endereco) {
		  this.endereco = endereco;
	 }
}
