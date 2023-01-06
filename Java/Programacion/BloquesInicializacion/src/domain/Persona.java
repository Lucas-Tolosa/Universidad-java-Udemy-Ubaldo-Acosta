package domain;

public class Persona {
    private final int idPersonas;
    private static int contadorPersonas;
    //bloque de inicializacion estatico
    static{
        System.out.println("Ejecucion de bloque estatico");
       ++Persona.contadorPersonas;
       
    }
    //bloque de inicializacion no estatico
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersonas=Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("ejecucion del constructor");
    }
    public int getIdPersona(){
        return this.idPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersonas=" + idPersonas + '}';
    }
    
}  

