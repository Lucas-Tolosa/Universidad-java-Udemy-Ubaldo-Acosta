 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caja;

/**
 *
 * @author LCS
 */
public class Caja {
 int alto,ancho,prof;

public Caja(){
    
}
public Caja(int alto, int ancho, int profundo){
    this.alto=alto;
    this.ancho=ancho;
    this.prof=profundo;
}
 public int calcularVolumen(){
     return this.alto*this.prof*this.ancho;
 }
}
