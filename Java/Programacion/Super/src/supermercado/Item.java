package supermercado;

public class Item implements Comparable<Item>{
	private String nombre;
	private int precio;
	
	public Item(String nombre, int precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public int compareTo(Item A) {
		return this.getPrecio()-A.getPrecio();
	}
	
}
