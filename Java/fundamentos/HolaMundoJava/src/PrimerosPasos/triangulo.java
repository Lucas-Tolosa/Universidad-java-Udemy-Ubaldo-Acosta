/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerosPasos;
import java.util.Scanner;


public class triangulo {

    public static void main(String args[]){
        int alto,perimetro,area,ancho;
        Scanner scan=new Scanner(System.in);
        
        System.out.println("ingrese el alto");
        
        alto=Integer.parseInt(scan.nextLine());
        
        System.out.println("ingrese el ancho" );
        
        ancho=Integer.parseInt(scan.nextLine());
        
        area=alto*ancho;
        
        perimetro=(alto+ancho)*2;
        
        System.out.println("el area es: " + area);
        System.out.println("El perimetro es:  " + perimetro);
        
         
        System.out.println("proporciona el numero 1" );
        int num1=Integer.parseInt(scan.nextLine());
        System.out.println("proporciona el numero 2");
        int num2=Integer.parseInt(scan.nextLine());
        System.out.println("el numero mayor es");
      System.out.println((num1>num2)? num1:num2);
    }
    
}
