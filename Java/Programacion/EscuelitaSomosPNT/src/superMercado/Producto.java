package superMercado;

public class Producto implements Comparable<Producto>{
    private String nombre;
    private int precio;

    public Producto(String producto,int precio){
    this.nombre=producto;
    this.precio=precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
 @Override
    public int compareTo(Producto t) {
        if(this.getPrecio()>t.getPrecio()){
            return -1;
        }
        else if(this.getPrecio()<t.getPrecio()) {
                return 1;
         }
        else {return 0;}
    }

   
    
  
}
