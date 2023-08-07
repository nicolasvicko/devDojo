package dev.vicko.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
        abreConexao2();

    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados do arquivo");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recursos liberados pelo SO");
        }
        return null;


    }public static String abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados do arquivo");
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recursos liberados pelo SO");
        }
        return null;


    }
}
