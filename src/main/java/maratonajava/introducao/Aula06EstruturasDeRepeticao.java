package maratonajava.introducao;

import java.util.ArrayList;
import java.util.List;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        int count = 0;
        while (count<10) {
            System.out.println("Dentro do While " + ++count);
        }
        System.out.println("-----------------------------------");
        do{
            System.out.println("Dentro do Do-while " + --count);
        } while (count>0);


        for (int i=0;i<0;i++){
            System.out.println("for "+1);
        }

        List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Carol");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}
