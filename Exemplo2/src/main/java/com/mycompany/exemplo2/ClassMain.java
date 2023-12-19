package com.mycompany.exemplo2;

public class ClassMain {
    
    //Declarando as Funções
    public static void metodo() {
      
        System.out.println("Impresso atraves do metodo.");
    
    }
    
    public static void meusDados()
    {
        System.out.println("\nMeu nome: Alfredo Cangoma Simões Torres::::::::Disciplina de Programação Orientada a Objetos\n");
    }
    
    public static void main(String[] args) {
        
        meusDados();
        
        metodo();
        
        //Dados da Class Telemóvel
        ClassTelemovel obTelemovel;
        obTelemovel = new ClassTelemovel();
        int vol = obTelemovel.volume = 15;
        System.out.println("O volume do telemóvel é de: " + vol);
        
        
        //Dados da Class Calculo/Mat
        ClassMat obMat = new ClassMat();
        obMat.soma(10, 20);
        
        
        //Dados da Class do Retângulo
        System.out.println("Classe do Retângulo");
        ClassRetangulo obRetangulo = new ClassRetangulo();
        
        obRetangulo.altura = 200;
        obRetangulo.largura = 200;
        
        System.out.println("Área total do quadrado é de: " + obRetangulo.areaTotal());
        System.out.println("Trata-se de um quadrado? " + obRetangulo.isQuadrado());
        
        //Segundo Objecto
        ClassRetangulo obRetangulo1 = new ClassRetangulo();
        obRetangulo1.altura = 100;
        obRetangulo1.largura = 200;
        
        System.out.println("Área total do quadrado é de: " + obRetangulo1.areaTotal());
        System.out.println("Trata-se de um quadrado? " + obRetangulo1.isQuadrado());
               
    }
}
