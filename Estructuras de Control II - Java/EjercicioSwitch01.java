import java.util.Scanner;
// Ejercicio de Días de la Semana
// En esta actividad, escribirás un programa que solicite al usuario ingresar un número del 1 al 7, que representará un día de la semana. Luego, el programa mostrará en pantalla el nombre correspondiente a ese día. Utilizaremos la estructura "switch" para implementar este programa.
public class EjercicioSwitch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese un número del 1 al 7 representando los días de la semana
        System.out.print("Ingrese un número de la semana: "); 
        int número = scanner.nextInt(); // leer el número ingresado por el usuario
        // Uso de una expresión switch para determinar el día de la semana
        String díaSemana = switch (número) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Error: Número invalido.";
        };
        System.out.println(díaSemana);
        // Cierre del objeto Scanner para liberar los recursos
        scanner.close();
    }
}