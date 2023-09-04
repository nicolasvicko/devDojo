package maratonajava.javacore.Aintroducaoclasses.domain;

public class Carro {
    // Atributos (características) do carro
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double velocidadeAtual;
    private boolean ligado;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0.0;
        this.ligado = false;
    }

    // Métodos (comportamentos) do carro
    public void ligar() {
        ligado = true;
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O carro está desligado.");
    }

    public void acelerar(double quantidade) {
        if (ligado) {
            velocidadeAtual += quantidade;
            System.out.println("Acelerando. Velocidade atual: " + velocidadeAtual + " km/h");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }

    public void frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual = 0;
            System.out.println("O carro está parado.");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
        System.out.println("Estado do carro: " + (ligado ? "Ligado" : "Desligado"));
    }

    // Método getter para obter a marca do carro
    public String getMarca() {
        return marca;
    }

    // Método setter para definir a marca do carro
    public void setMarca(String marca) {
        this.marca = marca;
    }
}


