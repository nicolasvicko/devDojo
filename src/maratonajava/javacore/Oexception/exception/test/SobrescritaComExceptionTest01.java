package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.domain.Funcionario;
import maratonajava.javacore.Oexception.exception.domain.LoginInvalidoException;
import maratonajava.javacore.Oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
        } catch (LoginInvalidoException | IOException e) {
            throw new RuntimeException(e);
        }

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
