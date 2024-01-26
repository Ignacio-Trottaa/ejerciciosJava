import java.util.Scanner;

public class tablasMultiplicar {
    public static void main(String[] args) {
        /*
         * Crea un programa que sea capaz de solicitarte un número y se
         * encargue de imprimir su tabla de multiplicar entre el 1 y el 10.
         * - Debe visualizarse qué operación se realiza y su resultado.
         *   Ej: 1 x 1 = 1
         *       1 x 2 = 2
         *       1 x 3 = 3
         *       ...
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber la tabla de multiplicar: ");
        int numeroTabla = input.nextInt();

        System.out.println("Tabla del: " + numeroTabla);

        for (int i = 0; i <= 10; i++) {

            int mostrarTabla = i * numeroTabla;

            System.out.println(numeroTabla + "x" + i + "=" + mostrarTabla);
        }
    }
}
