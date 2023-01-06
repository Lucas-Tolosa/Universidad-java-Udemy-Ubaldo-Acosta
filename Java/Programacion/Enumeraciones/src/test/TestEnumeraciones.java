package test;

import enumeracion.Continentes;
import enumeracion.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("dia"+Dias.LUNES);
//        indicarDiaSemana(Dias.MARTES);
        System.out.println("Continente 4:"+Continentes.AMERICA);
        
        System.out.println("No. Paises en el 4to continentes: "+Continentes.AMERICA.getPaises());
        
    }
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
        }
}
}

