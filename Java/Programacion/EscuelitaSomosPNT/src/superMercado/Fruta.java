package superMercado;

public class Fruta extends Producto {
    private String contenido;
    public Fruta(String nombre,int precio, String contenido){
        super(nombre,precio);
        this.contenido=contenido;
    }
    
    

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    @Override
    public String toString(){
        return "Nombre: "+this.getNombre()+" /// Precio: $"+this.getPrecio()+" /// unidad de venta: "+this.getContenido()+("\n");
    }
     
}
