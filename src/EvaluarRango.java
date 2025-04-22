import java.util.Scanner;

public class EvaluarRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del préstamo: ");
        double valorPrestamo = scanner.nextDouble();
        scanner.close();


        if (valorPrestamo>=1000 && valorPrestamo<=5000){
            System.out.println("El valor esta aceptado dentro del rango del préstamo.");
        } else {
            System.out.println("El valor no está aceptado dentro del rango del préstamo.");
        }
    }
}
