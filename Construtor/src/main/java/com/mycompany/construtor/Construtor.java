package com.mycompany.construtor;

// Classe Exemplo
class Exemplo {
    // Atributos da classe
    private int valorInteiro;
    private String valorString;

    // Construtor padrão
    public Exemplo() {
        this.valorInteiro = 0;
        this.valorString = "Padrão";
    }

    // Construtor com um parâmetro
    public Exemplo(int valorInteiro) {
        this.valorInteiro = valorInteiro;
        this.valorString = "Personalizado";
    }

    // Construtor com dois parâmetros
    public Exemplo(int valorInteiro, String valorString) {
        this.valorInteiro = valorInteiro;
        this.valorString = valorString;
    }

    // Método para exibir os valores
    public void exibirValores() {
        System.out.println("Valor Inteiro: " + valorInteiro);
        System.out.println("Valor String: " + valorString);
    }
}

// Classe principal (Main)
public class Construtor {
    public static void main(String[] args) {
        // Criando instâncias da classe Exemplo com diferentes construtores
        Exemplo exemploPadrao = new Exemplo();
        Exemplo exemploComInteiro = new Exemplo(42);
        Exemplo exemploComAmbos = new Exemplo(100, "Personalizado");

        // Exibindo os valores das instâncias
        System.out.println("Exemplo Padrão:");
        exemploPadrao.exibirValores();

        System.out.println("\nExemplo com Inteiro:");
        exemploComInteiro.exibirValores();

        System.out.println("\nExemplo com Ambos:");
        exemploComAmbos.exibirValores();
    }
}
