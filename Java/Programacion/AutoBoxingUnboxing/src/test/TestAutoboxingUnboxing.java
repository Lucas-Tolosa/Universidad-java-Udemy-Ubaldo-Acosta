package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clases envolventes de tipo primitivos
    /*
    int-Integer
    long-Long
    float-Float
    double-Double
    boolean-Boolean
    byte-Byte
    char - Character
    shor-Short
    */
    
    Integer entero=10;//autoBoxing
        System.out.println("entero = " + entero);
        System.out.println("entero double = " + entero.doubleValue());
        //lo siguiente es un unboxing
        int entero2=entero;
        System.out.println("entero2 = " + entero2);
        

    }
    

}
