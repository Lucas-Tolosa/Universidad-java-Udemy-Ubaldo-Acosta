package excepciones;

import excepciones.OperacionExcepcion;

public class excepcionExample {

    public static int multiplicar(int num1, int num2) throws OperacionExcepcion {
        if (num2 == 0 && num1 == 0) {
            throw new OperacionExcepcion("combinacion Incorrecta");
        }
        return num1 * num2;

    }
}
