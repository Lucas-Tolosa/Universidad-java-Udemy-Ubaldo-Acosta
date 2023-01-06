package test;

import datos.*;
import domain.Usuario;
import java.util.*;

public class TestUsuario {
    public static void main(String[] args) {
       UsuarioDAO userDao= new UsuarioDAO();
       Usuario user = new Usuario(5,"sr pene","sr amigo");
       userDao.eliminar(user);
       List<Usuario> usuarios = userDao.seleccionar();
       for(Usuario u: usuarios){
           System.out.println(u);
       }
        
    }
}
