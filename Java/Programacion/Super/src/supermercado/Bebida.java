package supermercado;

public class Bebida extends Item{
	
	private double litros;
	
	public Bebida(String nombre, int precio, double litros){
		super(nombre, precio);
		this.litros=litros;
	}

	public double getLitros() {
		return litros;
	}

	@Override
	public String toString() {
		return "Nombre: " +this.getNombre()+" /// Litros: "+ this.getLitros() + " /// Precio: $"+ this.getPrecio();
	}
}

