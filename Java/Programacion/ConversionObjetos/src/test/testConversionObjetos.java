package test;

import domain.*;

public class testConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado= new Escritor("Juan",5000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
//        
//        System.out.println(empleado.obtenerDetalles());
//        
        
        
        //downcasting
        //((Escritor)empleado).GetTipoEscritura();
        Escritor escritor=(Escritor) empleado;
        escritor.GetTipoEscritura();
        
        //upcasting; transforma una clase hija automaticamente a  una padre
        Empleado empleado2=escritor;
        System.out.println(empleado2.obtenerDetalles());
        
        Empleado empleado3=new Gerente("polla",2000,"pendejitos");
        
        System.out.println(((Gerente)empleado3).getDepartamento());;
    }
}
