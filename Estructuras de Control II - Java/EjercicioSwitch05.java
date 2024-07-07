import java.util.Scanner;
public class EjercicioSwitch05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // mensajes informativos y solicitud de entrada
        System.out.println("Determinando si el día de la semana seleccionado es 'Día Hábil o no'.");
        System.out.println("1-Lunes  2-Martes  3-Miércoles  4-Jueves \n5-Viernes  6-Sábado  7-Domingo");
        System.out.print("Ingrese un número de la semana a verificar: ");
        int número = scanner.nextInt(); // lee el número ingresado
        // switch para determinar si el día es hábil o no
        String diaHábil = switch (número){
            case 1, 2, 3, 4, 5 -> "Día Hábil";
            case 6, 7 -> "Día no Hábil";
            default ->"Opción no valida.";
        };
        System.out.println(diaHábil); // imprime resultado
        scanner.close(); // cierra el objeto scanner
    }
}