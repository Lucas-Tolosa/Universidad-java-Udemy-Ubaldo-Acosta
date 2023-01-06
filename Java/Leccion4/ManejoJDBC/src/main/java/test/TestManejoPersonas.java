package test;

import datos.*;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {
    public static void main(String[] args) {
    
            Connection conexion=null;
        try {
            conexion= Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDao= new PersonaDAO(conexion);
            
            Persona camPer= new Persona(2);
            camPer.setNombre("Karla Ivonne");
            camPer.setApellido("Gomez");
            camPer.setEmail("kgomez@gmail.com");
            camPer.setTelefono("1170074356");
            
            personaDao.actualizar(camPer);
            
            Persona np= new Persona();
            np.setNombre("Carlos");
            //np.setApellido("askdjksajdkjsakdjksajdksajssakdjksajkdjsakdjksajdksajkdsajksajkdajsdkjsakd");
            np.setApellido("Ramirez");
            
            personaDao.insertar(np);
            
            conexion.commit();
            System.out.println("se ha hecho commit de la transaccion");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al Rollback");
                try {
                    conexion.rollback();
                } catch (SQLException ex1) {
                    ex1.printStackTrace(System.out);
                }
        }
    
    
    }
}
