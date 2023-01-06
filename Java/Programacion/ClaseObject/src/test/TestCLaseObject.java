package test;

import domain.Empleado;

public class TestCLaseObject {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado("juan",5000);
        Empleado empleado2=new Empleado("Juan",5000);
    
           if(empleado1==empleado2){
               System.out.println("Tienen la misma referencia en memoria");
           } 
           else{
               System.out.println("Tienen distintas referencias en memoria");
           }
          if (empleado1.equals(empleado2)){
              System.out.println("Son iguales en contenido");
          }
          else{
              System.out.println("los objetos son diferentes en contenido");
          }
          
          if(empleado1.hashCode()==empleado2.hashCode()){
              System.out.println("El valor de hashcode es igual");
          }
          else {
              System.out.println("el valor Hashcode es distinto");
          }
          
    }
}
