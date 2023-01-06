
package caja;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja cajita=new Caja();
        //le doy los valores a el objeto cajita
        cajita.prof=6;
        cajita.alto=2;
        cajita.ancho=3;
        
        int resultado=cajita.calcularVolumen();
        
        System.out.println("resultado de cajita= " + resultado);
        
        Caja cajon=new Caja(2,3,6);
        //aca ya le di los valores con llamada al constructor con valores
        resultado=cajon.calcularVolumen();
        System.out.println("Resultado de cajon = " +resultado );
    }
}
