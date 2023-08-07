package dev.vicko.maratonajava.javacore.Npolimorfismo.services;

import dev.vicko.maratonajava.javacore.Npolimorfismo.repository.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memória");
    }
}
