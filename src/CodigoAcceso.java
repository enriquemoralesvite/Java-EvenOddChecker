import java.util.Scanner;

public class CodigoAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el código de acceso: ");
        int codigoAcceso = scanner.nextInt();
        System.out.println("Ingrese el nivel de permiso: ");
        int nivelPermiso = scanner.nextInt();
        scanner.close();

        Boolean codigoValido = (codigoAcceso==2023);
        Boolean nivelValido = (nivelPermiso>=1 && nivelPermiso<=3);

        if (codigoValido && nivelValido){
            System.out.println("Acceso concedido.");
        } else if (!codigoValido && !nivelValido) {
            System.out.println("Codigo de acceso y nivel de permiso incorrectos.");
        } else{
            if (!codigoValido){
                System.out.println("Código de acceso incorrecto.");
            }
            if (!nivelValido){
                System.out.println("Nivel de permiso incorrecto.");

            }
        }
    }
}
