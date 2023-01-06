package datos;

import java.sql.*;
import javax.sql.*;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "admin";
    private static BasicDataSource dataSource;
    
    public static DataSource getDataSource(){
        if(dataSource==null){
       dataSource= new BasicDataSource();
       dataSource.setUrl(JDBC_URL);
       dataSource.setUsername(JDBC_USER);
       dataSource.setPassword(JDBC_PASSWORD);
       //aca se define el tamaño inicial del pool de conexiones
       dataSource.setInitialSize(5);
        }
       return dataSource;
    }
    
    public static Connection getConnection() throws SQLException{
           return getDataSource().getConnection();
    }
    
    public static void close(ResultSet rs) throws SQLException{
        rs.close();
    }
    public static void close(Statement smtn)throws SQLException{
        smtn.close();
    }
    public static void close(PreparedStatement pdsmtn)throws SQLException{
        pdsmtn.close();
    }
    public static void close(Connection cn) throws SQLException{
        cn.close();
    }
}
