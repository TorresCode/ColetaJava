package com.mycompany.exemplo2;

public class ClassRetangulo {
    public int largura;
    public int altura;
    
    public int areaTotal()
    {
        return largura * altura;
    }
    
    public boolean isQuadrado()
    {
        if(largura == altura)
            return true;
        return false;                
    }    
}
