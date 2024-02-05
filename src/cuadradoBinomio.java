import java.util.Scanner;

import static java.lang.Math.pow;

public class cuadradoBinomio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Ingrese un numero para A: ");
        int a = input.nextInt();
        System.out.println("Ingrese un numero para B: ");
        int b = input.nextInt();

        double cuadradoBinomio = pow(a, 2) + 2 * a * b + pow(b, 2);

        System.out.println(cuadradoBinomio);
    }
}
