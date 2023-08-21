package dev.vicko.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
	 public static void main (String[] args) {

		  Path dir = Paths.get("/home/william");
		  Path clazz = Paths.get("/home/william/devdojoboladao/Olamundo.java");
		  Path pathToClazz = dir.relativize(clazz);
		  System.out.println(pathToClazz);

		  Path absoluto1 = Paths.get("/home/william");
		  Path absoluto2 = Paths.get("/user/local");
		  Path absoluto3 = Paths.get("/home/william/devDojo/OlaMundo.java");
		  Path relative1 = Paths.get("temp");
		  Path relative2 = Paths.get("temp/temp.2021921");

		  System.out.println("1 "+absoluto1.relativize(absoluto3));
		  System.out.println("2 "+absoluto3.relativize(absoluto1));
		  System.out.println("3 "+absoluto1.relativize(absoluto2));
		  System.out.println("4 "+relative1.relativize(relative2));

	 }
}
