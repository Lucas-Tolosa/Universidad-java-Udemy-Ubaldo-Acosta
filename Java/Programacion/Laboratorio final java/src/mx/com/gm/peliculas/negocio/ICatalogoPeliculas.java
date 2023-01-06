package mx.com.gm.peliculas.negocio;

public interface ICatalogoPeliculas {
    String NOMBRE_RECURSO="Peliculas.txt";
    public void agregarPeliculas(String nombrePelicula);
    
    public void listarPeliculas();
    
    public void buscarPelicula(String buscar);
    
    public void iniciarArchivo();
    
}
