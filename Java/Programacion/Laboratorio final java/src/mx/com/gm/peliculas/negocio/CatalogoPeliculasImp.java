package mx.com.gm.peliculas.negocio;

import java.util.*;
import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class CatalogoPeliculasImp implements ICatalogoPeliculas{
    private final IAccesoDatos ayuda;
    
        public CatalogoPeliculasImp(){
            this.ayuda= new AccesoDatosImp();
        }
     @Override
    public void agregarPeliculas(String nombrePelicula){
        boolean anexar=false;
       
      try{ 
           anexar=this.ayuda.existe(NOMBRE_RECURSO);
          ayuda.escribir(new Pelicula(nombrePelicula), NOMBRE_RECURSO,anexar);
          System.out.println("se ha escrito informacion al archivo= "+nombrePelicula);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al acceder a los datos");
            ex.printStackTrace();
        }
    }

    @Override
    public void listarPeliculas() {
        List<Pelicula> lista= new ArrayList<>();
        
        try {
            
            lista=this.ayuda.listar(NOMBRE_RECURSO);
            for(Pelicula peli:lista){
                System.out.println(peli);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de Acceso Datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado= null;
        try {
            resultado=this.ayuda.buscar(buscar, NOMBRE_RECURSO);
           
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de Acceso datos");
            ex.printStackTrace();
        }
        System.out.println(resultado);
    }

    @Override
    public void iniciarArchivo() {
        try{
        if(this.ayuda.existe(NOMBRE_RECURSO)){
            this.ayuda.borrar(NOMBRE_RECURSO);
            this.ayuda.crear(NOMBRE_RECURSO);
        }
        else{
            this.ayuda.crear(NOMBRE_RECURSO);
        }
        } catch(AccesoDatosEx ex){
            System.out.println("Error al iniciar Catalogo de Peliculas");
            ex.printStackTrace(System.out);
        }
    }
    
    
}
