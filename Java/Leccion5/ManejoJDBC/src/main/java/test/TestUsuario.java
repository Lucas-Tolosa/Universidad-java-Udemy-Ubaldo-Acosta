package test;

import datos.*;
import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;

public class TestUsuario {
    public static void main(String[] args) {
        Connection cn= null;
       
        try {
            cn=Conexion.getConnection();
            if(cn.getAutoCommit()==true){
                cn.setAutoCommit(false);
            }
            UsuarioDAOJDBC userDao= new UsuarioDAOJDBC(cn);
            
            List<UsuarioDTO> usuarios= userDao.seleccionar();
            
            for(UsuarioDTO us: usuarios){
                System.out.println("Usuario DTO: "+us);
            }

            cn.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos en rollback ");
            try {
                cn.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
       
        
    }
}
