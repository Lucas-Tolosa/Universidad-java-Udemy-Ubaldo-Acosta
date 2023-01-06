
package com.gm.mundopc;

public class Monitor {
private final int idMonitor;
private String marca;
private double tamanio;
private static int contadorMonitores;


public Monitor(){
    this.idMonitor=++Monitor.contadorMonitores;
}
//aca puse el this para que siempre se ejecute el constructor vacio
public Monitor(String marca,double tamaño){
    this();
    this.marca=marca;
    this.tamanio=tamaño;
    
}

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tama\u00f1o=" + tamanio + '}';
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

        
}
