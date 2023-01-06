package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        int opcion= -1;
        Scanner sc= new Scanner(System.in);
        ICatalogoPeliculas ctlg= new CatalogoPeliculasImp();
        
        while(opcion!=0){
            System.out.println("Elija una opcion: \n"
            + "1. Iniciar catalogo peliculas \n"
            + "2. Agregar Pelicula\n"
            + "3. Listar peliculas\n"
            + "4. Buscar pelicula\n"
            + "0. Salir");
            opcion= Integer.parseInt(sc.nextLine());
            
            switch(opcion){
                case 1:
                    ctlg.iniciarArchivo();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    String nomPel= sc.nextLine();
                    ctlg.agregarPeliculas(nomPel);
                    break;
                case 3:
                    ctlg.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce el nombre a buscar");
                    String bc= sc.nextLine();
                    ctlg.buscarPelicula(bc);
                    break;
                case 0:
                    System.out.println("Hasta Pronto");
                    break;
                default:
                    System.out.println("opcion no reconocida");
                    break;
            }
        }
    }
}
