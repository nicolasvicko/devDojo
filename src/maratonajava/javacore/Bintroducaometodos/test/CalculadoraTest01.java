package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest01 {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println("Somando dois números: ");
        //*calculadora.somaDoisNumeros();
        System.out.println("Subtraindo dois números");
        //* calculadora.subtraiDoisNumeros();
        System.out.println("Multiplicando dois números:");
        calculadora.multiplicaDoisNumeros(25, 4);
        System.out.println("Dividindo dois números :");
        calculadora.divideDoisNumeros(20, 4);

        System.out.println("Finalizando a CalculadoraTest01");


    }


}
