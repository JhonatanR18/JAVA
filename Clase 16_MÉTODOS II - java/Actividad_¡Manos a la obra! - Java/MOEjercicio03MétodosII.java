import java.util.InputMismatchException;
import java.util.Scanner;

public class MOEjercicio03MétodosII {
    public static Scanner scanner = new Scanner(System.in); // instancia scanner

    public static void main(String[] args) {
        // obtiene la puntuación válida ingresada
        Integer puntuación = obtenerPuntuación();

        // muestra la calificación correspondiente
        System.out.println(obtenerNota(puntuación));

        scanner.close();  // cierre del objeto scanner
    }

    // método que devuelve la calificación correspondiente según la puntuación ingresada
    public static String obtenerNota(int puntuación) {
        // valida que la puntuación esté dentro del rango permitido
        if (puntuación < 0 || puntuación > 100) {
            return "La puntuación ingresada está fuera del rango válido.";
        }

        // switch expression para determinar la calificación
        return switch (puntuación / 10) {
            case 10, 9 -> "Calificación final: A";  // para puntuaciones 90-100
            case 8 -> "Calificación final: B";      // para puntuaciones 80-89
            case 7 -> "Calificación final: C";      // para puntuaciones 70-79
            case 6 -> "Calificación final: D";      // para puntuaciones 60-69
            default -> "Calificación final: F";     // para puntuaciones menores a 60
        };
    }

    // método que solicita una puntuación válida y maneja excepciones
    public static Integer obtenerPuntuación() {
        Integer puntuación = null;
        do {
            try {
                System.out.print("Ingrese su Puntuación: ");
                puntuación = scanner.nextInt();
                scanner.nextLine(); // limpiar el scanner después de la entrada
            } catch (InputMismatchException e) {
                // manejar la excepción si el usuario ingresa un dato no numérico
                System.out.println("Error: por favor, ingrese un número válido. los caracteres no son aceptados.");
                System.out.println("Vuelva a intentarlo.");
                scanner.nextLine(); // limpiar el scanner para evitar un bucle infinito
            }
        } while (puntuación == null); // repetir hasta obtener una puntuación válida
        // retorna la puntuación valida
        return puntuación;
    }
}
