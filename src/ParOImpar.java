import java.util.Scanner;


public class ParOImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        scanner.close();


        if (numero % 2 == 0) {
            System.out.println("El número "+ numero + "es par.");
        } else {
            System.out.println("El número " + numero+" es impar.");
        }
    }

}
