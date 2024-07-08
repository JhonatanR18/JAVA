import java.util.InputMismatchException;
import java.util.Scanner;
public class BloqueTryYCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un divisor: ");
        int cociente = 0; // variable para almacenar el resultado de la división
        try {
            int divisor = scanner.nextInt(); // lee el divisor ingresado
            cociente = 10 / divisor; // realiza la división
        } catch (ArithmeticException e){ // captura la excepción específica para división por cero
            e.printStackTrace(); // imprime el rastreo de la excepción en consola
            System.out.println("No se puede dividir por cero: " + e.getMessage()); // mensaje de error personalizado
        } catch (InputMismatchException e){ // captura la excepción para entrada incorrecta (diferente al tipo de dato || num entero, letra u otro.)
            System.out.println("Ingreso un carácter en lugar de un número: " + e.getMessage());
        } catch (Exception e){ // captura cualquier otra excepción no esperada - importante ponerlo siempre al final
            System.out.println("Sucedió un error."); // mensaje genérico de error
        }
        System.out.println("El resultado es: " +  cociente); // imprime el resultado de la división o 0 si hubo error
        scanner.close(); // cierre del scanner para liberar recursos
    }
}