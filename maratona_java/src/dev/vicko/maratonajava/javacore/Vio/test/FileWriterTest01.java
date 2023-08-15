package dev.vicko.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
	 public static void main (String[] args) {
		  String caminho = "C:\\Users\\nicol\\IdeaProjects\\devDojo\\Arquivo\\file.txt";
		  File file = new File(caminho);

		  try(FileWriter fw = new FileWriter(file, true)) {
				fw.write("O DevDojo é o melhor curso do Brasillllllllllllllll\nContinuando a cantoria na proxima linha\n");
				fw.flush();

		  } catch (IOException e) {
				e.printStackTrace();
		  }
	 }
}
