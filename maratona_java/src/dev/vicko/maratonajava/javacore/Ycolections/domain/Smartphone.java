package dev.vicko.maratonajava.javacore.Ycolections.domain;

public class Smartphone {
	 private String serialNumer;
	 private String marca;

	 public Smartphone (String serialNumer, String marca) {
		  this.serialNumer = serialNumer;
		  this.marca = marca;
	 }

	 public String getSerialNumer () {
		  return serialNumer;
	 }

	 public void setSerialNumer (String serialNumer) {
		  this.serialNumer = serialNumer;
	 }

	 public String getMarca () {
		  return marca;
	 }

	 public void setMarca (String marca) {
		  this.marca = marca;
	 }

	 // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null.
	 @Override
	 public boolean equals (Object obj) {
		  return super.equals(obj);
	 }
}
