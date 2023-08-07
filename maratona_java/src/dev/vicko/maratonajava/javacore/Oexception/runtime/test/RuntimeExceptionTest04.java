package dev.vicko.maratonajava.javacore.Oexception.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException();

        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvesLanceException();
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void talvesLanceException () throws SQLException, IOException {
    }

}
