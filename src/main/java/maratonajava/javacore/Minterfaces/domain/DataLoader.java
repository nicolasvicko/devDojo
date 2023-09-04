package maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    // Todos os atributos em uma interface são constantes.
    public static final int MAX_DATA_SIZE = 10;
    public abstract void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMAzDataSize na interface");
    }

}
