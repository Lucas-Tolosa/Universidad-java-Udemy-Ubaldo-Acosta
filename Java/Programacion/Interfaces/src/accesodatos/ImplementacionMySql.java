package accesodatos;

public class ImplementacionMySql implements IAccesoDatos{

    
    @Override
    public void listar() {
        System.out.println("listar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde Mysql");
    }

    @Override
    public void insertar() {
    System.out.println("Insertar desde Mysql");
    }
    
    
}