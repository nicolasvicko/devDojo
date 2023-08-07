package dev.vicko.maratonajava.javacore.Npolimorfismo.test;

import dev.vicko.maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import dev.vicko.maratonajava.javacore.Npolimorfismo.services.RepositorioBancoDeDados;
import dev.vicko.maratonajava.javacore.Npolimorfismo.services.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
    }
}
