import java.util.Scanner;

public class DsctoCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el monto de la compra en dólares: ");
        double montoCompra = scanner.nextDouble();
        scanner.close();
        if (montoCompra>=100){
            System.out.println("Descuento del 10% aplicado. \nNuevo valor: " + (montoCompra * 0.90));
            
        } else{
            System.out.println("Descuento no aplicado.\nValor total: " + montoCompra);
        }

    }
}
