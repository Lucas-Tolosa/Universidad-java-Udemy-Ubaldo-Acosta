package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
       
        
        //insertando un nuevo objeto de la clase persona
    Persona persona= new Persona(9,"Manuel","Belgrano","manolito@mail.com","110011001");
        System.out.println( personaDao.actualizar(persona));
    
     
        List<Persona> personas = personaDao.seleccionar();
        for(Persona p: personas){
            System.out.println(p);
        }
    }
}
