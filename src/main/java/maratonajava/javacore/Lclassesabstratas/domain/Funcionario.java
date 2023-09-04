package maratonajava.javacore.Lclassesabstratas.domain;

/*
Classes podem ser abstradas e sua finalidade é ser extendida.
Não pode usar ou construr qualquer objeto da classe abstrata( 'new()')

Final proibe a implementação não podendo extender as funcionaliades da classe.
abstract obriga a implementação

Uma classe abstrata dentro de outra classe abstrata não é obrigada a implementar os métodos abstratos.

 */
public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    public abstract void calculaBonus();

    /*
    Sobreescrita do método abstrato para concreto.
     */
    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }
}
