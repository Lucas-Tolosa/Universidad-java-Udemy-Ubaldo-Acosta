package datos;

import domain.*;
import java.sql.SQLException;
import java.util.*;

public interface UsuarioDAOI {
    
    public List<UsuarioDTO> seleccionar() throws SQLException;
    
    public int insertar(UsuarioDTO usuario) throws SQLException;
    
    public int actualizar(UsuarioDTO usuario) throws SQLException;
    
    public int eliminar(UsuarioDTO usuario) throws SQLException;
    
}
