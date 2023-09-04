package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro possante = new Carro("Ford","Ecosport", 2023,"Vermelho");

        possante.exibirInformacoes();


        System.out.println("-----------------------");

        possante.setMarca("Toyota");
        possante.setModelo("Corolla");
        possante.setAno(2019);
        possante.setCor("verde Limão");
        possante.setVelocidadeAtual(110);
        possante.setLigado(true);

        possante.exibirInformacoes();
    }





}
