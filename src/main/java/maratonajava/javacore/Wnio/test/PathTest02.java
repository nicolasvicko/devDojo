package maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
	 public static void main (String[] args) throws IOException {
		  Path pastaPath = Paths.get("Arquivo");
		  if (Files.notExists(pastaPath)) {
				Path pastaDirectory = Files.createDirectory(pastaPath);
				System.out.println("Diretorio Criado com Sucesso!");
		  }else {
				System.out.println("Diretorio já Existe");
		  }
		  Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
		  Path subPastaDirectory = Files.createDirectories(subPastaPath);


		  Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
		  if (Files.notExists(filePath)){
				Path fileCreated = Files.createFile(filePath);
				System.out.println("Arquivo Criado com Sucesso!");
		  }else {
				System.out.println("Arquivo já Existe");
		  }


		  Path source = filePath;
		  Path target = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
		  Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);




	 }
}
