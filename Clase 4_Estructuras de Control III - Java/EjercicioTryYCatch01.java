import java.util.InputMismatchException;
import java.util.Scanner;
// Actividad: Division Segura
public class EjercicioTryYCatch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // variables de los números a dividir y el re resultado de la división
        int num01 = 0;
        int num02 = 0;
        int división = 0;
        // bloque try catch para manejar excepciones
        try {
            // solicitud al usuario para ingresar los números de la división
            System.out.println("Ingrese la división a realizar");
            System.out.print("Primer número: ");
            num01 = scanner.nextInt(); // lee el primer número
            System.out.print("Ingrese el segundo número: ");
            num02 = scanner.nextInt(); // lee el segundo número
            // realiza la división
            división = num01 / num02;
        } catch (ArithmeticException e){ // captura excepción por cero
            System.out.println("Error no se puede dividir por cero.");
        } catch (InputMismatchException e){ // captura cuando se ingresa un carácter no numérico
            System.out.println("Error, ingreso un carácter en lugar de un número. ");
        } catch (Exception e) { // captura cualquier otra excepción no esperada
            System.out.println("Sucedió un error.");
        }
        // muestra el resultado
        System.out.println("El resultado de la división es: " + división);
        scanner.close(); // cierre del objeto scanner
    }
}
