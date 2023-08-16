package dev.vicko.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
	 public static void main (String[] args) {
		  String caminho = "C:\\Users\\nicol\\IdeaProjects\\devDojo\\Arquivo\\file.txt";
		  File file = new File(caminho);

		  try {

				boolean isCreated = file.createNewFile();
				System.out.println("Created " + isCreated);
				System.out.println("path " + file.getPath());
				System.out.println("path absolute " + file.getAbsolutePath());
				System.out.println("is directory ? " + file.isDirectory());
				System.out.println("is file ? " + file.isFile());
				System.out.println("is hidden ? " + file.isHidden());
				System.out.println("last modified " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
				boolean exists = file.exists();
				if (exists) {
					 boolean isDeleted = file.delete();
					 System.out.println("Deleted " + isDeleted);
				}
		  } catch (IOException e) {
				e.printStackTrace();
		  }


	 }
}