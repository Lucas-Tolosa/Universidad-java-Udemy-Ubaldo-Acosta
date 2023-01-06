package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        //imprimir(miLista);
       
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
//        imprimir(miSet);
    
    Map miMapa= new HashMap();
    miMapa.put("valor1", "Juan");
    miMapa.put("valor2", "Carla La que come sus uvas");
    miMapa.put("Valor3", "Rosario la del frente");
    
    String elemento=(String)miMapa.get("valor2");
    //System.out.println("elemento = " + elemento);
    
    imprimir(miMapa.keySet());
    imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
       
    }
}
