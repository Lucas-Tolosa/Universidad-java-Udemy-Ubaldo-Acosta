package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(2,2,3,4,5,6,6);
        imprimirNumeros(2,4);
        variosParametros("juan",8,9,10);
        
    }
    
    private static void variosParametros(String nombre, int...numeros){
        System.out.println("nombre= "+nombre);
        imprimirNumeros(numeros);
        
    }
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento:"+numeros[i]);
        }
    }
}
