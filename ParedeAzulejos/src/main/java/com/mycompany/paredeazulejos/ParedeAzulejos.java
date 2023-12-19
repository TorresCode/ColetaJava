package com.mycompany.paredeazulejos;

import java.util.Scanner;

public class ParedeAzulejos {
    public static void main(String[] args) {
        // Cria um scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê as medidas da parede e do azulejo
        System.out.print("Digite a altura da parede (hp): ");
        double hp = scanner.nextDouble();

        System.out.print("Digite a largura da parede (lp): ");
        double lp = scanner.nextDouble();

        System.out.print("Digite a altura do azulejo (ha): ");
        double ha = scanner.nextDouble();

        System.out.print("Digite a largura do azulejo (la): ");
        double la = scanner.nextDouble();

        // Fecha o scanner após a leitura
        scanner.close();

        // Calcula a área da parede e a área de um azulejo
        double areaParede = hp * lp;
        double areaAzulejo = ha * la;

        // Calcula a quantidade de azulejos necessários
        double quantidadeAzulejos = areaParede / areaAzulejo;

        // Imprime o resultado
        System.out.println("Serão necessários " + Math.ceil(quantidadeAzulejos) + " azulejos para cobrir a parede.");
    }
}
