package datos;

import domain.UsuarioDTO;
import java.sql.*;
import java.util.*;
import static datos.Conexion.*;

public class UsuarioDAOJDBC implements UsuarioDAOI{

    private Connection ConeccionTransaccional;

    private static final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM test.usuario";
    private static final String SQL_INSERT = "INSERT INTO test.usuario(usuario, password) VALUES(?, ?)";
    private static final String SQL_UPDATE = "UPDATE test.usuario SET usuario=?, password=? WHERE id_usuario=?";
    private static final String SQL_DELETE = "DELETE FROM test.usuario WHERE id_usuario=?";

    public UsuarioDAOJDBC() {

    }

    public UsuarioDAOJDBC(Connection cn) {
        this.ConeccionTransaccional = cn;
    }

    public List<UsuarioDTO> seleccionar() throws SQLException {

        Connection cn = null;
        PreparedStatement pt = null;
        ResultSet rt = null;
        List<UsuarioDTO> users = new ArrayList<>();
        try {
            //agarro la primera y la ultima letra para identificarlos

            cn = this.ConeccionTransaccional != null ? this.ConeccionTransaccional : getConnection();
            pt = cn.prepareStatement(SQL_SELECT);
            rt = pt.executeQuery();
            while (rt.next()) {
                int idUsuario = rt.getInt("id_usuario");
                String usuario = rt.getString("usuario");
                String password = rt.getString("password");

                users.add(new UsuarioDTO(idUsuario, usuario, password));
            }
        } finally {
            try {
                close(rt);
                close(pt);
                if (this.ConeccionTransaccional == null) {
                    close(cn);
                }

            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return users;
    }

    public int insertar(UsuarioDTO user) throws SQLException {
        Connection cn = null;
        PreparedStatement pt = null;
        int registro = 0;

        try {
            cn = this.ConeccionTransaccional != null ? this.ConeccionTransaccional : getConnection();
            pt = cn.prepareStatement(SQL_INSERT);
            pt.setString(1, user.getUsuario());
            pt.setString(2, user.getPassword());
            System.out.println("Ejecutando Query: " + SQL_INSERT);
            registro = pt.executeUpdate();
            System.out.println("Registros afectados" + registro);

        } finally {
            try {

                close(pt);
                if (this.ConeccionTransaccional == null) {
                    close(cn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registro;
    }

    public int actualizar(UsuarioDTO user) throws SQLException {
        Connection cn = null;
        PreparedStatement pt = null;
        int registro = 0;

        try {
            cn = this.ConeccionTransaccional != null ? this.ConeccionTransaccional : getConnection();
            System.out.println("Ejecutand Query :" + SQL_UPDATE);
            pt = cn.prepareStatement(SQL_UPDATE);
            pt.setString(1, user.getUsuario());
            pt.setString(2, user.getPassword());
            pt.setInt(3, user.getIdUsuario());
            registro = pt.executeUpdate();
            System.out.println("Registros actualizados: " + registro);

        } finally {
            try {
                close(pt);
                if (this.ConeccionTransaccional == null) {
                    close(cn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registro;
    }

    public int eliminar(UsuarioDTO user) throws SQLException {
        Connection cn = null;
        PreparedStatement pt = null;
        int registro = 0;

        try {
            cn = this.ConeccionTransaccional != null ? this.ConeccionTransaccional : getConnection();
            System.out.println("Ejecutand Query :" + SQL_DELETE);
            pt = cn.prepareStatement(SQL_DELETE);
            pt.setInt(1, user.getIdUsuario());
            registro = pt.executeUpdate();
            System.out.println("Registros eliminados: " + registro);

        } finally {
            try {

                close(pt);
                if (this.ConeccionTransaccional == null) {
                    close(cn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registro;
    }

}
