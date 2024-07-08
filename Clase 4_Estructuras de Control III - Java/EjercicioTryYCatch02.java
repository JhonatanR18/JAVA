import java.util.InputMismatchException;
import java.util.Scanner;
// Actividad: Resta con manejo de excepciones
// Escribe un programa que solicite al usuario ingresar dos números. Luego, realiza la resta del primer número menos el segundo número. Implementa un bloque "try-catch" para manejar las excepciones que puedan surgir en caso de que el usuario no ingrese números. En caso de que se produzca una excepción, muestra un mensaje apropiado en pantalla. Si no se produce ninguna excepción, muestra el resultado de la resta.
public class EjercicioTryYCatch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // variables de los números a restar y el re resultado de la resta
        int num01 = 0;
        int num02 = 0;
        int resta = 0;
        // bloque try catch para manejar excepciones
        try {
            // solicitud al usuario para ingresar los números de la resta
            System.out.println("Ingrese la resta a realizar");
            System.out.print("Primer número: ");
            num01 = scanner.nextInt(); // lee el primer número
            System.out.print("Segundo número: ");
            num02 = scanner.nextInt(); // lee el segundo número
            resta = num01 - num02; // realiza la resta
            System.out.println("El resultado de la resta es: " + resta); // muestra el resultado
        } catch (InputMismatchException e) { // captura cuando se ingresa un carácter no numérico
            System.out.println("Error, ingreso un carácter en lugar de un número.");
        } catch (Exception e) { // captura cualquier otra excepción no esperada
            System.out.println("Error.");
        } finally { // bloque finally para garantizar la liberación de recursos
            scanner.close(); // cierre del scanner para liberar recursos
        }
    }
}
