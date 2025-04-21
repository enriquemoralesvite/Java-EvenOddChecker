import java.util.Scanner;

public class Aprobar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la nota del alumno: ");
        double nota = scanner.nextDouble();
        scanner.close();

        if (nota >=7){
            System.out.println("El alumno aprobó.");
        } else if (nota >= 5) {
            System.out.println("El alumno está en recuperación.");
        } else {
            System.out.println("El alumno reprobó.");
        }
    }
}
