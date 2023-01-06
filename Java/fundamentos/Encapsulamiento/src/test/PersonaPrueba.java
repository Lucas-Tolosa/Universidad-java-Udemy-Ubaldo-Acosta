package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona2=new Persona("Lucas", 200.00, true);
        
        System.out.println("persona2= " + persona2);//llama automaticamente a el metodo toString();
//        System.out.println("persona2 el nombre es= " + persona2.getNombre()+ " el sueldo es de: "+
//        persona2.getSueldo()+" y esta eliminado es igual a: "+persona2.isEliminado());
        
        persona2.setNombre("paula puta");
        persona2.setSueldo(20.00);
        persona2.setEliniminado(false);
        
//        System.out.println("persona2 el nombre es= " + persona2.getNombre()+ " el sueldo es de: "+
//        persona2.getSueldo()+" y esta eliminado es igual a: "+persona2.isEliminado());
//        
System.out.println("persona2= " + persona2.toString());
    }
}
