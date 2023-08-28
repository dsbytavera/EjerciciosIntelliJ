

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingrese el primer número entero:");
            String texto1 = buffer.readLine();
                Integer num1 = Integer.parseInt(texto1);
        System.out.println("Ingrese el segundo número entero:");
            String texto2 = buffer.readLine();
                Integer num2 = Integer.parseInt(texto2);
        System.out.println("Ingrese la operación a realizar");
            String texto3 = buffer.readLine();

        Integer resultado;

        if (texto3.equals("Suma")) {
            resultado = num1 + num2;
        } else if (texto3.equals("Resta")) {
            resultado = num1 - num2;
        } else if (texto3.equals("Multiplicacion")) {
            resultado = num1 * num2;
        } else if (texto3.equals("Division")) {
            resultado = num1 / num2;
        } else {
            System.out.println("Operación no reconocida, intenta con: Suma, Resta, Multiplicacion, Division");
            return;
        }

        System.out.println("El Resultado es: " + resultado);
    }
}