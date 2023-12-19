package com.mycompany.aluno;

public class Aluno {
    String nome;
    String curso;
    int idade;
    float altura;
    float notaUm;
    float notaDois;
    
    void assistirAula()
    {
        System.out.println("O aluno " + this.nome + " do curso de " + this.curso + " assiste aula.");
    }
    
    void fazerProva()
    {
        float media = (notaUm + notaDois) / 2;
        if(media >= 10)
        {
            System.out.println("O aluno " + this.nome + " pode fazer prova, porque tem uma média equivalente à " + media+ "valor(es)");
        }else{
            System.out.println("O aluno " +this.nome+ " não poderá fazer a prova porque a sua média é de " + media+ " valor(es)");
        }
    }
    
    void calcaularNota()
    {
        float calcNota = notaUm + notaDois;
        if(calcNota > 7)
        {
            System.out.println("Tens uma nota boa");
        }else{
            System.out.println("Precisas estudar mais!!!");
        }
    }
    
    void alturaMaxima()
    {
        System.out.println("Altura máxima do aluno " +this.nome+ " é " +this.altura+ " m");
    }
}
