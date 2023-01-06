package mx.com.gm.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class AccesoDatosImp implements IAccesoDatos {

    @Override
    public boolean existe(String nombreArchivo){
        File check = new File(nombreArchivo);
        return check.exists();
    }

    @Override
    public List<Pelicula> listar(String nombre) throws LecturaDatosEx {
        File archive = new File(nombre);

        List<Pelicula> listar = new ArrayList<>();

        try {
            var checker = new BufferedReader(new FileReader(archive));
            String help = checker.readLine();
            while (help != null) {
                listar.add(new Pelicula(help));
                help = checker.readLine();
            }
            checker.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Ocurrio una excepcion en el programa" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Ocurrio una excepcion en el programa" + ex.getMessage());
        }
        return listar;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx {
        try {
            var lector = new BufferedWriter(new FileWriter(nombreArchivo, anexar));

            lector.write(pelicula.getNombre());
            lector.newLine();
            lector.close();
            //o uso printWriter para hacer lo mismo pero como use este y me quiero diferenciar un poco lo dejo
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Hubo una excepcion de escritura de datos " + ex.getMessage());
        }
    }

    @Override
    public String buscar(String buscar, String nombreArchivo) throws LecturaDatosEx {
        String devolucion = "no se encontro la pelicula";
        int fila = 1;
        try {
            var brd = new BufferedReader(new FileReader(nombreArchivo));
            String linea = brd.readLine();
            while (linea != null) {

                if (buscar.equalsIgnoreCase(linea) && buscar != null) {
                    devolucion = "La Pelicula " + linea + " esta y se encuentra en la fila: " + fila;
                    break;
                }
                fila++;
                linea = brd.readLine();

            }
            brd.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Hubo una excepcion en la busqueda" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Hubo una excepcion en la busqueda" + ex.getMessage());
        }
        return devolucion;
    }

    @Override
    public void crear(String nombreArchivo) throws AccesoDatosEx {
        File archivo= new File(nombreArchivo);
        try{
        PrintWriter creador= new PrintWriter(archivo);
        creador.close();
        System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Hubo una excepcion al crear un archivo"+ex.getMessage());
        }
        
    }

    @Override
    public void borrar(String nombreArchivo){
        File archivo= new File(nombreArchivo);
        if(archivo.exists())
            archivo.delete();
        
        System.out.println("Se ha borrado el archivo");
    }

}
