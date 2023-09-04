package maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa {
    /*
    Quanto se sobreescreve um método, não obrigatoriamente precisa declarar as mesmas exceções
    que aquele método está declarando.
    A funcionalidade da sobreescrita que estou declarando pode ser muito diferente e pode não precisar
    lançar exceção.
     */
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("Salvando funcionário");
    }


}
