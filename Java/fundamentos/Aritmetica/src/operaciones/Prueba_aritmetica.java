
package operaciones;

public class Prueba_aritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1=new Aritmetica();
        
        aritmetica1.a=20;
        aritmetica1.b=300;
        
        aritmetica1.sumar();
        
        int resultado=aritmetica1.sumarConRetorno();
        System.out.println(" la suma de a y b es: " + resultado);
        
        
        resultado=aritmetica1.sumarConArgumentos(2, 4);
        System.out.println("resultado  de sumar con argumentos= " + resultado);
    }
}
