package mundopc;
import com.gm.mundopc.*;
public class MundoPc {
    public static void main(String[] args) {
        Teclado teclado1=new Teclado("Falopa", "Sony");
        Monitor monitor1=new Monitor("Sony",18);
        Raton raton1=new Raton("MAMAMIA","negro");
        Computadora computador1=new Computadora("Ryzen",monitor1,teclado1,raton1);
        //inicializar cada objeto para utilizarlos 
        Teclado teclado2=new Teclado("Falopa", "lg");
        Monitor monitor2=new Monitor("Sony",18);
        Raton raton2=new Raton("MAMAMIA","negro");
        Computadora computador2=new Computadora("gtx",monitor2,teclado2,raton2);
        
        Orden orden1=new Orden();
        orden1.agregarComputadora(computador1);
        orden1.agregarComputadora(computador2);
        orden1.mostrarOrden();
    }
    
}
