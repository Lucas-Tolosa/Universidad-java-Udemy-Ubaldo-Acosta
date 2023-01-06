package supermercado;

public class Perfumeria extends Item {

	private int contenido;
	
	public int getContenido() {
		return contenido;
	}

	public Perfumeria(String nombre, int precio, int contenido) {
		super(nombre, precio);
		this.contenido=contenido;
	}
	@Override
	public String toString() {
		return "Nombre: " +this.getNombre()+" /// Contenido: "+ this.getContenido() + "ml /// Precio: $"+ this.getPrecio();
	}
}
