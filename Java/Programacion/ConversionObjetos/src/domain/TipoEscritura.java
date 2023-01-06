package domain;

public enum TipoEscritura {
    CLASICO("escritura a mano"),
    MODERNO("Escritura Digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){
        this.descripcion=descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}
