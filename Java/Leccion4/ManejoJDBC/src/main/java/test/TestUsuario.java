package test;

import datos.*;
import domain.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestUsuario {
    public static void main(String[] args) {
        Connection cn= null;
       
        try {
            cn=Conexion.getConnection();
            if(cn.getAutoCommit()==true){
                cn.setAutoCommit(false);
            }
            UsuarioDAO userDao= new UsuarioDAO(cn);
       Usuario user = new Usuario(6,"Sr.panqueque","sr.amigo");
            
            userDao.actualizar(user);
        Usuario us2= new Usuario(6);
        userDao.eliminar(us2);
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
