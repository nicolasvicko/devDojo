package maratonajava.javacore.ZZAclassesinternas.test;


//Classe externa
public class OuterClassesTest01{
	 private String name = "Monkey D. Luffy";

	 //Classe interna
	 class Inner {
		  public void printOuterClassAttribute () {
				System.out.println(name);
				System.out.println(this);
				System.out.println(OuterClassesTest01.this);
		  }
	 }


	 public static void main (String[] args) {
		  //Criando um objeto da classe externa.
		  OuterClassesTest01 outerClass = new OuterClassesTest01();
		  // Criando um objeto da classe interna a partir da classe externa criada.
		  Inner inner = outerClass.new Inner();
		  inner.printOuterClassAttribute();

		  // Instanciando a classe interna sem precisar criar um objeto da classe externa
		  Inner inner2 = new OuterClassesTest01().new Inner();
		  inner2.printOuterClassAttribute();





	 }
}
