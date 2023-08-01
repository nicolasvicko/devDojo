package dev.vicko.maratonajava.javacore.Aintroducaoclasses.test;

import dev.vicko.maratonajava.javacore.Aintroducaoclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor mestre = new Professor();

        mestre.nome = "Mestre Kami";
        mestre.idade = 140;
        mestre.sexo = 'M';

        System.out.println(mestre.nome + " " + mestre.idade + " " + mestre.sexo);
    }
}
