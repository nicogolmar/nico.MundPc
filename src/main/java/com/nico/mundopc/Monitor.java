package com.nico.mundopc;

public class Monitor {

private final int idMontitor;
private String marca;
private double tamaño;
private static int contadorMonitor;
    




private Monitor(){

   this.idMontitor=++contadorMonitor;  
    
    }

public Monitor(String marca,double tamaño){
    this();
    this.marca=marca;
    this.tamaño=tamaño;

}

    public int getIdMontitor() {
        return idMontitor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMontitor=" + idMontitor + ", marca=" + marca + ", tamaño=" + tamaño + '}';
    }


}