/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerosPasos;

import java.util.*;

public class Tienda_libro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona el nombre");
        String nombre = sc.nextLine();

        System.out.println("Proporciona la id");
        int id = Integer.parseInt(sc.nextLine());

        System.out.println("Proporciona el precio");
        double precio = Double.parseDouble(sc.nextLine());

        System.out.println("Proporciona el envio Gratuito");
        boolean envioGratuito = Boolean.parseBoolean(sc.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio gratuito: " + envioGratuito);
    }
}
