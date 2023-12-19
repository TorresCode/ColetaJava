package com.mycompany.carro;

public class ObjectoCarro {

    public static void main(String[] args) {
        Carro obejectoUm = new Carro();
        
        obejectoUm.nome = "Prado";
        obejectoUm.marca = "Toyota";
        obejectoUm.anoFabricado = 1998;
        obejectoUm.velocidade = 400;
        
        obejectoUm.acelerar(120);        
        System.out.println("Acelerando o carro com uma Velocidade de: " + obejectoUm.velocidade + " km/h");
        
        obejectoUm.freiar(90);
        System.out.println("Freiando o carro com uma Velocidade de: " + obejectoUm.velocidade + " km/h");
    }
}
