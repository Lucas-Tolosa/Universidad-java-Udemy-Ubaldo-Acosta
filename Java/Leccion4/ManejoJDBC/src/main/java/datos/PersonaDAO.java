package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;
import static datos.Conexion.*;

public class PersonaDAO {

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_persona, nombre, apellido, email, telefono FROM test.persona";
    private static final String SQL_INSERT = "INSERT INTO test.persona (nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE test.persona SET nombre= ?, apellido= ?, email= ?, telefono= ? WHERE id_persona=?";
    private static final String SQL_DELETE = "DELETE FROM test.persona WHERE id_persona=?";

    public PersonaDAO() {

    }

    public PersonaDAO(Connection conexionTransaxional) {
        this.conexionTransaccional = conexionTransaxional;
    }

    public List<Persona> seleccionar() {
        Connection cn = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();

        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            st = cn.prepareStatement(SQL_SELECT);
            rs = st.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                persona = new Persona(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(st);
                if (this.conexionTransaccional == null) {
                    close(cn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return personas;
    }

    public int insertar(Persona persona) throws SQLException {
        Connection cn = null;
        PreparedStatement pt = null;
        int registros = 0;
        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            System.out.println("Ejecutando Query: "+SQL_INSERT);
            pt = cn.prepareStatement(SQL_INSERT);
            pt.setString(1, persona.getNombre());
            pt.setString(2, persona.getApellido());
            pt.setString(3, persona.getEmail());
            pt.setString(4, persona.getTelefono());
            registros = pt.executeUpdate();
            System.out.println("Registros afectados: "+registros);
     
        } finally {
            try {
                close(pt);
                if (this.conexionTransaccional == null) {
                    close(cn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return registros;
    }

    public int actualizar(Persona personita) throws SQLException {
        Connection cn = null;
        PreparedStatement pt = null;
        int registro = 0;
        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            System.out.println("Ejecutando Query: "+SQL_UPDATE);
            pt = cn.prepareStatement(SQL_UPDATE);
            pt.setString(1, personita.getNombre());
            pt.setString(2, personita.getApellido());
            pt.setString(3, personita.getEmail());
            pt.setString(4, personita.getTelefono());
            pt.setInt(5, personita.getIdPersona());
            registro = pt.executeUpdate();
            System.out.println("Registros actualizados: "+registro);
       
        } finally {
            try {
                close(pt);
                if (this.conexionTransaccional == null) {
                    close(cn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }

        return registro;
    }

    public int Eliminar(Persona p) throws SQLException {
        int registro = 0;
        Connection cn = null;
        PreparedStatement pt = null;
        try {
            cn = this.conexionTransaccional != null ? this.conexionTransaccional : getConnection();
            System.out.println("Ejecutando Query: "+SQL_DELETE);
            pt = cn.prepareStatement(SQL_DELETE);
            pt.setInt(1, p.getIdPersona());
            registro = pt.executeUpdate();
            System.out.println("Registros eliminados: "+registro);
            
        } finally {
            try {
                close(pt);
                if (this.conexionTransaccional == null) {
                    close(cn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registro;
    }
}
