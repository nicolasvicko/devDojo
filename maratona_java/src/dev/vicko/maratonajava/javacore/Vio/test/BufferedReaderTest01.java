package dev.vicko.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
	 public static void main (String[] args) {
		  String caminho = "C:\\Users\\nicol\\IdeaProjects\\devDojo\\Arquivo\\file.txt";
		  File file = new File(caminho);


		  try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
				String linha;
				while ((linha = br.readLine()) != null){
					 System.out.println(linha);
				}

		  } catch (IOException e) {
				e.printStackTrace();
		  }
	 }
}
