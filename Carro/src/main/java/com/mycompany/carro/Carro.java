package com.mycompany.carro;

public class Carro {
    String nome;
    String marca;
    int anoFabricado;
    float velocidade;
    
    void acelerar(int aceleracao)
    {
        velocidade+=aceleracao;
    }
    
    void freiar(int reduzir)
    {
        velocidade-=reduzir;
    }
    
    void buzinar()
    {
        System.out.println("pinnnnnnnnn");
    }
    
    
    
}
