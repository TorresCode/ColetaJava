package com.mycompany.tabuada;

public class Tabuada {
    public static void main(String[] args) {
        // Loop externo para percorrer os números de 1 a 9
        for (int i = 1; i <= 9; i++) {
            System.out.println("Tabuada do " + i + ":");

            // Loop interno para calcular e imprimir a tabuada do número atual
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            // Adiciona uma linha em branco entre as tabuadas
            System.out.println();
        }
    }
}
