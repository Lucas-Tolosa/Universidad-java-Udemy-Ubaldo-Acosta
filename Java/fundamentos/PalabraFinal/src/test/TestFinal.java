package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        //Persona.CONSTANTE;
        System.out.println("Mi constante "+ Persona.CONSTANTE);
        
        final Persona persona1=new Persona();
        //persona1=new Persona;
        
        persona1.setNombre("Juan");
        
        System.out.println("persona1 nomrbre  = " + persona1.getNombre());
        
        persona1.setNombre("Jose");
        
        System.out.println("persona1 nomrbre  = " + persona1.getNombre());
    }
}
