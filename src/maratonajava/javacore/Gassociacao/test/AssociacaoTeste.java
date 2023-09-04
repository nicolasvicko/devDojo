package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.domain.Aluno;
import maratonajava.javacore.Gassociacao.domain.Local;
import maratonajava.javacore.Gassociacao.domain.Professor;
import maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTeste {

	 public static void main (String[] args) {
		  Local local = new Local("Rua das Laranjeiras");
		  Aluno aluno = new Aluno("luffy", 17);
		  Professor professor = new Professor("Barba Branca", "Pirata");
		  Aluno[] alunosParaSeminario = {aluno};

		  Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);

		  Seminario[] seminariosDisponiveis = {seminario};

		  professor.setSeminarios(seminariosDisponiveis);

		  professor.imprime();
	 }
}
