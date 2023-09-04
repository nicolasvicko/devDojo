package maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("Salvando Pessoa");
    }
}
