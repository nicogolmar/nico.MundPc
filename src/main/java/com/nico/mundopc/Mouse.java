package com.nico.mundopc;

public class Mouse extends DispositivoEntrada{

    private int idMouse;
    private int contadorMouse;

    


    public Mouse(String entrada, String marca) {
        
        super(entrada, marca);
    this.idMouse=++contadorMouse;
    
        
    }

    @Override
    public String toString() {
        return super.toString() + "Mouse{" + "idMouse=" + idMouse + ", contadorMouse=" + contadorMouse + '}';
    }
            

    
}
