package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;
import static datos.Conexion.*;
        
public class UsuarioDAO {
    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM test.usuario";
    private static final String SQL_INSERT = "INSERT INTO test.usuario(usuario, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE test.usuario SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM test.usuario WHERE id_usuario=?";
    
    public List<Usuario> seleccionar(){
        
        Connection cn= null;
        PreparedStatement pt=null;
        ResultSet rt= null;
        List<Usuario> users= new ArrayList<>();
        try {
            //agarro la primera y la ultima letra para identificarlos
         //   Class.forName("com.mysql.gm.jdbc.Driver");
            cn=Conexion.getConnection();
            pt=cn.prepareStatement(SQL_SELECT);
            rt=pt.executeQuery();
            while(rt.next()){
                int idUsuario= rt.getInt("id_usuario");
                String usuario = rt.getString("usuario");
                String password = rt.getString("password");
                
                users.add(new Usuario(idUsuario,usuario,password));
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
//        } catch (ClassNotFoundException ex) {
//             ex.printStackTrace(System.out);
        }finally{
            try {
                close(rt);
                close(pt);
                close(cn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
            
        }
        return users;
    }
    public int insertar(Usuario user){
        Connection cn= null;
        PreparedStatement pt= null;
        int registro = 0;
        
        try {
            cn=getConnection();
            pt=cn.prepareStatement(SQL_INSERT);
            pt.setString(1, user.getUsuario());
            pt.setString(2, user.getPassword());
            System.out.println("Ejecutando Query: "+SQL_INSERT);
            registro=pt.executeUpdate();
            System.out.println("Registros afectados"+registro);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                
                close(pt);
            close(cn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registro;
    }
    
    public int actualizar(Usuario user){
        Connection cn= null;
        PreparedStatement pt= null;
        int registro = 0;
        
        try {
            cn=getConnection();
            System.out.println("Ejecutand Query :"+SQL_UPDATE);
            pt=cn.prepareStatement(SQL_UPDATE);
            pt.setString(1, user.getUsuario());
            pt.setString(2, user.getPassword());
            pt.setInt(3, user.getIdUsuario());
            registro=pt.executeUpdate();
            System.out.println("Registros actualizados: " + registro);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
           try {
            close(pt);
            close(cn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registro;
    }
    public int eliminar(Usuario user){
        Connection cn= null;
        PreparedStatement pt= null;
        int registro = 0;
        
        try {
            cn=getConnection();
            System.out.println("Ejecutand Query :"+SQL_DELETE);
            pt=cn.prepareStatement(SQL_DELETE);
            pt.setInt(1, user.getIdUsuario());
            registro=pt.executeUpdate();
            System.out.println("Registros eliminados: " + registro);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
           try {
               
            close(pt);
            close(cn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registro;
    }
    
}
