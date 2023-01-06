package test;

import domain.*;

public class TestSobreescriturat {
    public static void main(String[] args) {
        Empleado empleado=new Empleado("juan",5000);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        Gerente gerente= new Gerente("Karla",10000,"Contabilidad");
        System.out.println("gerente = " + gerente.obtenerDetalles());
    }
}
