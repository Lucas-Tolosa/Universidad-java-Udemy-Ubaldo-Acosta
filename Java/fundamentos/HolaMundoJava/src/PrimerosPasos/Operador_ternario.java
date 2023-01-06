/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerosPasos;

/**
 *
 * @author LCS
 */
public class Operador_ternario {

    public static void main(String[] args) {
        var resultado = (1 > 2) ? "verdadero" : "falso";
        System.out.println("resultado = " + resultado);

        var numero=9;
        resultado= (numero%2==0) ? "número par":"número impar";
        System.out.println("resultado = " + resultado);
    }

}
