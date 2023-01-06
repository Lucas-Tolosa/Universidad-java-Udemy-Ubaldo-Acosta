package supermercado;

public class Fruta extends Item{
	
	private String unidad;
	
	public String getUnidad() {
		return unidad;
	}

	public Fruta(String nombre, int precio, String unidad) {
		super(nombre, precio);
		this.unidad=unidad;
	}
	
	@Override
	public String toString() {
		return "Nombre: " +this.getNombre() + " /// Precio: $"+ this.getPrecio()+" /// Unidad de venta "+this.getUnidad();
	}
}
