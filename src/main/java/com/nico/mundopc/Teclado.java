package com.nico.mundopc;

public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private int contadorTeclado;
    
    

    public Teclado(String entrada, String marca) {
        super(entrada, marca);   
    this.idTeclado=++contadorTeclado;
    
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclado=" + contadorTeclado + '}';
    }
    
}
