
package domain;


public final class Persona {
    public final static int CONSTANTE=2;
    private String nombre;
    public final void imprimir(){
        System.out.println("Metodo Imprirmir");
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
