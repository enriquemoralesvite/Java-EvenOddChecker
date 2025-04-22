    import java.util.Scanner;

    public class CalculaDiasHábiles {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el dia de la semana en (minúscula): ");
            String dia = scanner.nextLine();
            scanner.close();

            switch (dia){
                case "lunes":
                    case "martes":
                    case "miércoles":
                    case "jueves":
                        case "viernes":
                            System.out.println("Es un día hábil.");
                            break;
                case "sábado":
                    case "domingo":
                        System.out.println("Es un día no hábil.");
                        break;
                default:
                    System.out.println("Día no válido.");
                    break;
            }
        }
    }
