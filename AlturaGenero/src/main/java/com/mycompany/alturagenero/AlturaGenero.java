package com.mycompany.alturagenero;
import java.util.Scanner;

public class AlturaGenero {
    public static void main(String[] args) {
        // Cria um scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Inicializa variáveis
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;
        double somaAlturasHomens = 0;
        int numeroMulheres = 0;

        // Loop para receber dados de 10 pessoas
        for (int i = 1; i <= 10; i++) {
            // Solicita e lê a altura da pessoa
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = scanner.nextDouble();

            // Solicita e lê o sexo da pessoa
            System.out.print("Digite o sexo da pessoa " + i + " (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            // Atualiza a maior e a menor altura
            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
            }

            // Se for homem, adiciona à soma de alturas dos homens
            if (sexo == 'M' || sexo == 'm') {
                somaAlturasHomens += altura;
            }

            // Se for mulher, incrementa o número de mulheres
            if (sexo == 'F' || sexo == 'f') {
                numeroMulheres++;
            }
        }

        // Fecha o scanner após a leitura
        scanner.close();

        // Calcula a média de altura dos homens
        double mediaAlturasHomens = somaAlturasHomens / 10;

        // Imprime os resultados
        System.out.println("Maior altura do grupo: " + maiorAltura);
        System.out.println("Menor altura do grupo: " + menorAltura);
        System.out.println("Média de altura dos homens: " + mediaAlturasHomens);
        System.out.println("Número total de mulheres: " + numeroMulheres);
    }
}
