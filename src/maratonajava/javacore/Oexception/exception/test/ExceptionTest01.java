package maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() {
        File file = new File("Arquivo/teste01.txt");
        try {
           boolean isCriado=  file.createNewFile();
            System.out.println("Arquivo "+isCriado + " criado.");
        } catch (IOException e) {
            System.out.println("deu erro");
            e.printStackTrace();

        }
    }
}
