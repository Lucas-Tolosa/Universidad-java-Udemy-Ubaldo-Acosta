package test;

import datos.*;
import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class TestManejoPersonas {
    public static void main(String[] args) {
    
            Connection conexion=null;
        try {
            conexion= Conexion.getConnection();
            if(conexion.getAutoCommit()){
                conexion.setAutoCommit(false);
            }
            PersonaDAOI personaDao= new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> ps= personaDao.select();
            
            for (PersonaDTO p : ps){
                System.out.println("Persona DTO: "+ p);
            }
            
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
