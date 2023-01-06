package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][]=new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 3;
        edades[2][1] = 9;
        System.out.println("edades 0-0 = " + edades[0][0]);
        for (int i = 0; i < edades.length; i++) {
            
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades de "+i +" "+ j+" ="+ edades[i][j]);
            }
        }
        
        String frutas[][]={{"naranja","limon"},{"fresa","paella","porro"}};
       imprimir(frutas);
        Persona personas[][]=new Persona[2][3];
        
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Pedro");
        personas[1][0] = new Persona("Lucas");
        personas[1][1] = new Persona("Sofia");
        personas[1][2] = new Persona("Carlos");
        
        imprimir(personas);
        
        
    }
    public static void imprimir(Object matriz[][]){
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("la fruta guardada en " +i+"-"+j+" es= "+matriz[i][j] );
                
            }
        }
}
    }
   
   
