package supermercado;

import java.util.Arrays;
import java.util.Collections;

public class Lista {
	
	Item[] listaItem = new Item[4];
	
	public Lista() {
		listaItem[0]= new Bebida("Coca-cola Zero", 20, 1.5);
		listaItem[1]= new Bebida("Coca-cola", 19, 1.5);
		listaItem[2]= new Perfumeria("Shampoo Sedal", 15, 500);
		listaItem[3]= new Fruta("Frutillas", 64, "kilo");
	}
	
	
	public String mayorPrecio() {
			
		Arrays.sort(listaItem);
		
		return "Producto mas caro: " +listaItem[0].getNombre();
	}
	
	
	public String menorPrecio() {

		Arrays.sort(listaItem);
		Arrays.sort(listaItem, Collections.reverseOrder());
		return "Producto mas caro: " +listaItem[0].getNombre();
	}
	
	public String mostrarLista() {
		String mostrar="";
		
		for(int i=0; i<listaItem.length; i++) {
			mostrar+=listaItem[i].toString()+"\n";
		}
		return mostrar;
	}
	
	public String separador() {
		return "===================";
	}
}
