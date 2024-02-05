import java.util.Scanner;

import static java.lang.Math.pow;

public class cuboBinomio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero para A: ");
        int a = input.nextInt();
        System.out.println("Ingrese un numero para B: ");
        int b = input.nextInt();

        double cuboBinomio = pow(a, 3) + 3 * pow(a, 2) * b + 3 * a * pow(b, 2) + pow(b, 3);

        System.out.println(cuboBinomio);
    }
}
