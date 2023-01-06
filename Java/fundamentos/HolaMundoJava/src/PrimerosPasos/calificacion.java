/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerosPasos;
import java.util.Scanner;

public class calificacion {
    
    public static void main(String[] args){
        
       var calificacion="valor desconocido";
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println( "ingrese la nota entre el 0 y el 10" );
        int nota=Integer.parseInt(sc.nextLine());
        
        if (nota>=9&&nota<=10){
            calificacion="A";
        } else if(nota>=8&&nota<9){
            calificacion="B";
        } else if(nota>=7&&nota<8){
            calificacion="C";
        } else if(nota>=6&&nota<7){
            calificacion="D";
        } else if(nota>=0&&nota<6){
            calificacion="F";
        }
        
        System.out.println("la calificacion  es= " + calificacion);
        //continue en un for() lleva a la siguiente iteracion 
    }
    
}
