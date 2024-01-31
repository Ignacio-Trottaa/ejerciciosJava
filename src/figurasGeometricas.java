import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class figurasGeometricas {
    /*
     * Mediante funciones calcular y Triángulo, Cuadrado y Rectángulo.
     */
    public static void main(String[] args) {
        AreaTriangulo();
        AreaCuadrado();
        AreaRectangulo();
    }

    public static void AreaTriangulo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese base: ");
        double base = input.nextDouble();
        System.out.println("Ingrese altura: ");
        double altura = input.nextDouble();
        System.out.println("Ingrese lado 1: ");
        double lado1 = input.nextDouble();
        System.out.println("Ingrese lado 2: ");
        double lado2 = input.nextDouble();
        System.out.println("Ingrese lado 3: ");
        double lado3 = input.nextDouble();
        double resultadoTriangulo = base * altura / 2;
        double semiPerimetro = (lado1 + lado2 + lado3) / 2;
        double heronTriangulo = sqrt(semiPerimetro * (semiPerimetro - lado1) * (semiPerimetro - lado2) * (semiPerimetro - lado3));
        System.out.println("Area de un Triangulo: " + heronTriangulo);
    }

    public static void AreaCuadrado() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la longitud del cuadrado: ");
        double ladoCuadrado = input.nextDouble();
        double areaCuadrado = pow(ladoCuadrado, 2);
        System.out.println("Area de un cuadrado: " + areaCuadrado);
    }

    public static void AreaRectangulo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        double baseRectangulo = input.nextDouble();
        System.out.println("Ingrese la altura: ");
        double alturaRectangulo = input.nextDouble();
        double areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println("Area de un rectanguo: " + areaRectangulo);
    }
}
