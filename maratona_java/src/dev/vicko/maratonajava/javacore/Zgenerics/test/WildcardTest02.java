package dev.vicko.maratonajava.javacore.Zgenerics.test;


import java.util.List;

public class WildcardTest02 {
	 public static void main (String[] args) {
		  List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
		  List<Gato> gatos = List.of(new Gato(), new Gato());
		  printConsulta(cachorros);
		  printConsulta(gatos);


	 }

	 private static void printConsulta (List<? extends Animal> animals) {
		  /*
		  Se eu passar uma lista de cachorro, não posso passar gato. e vice-versa.
		  Aqui eu não sei o que vai vir de subclasse e pode ter problema com os irmãos(subclasses com o mesmo super)
		   */
		  for (Animal animal : animals) {
				animal.consulta();
		  }
	 }

	 private static void printConsultaAnimal(List<? super Animal> animals){
		  /*
		  Aqui posso adicionar qualquer uma das subclasses porque tenho garantia do polimorfismo. E passam no teste é um(Animal)
		   */
		  for (Object o : animals) {
				System.out.println(o);
		  }

	 }
}
