package test;

import accesodatos.*;

public class TestInterface {
    public static void main(String[] args) {
        IAccesoDatos datos=new ImplementacionMySql();
        //datos.insertar();
        //datos.actualizar();
        //datos.listar();
        imprimir(datos);
        datos= new ImplementacionOracle();
        imprimir(datos);
        
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
