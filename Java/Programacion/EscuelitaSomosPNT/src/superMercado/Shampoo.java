package superMercado;

public class Shampoo extends Producto {
    private int contenido;
    public Shampoo(String nombre,int precio, int contenido){
        super(nombre,precio);
        this.contenido=contenido;
    }
    
    @Override
    public String toString(){
        return "Nombre: Shampoo "+this.getNombre()+" /// Contenido: "+this.getContenido()+"ml /// Precio: $"+this.getPrecio()+("\n");
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
    
}
