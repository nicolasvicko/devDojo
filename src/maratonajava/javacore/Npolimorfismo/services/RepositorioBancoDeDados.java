package maratonajava.javacore.Npolimorfismo.services;

import maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no Banco de dados");
    }
}
