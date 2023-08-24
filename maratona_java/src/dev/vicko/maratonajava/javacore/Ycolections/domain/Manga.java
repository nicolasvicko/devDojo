package dev.vicko.maratonajava.javacore.Ycolections.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
	 private Long id;
	 private String nome;
	 private double preco;

	 public Manga (Long id, String nome, double preco) {
		  Objects.requireNonNull(id, "Id não pode ser null");
		  Objects.requireNonNull(nome, "Nome não pode ser null");
		  this.id = id;
		  this.nome = nome;
		  this.preco = preco;
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

	 public double getPreco () {
		  return preco;
	 }

	 public void setPreco (double preco) {
		  this.preco = preco;
	 }

	 @Override
	 public String toString () {
		  return "Manga{" +
					 "id=" + id +
					 ", nome='" + nome + '\'' +
					 ", preco=" + preco +
					 '}';
	 }

	 @Override
	 public boolean equals (Object o) {
		  if (this == o) return true;
		  if (o == null || getClass() != o.getClass()) return false;
		  Manga manga = (Manga) o;
		  return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
	 }

	 @Override
	 public int hashCode () {
		  return Objects.hash(id, nome, preco);
	 }

	 @Override
	 public int compareTo (Manga outroManga) {
		  /*
		  negativo se o this < outroManga
		  se this == outroManga, return 0
		  positivo se o this > outroManga
		   */
		  return this.nome.compareTo(outroManga.getNome());

		 /* return Double.compare(preco, outroManga.getPreco());
		  return Double.valueOf(preco).compareTo(outroManga.getPreco());
		  return this.id.compareTo(outroManga.getId());*/
	 }
}
