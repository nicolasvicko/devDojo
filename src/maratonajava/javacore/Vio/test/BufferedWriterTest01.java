package maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferedWriterTest01 {
	 public static void main (String[] args) {


		  String caminho = "C:\\Users\\nicol\\IdeaProjects\\devDojo\\Arquivo\\file.txt";
		  File file = new File(caminho);

		  try (FileWriter fw = new FileWriter(file, true); BufferedWriter br = new BufferedWriter(fw)) {
				br.write("O DevDojo é o melhor curso do Brasillllllllllllllll ");
				br.newLine();
				br.flush();

		  } catch (IOException e) {
				e.printStackTrace();
		  }
	 }
}