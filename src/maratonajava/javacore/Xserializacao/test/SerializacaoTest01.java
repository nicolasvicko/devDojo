package maratonajava.javacore.Xserializacao.test;

import maratonajava.javacore.Xserializacao.domain.Aluno;
import maratonajava.javacore.Xserializacao.domain.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
	 public static void main (String[] args) {
		  Aluno aluno = new Aluno(1L, "William Suane", "1235656131");
		  Turma turma = new Turma("Maratona Java virado no jiraya em breve ricos");
		  aluno.setTurma(turma);
		  serializar(aluno);
		  deserializar();

	 }

	 private static void serializar (Aluno aluno) {
		  Path path = Paths.get("pasta/aluno.ser");
		  try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
				oos.writeObject(aluno);
		  } catch (IOException e) {
				e.printStackTrace();
		  }
	 }

	 private static void deserializar () {
		  Path path = Paths.get("pasta/aluno.ser");
		  try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
				Aluno aluno = (Aluno) ois.readObject();
				System.out.println(aluno);
		  } catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
		  }
	 }
}
