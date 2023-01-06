package test;

import domain.*;

public class TestIntanceOf {
    public static void main(String[] args) {
        Empleado empleado=new Empleado("juan",5000);
       determinarTipo(empleado);
        empleado= new Gerente("Karla",10000,"Contabilidad");
        //determinarTipo(empleado);
    }
    public static void determinarTipo(Empleado empleado){
        //va del mas especifico al mas generico de las clases y tambien se usa el else sino se ejecutarian todas las que tengan relacion y no solo una
        
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            Gerente gerente=(Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
            //otro metodo de conversion de objetos es
            ((Gerente) empleado).getDepartamento();
            
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
            System.out.println("empleado = " + empleado.getNombre());
    }
        else  if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
        
    }
}
