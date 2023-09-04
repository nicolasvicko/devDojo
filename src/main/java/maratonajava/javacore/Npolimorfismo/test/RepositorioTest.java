package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.repository.Repositorio;
import maratonajava.javacore.Npolimorfismo.services.RepositorioBancoDeDados;
import maratonajava.javacore.Npolimorfismo.services.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
    }
}
