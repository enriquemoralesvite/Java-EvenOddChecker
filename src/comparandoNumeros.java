import java.util.Scanner;

public class comparandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        scanner.close();
        if (numero1>numero2) {
            System.out.println("El número mayor es: " + numero1);
        } else if (numero1<numero2) {
            System.out.println("El número mayor es: " + numero2);
        }else {
            System.out.println("Los números son iguales.");
        }
    }
}
