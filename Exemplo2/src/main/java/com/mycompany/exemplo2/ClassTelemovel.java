package com.mycompany.exemplo2;

public class ClassTelemovel {
    public int volume = 0;
    private boolean ligado = true;
    private boolean estadoDoDisplay;
    
    public int vol()
    {
        return volume;
    }
    
    public boolean lig()
    {
        
        if(ligado == true)
            return true;
        return false;
    }
    
}
