package com.mycompany.aluno;

public class Objecto {
    
    public static void main(String[] args) {
        Aluno primeiroAluno = new Aluno();
        primeiroAluno.curso = "C. Computação";
        primeiroAluno.nome = "Alfredo Torres";
        primeiroAluno.altura = 1.70f;
        primeiroAluno.idade = 23;
        primeiroAluno.notaUm = 0;
        primeiroAluno.notaDois = 12;
        
        //Chamando os Objectos
        primeiroAluno.assistirAula();
        primeiroAluno.fazerProva();
        primeiroAluno.calcaularNota();
        primeiroAluno.alturaMaxima();
    }
}
