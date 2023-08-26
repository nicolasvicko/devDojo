package dev.vicko.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
	 public void walk(){
		  System.out.println("Animal walking");
	 }
}
class Cachorro extends Animal{
	 @Override
	 public void walk () {
		  System.out.println("Cachorro andando");
	 }
}

public class AnonymousClassesTest01 {
	 public static void main (String[] args) {
		  Animal animal = new Animal(){ //Criando subclasse anonima que só vai existir na referência 'animal' chamando pelo método 'animal.walk()'
				@Override
				public void walk () {
					 System.out.println("Walking in the shadows");
				}
		  };
		  animal.walk();

	 }
}
