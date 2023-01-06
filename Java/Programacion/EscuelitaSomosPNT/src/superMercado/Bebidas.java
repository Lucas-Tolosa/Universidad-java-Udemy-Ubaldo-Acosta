package superMercado;


public class Bebidas extends Producto {
    private double litros;
    public Bebidas(String nombre,int precio,double litros){
        super(nombre,precio);
        this.litros=litros;
    }
    
    
    @Override
    public String toString(){
        return "Nombre: "+this.getNombre()+" /// Litros: "+this.getLitros()+" /// Precio: $"+this.getPrecio()+("\n");
    }

    public double getLitros() {
        return this.litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}
