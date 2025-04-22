import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.text.Normalizer;

public class diasHabiles {
    private static final List<String> diasHabiles = Arrays.asList("lunes", "martes", "miercoles", "jueves", "viernes");
    private static final List<String> diasNoHabiles = Arrays.asList("sabado", "domingo");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana en (minúscula): ");
        String dia = scanner.nextLine().trim();
        scanner.close();

        dia = normalizarTexto(dia);
        if (diasHabiles.contains(dia)){
            System.out.println("Es un día hábil.");
        } else if (diasNoHabiles.contains(dia)) {
            System.out.println("Es un día no hábil.");
        } else {
            System.out.println("Día no válido.");
        }
    }
    private static String normalizarTexto(String texto) {
        return Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase().trim();
    }





}



