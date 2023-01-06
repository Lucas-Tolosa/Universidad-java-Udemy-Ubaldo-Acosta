
package test;

public class TestArreglos {
    public static void main(String[] args) {
       int  edad[]=new int[3];
       
        System.out.println("edad = " + edad);
        
        edad[0]=2;
        edad[1]=4;
        edad[2]=1;
         System.out.println("edad 0: "+edad[0]);
         
         for(int x=0;x<edad.length;x++){
             System.out.println("edades elemento ="+x+" y la edad es= "+edad[x]);
         }
    }
}
