import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado 1: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingrese el valor del lado 2: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingrese el valor del lado 3: ");
        double lado3 = scanner.nextDouble();
        scanner.close();


        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los lados forman un triángulo.");
        } else {
            System.out.println("Los lados no forman un triángulo.");
        }
    }
}
