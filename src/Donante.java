import java.util.Scanner;

public class Donante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese su peso: ");
        double peso = scanner.nextDouble();
        scanner.close();

        if (edad >=18 && edad <=65){
            if (peso >=50){
                System.out.println("Usted es apto para donar sangre.");
            } else {
                System.out.println("Usted no es apto para donar sangre, ya que su peso es menor a 50kg.");
            }
        }else {
            System.out.println("Usted no es apto para donar sangre, ya que su edad es menor a 18 años o mayor a 65 años.");
        }
    }
}
