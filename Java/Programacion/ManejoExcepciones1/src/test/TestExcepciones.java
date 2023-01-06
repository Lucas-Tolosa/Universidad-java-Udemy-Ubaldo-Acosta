package test;

import static aritmetica.Aritmetica.division;
import static excepciones.excepcionExample.multiplicar;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        int resultado2= 0;

        try {
            resultado = division(10, 2);
            resultado2 = multiplicar(1,2);
            
        }
        catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo operacion Excepcion:");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception:");
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("el resultado es: " + resultado);
        System.out.println("resultado2 = " + resultado2);

    }
}
