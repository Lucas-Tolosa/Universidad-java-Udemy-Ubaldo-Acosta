package superMercado;

import java.util.Arrays;
import java.util.Collections;

public class Lista  {
    private Producto[] lista= new Producto[4];
    private String mayor;
    private String menor;

    
    public Lista(){
        lista[0]=new Bebidas("Coca Cola Zero", 20,1.5);
        lista[1]=new Bebidas("Coca Cola",18,1.5);
        lista[2]=new Shampoo("Sedal",19,500);
        lista[3]=new Fruta("Frutilla",64,"kilos");
    }
    
    public String mayor(){
        Arrays.sort(lista);
        return "Producto más caro: " + this.lista[0].getNombre();
    }
    public String menor(){
            Arrays.sort(lista);
            Arrays.sort(lista,Collections.reverseOrder());
            return "Producto más barato: "+this.lista[0].getNombre();
                    }
    public void imprimir(){
        
        for(Producto i: lista){
            if(i==null)
            {
                break;
            }
        System.out.println(i);
        }
        System.out.println("=============================");
        System.out.println(this.mayor());
        System.out.println(this.menor());
    }
    
    
}
