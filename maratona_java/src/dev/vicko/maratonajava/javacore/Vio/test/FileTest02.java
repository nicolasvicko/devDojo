package dev.vicko.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
	 public static void main (String[] args) throws IOException {

		  File fileDiretorio =new File("Arquivo2");
		  boolean isDiretorioCriado = fileDiretorio.mkdir();
		  System.out.println("Pasta criada ? " +isDiretorioCriado);

		  File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.text");
		  boolean isFileCreated = fileArquivoDiretorio.createNewFile();
		  System.out.println("Arquivo criado ? " + isFileCreated);

		  File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
		  boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
		  System.out.println("Arquivo foi renomeado ? "+isRenamed);

		  File diretorioRenamed = new File("Arquivo3");
		  boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
		  System.out.println("Pasta foi renomeada ? "+isDiretorioRenomeado);
	 }
}
