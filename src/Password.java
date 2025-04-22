import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la contraseña: ");
        String password = scanner.nextLine();
        scanner.close();
        String passwordCorrecta = "1234";
        if (password.equals(passwordCorrecta)){
            System.out.println("Contraseña correcta.");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}
