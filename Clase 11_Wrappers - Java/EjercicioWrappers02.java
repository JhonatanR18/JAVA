// Actividad: Conversión de cadena a número
// Escribe un programa que lea una cadena que represente un número entero como entrada utilizando la clase Scanner. Luego, convierte la cadena en un número entero utilizando la clase de envoltura Integer.
import java.util.Scanner;
public class EjercicioWrappers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner

        // pide y lee la cadena de texto ingresada como una linea completa
        System.out.print("Ingrese un número entero en formato de cadena: ");
        String cadena = scanner.nextLine();

        try {
            // intenta convertir la cadena en un número entero
            int numero = Integer.parseInt(cadena);
            // imprime el número entero convertido
            System.out.println("Numero convertido en un entero: " + numero);
        } catch (NumberFormatException e) {
            // captura la excepción si la cadena ingresada no puede ser convertida a un número.
            System.out.println("Error: La cadena ingresada no tiene el formato adecuado para ser convertida a un número.");
        } catch (Exception e) {
            // captura cualquier otra excepción inesperada que pueda ocurrir.
            System.out.println("Error inesperado: " + e.getMessage());
        }
        
        scanner.close(); // cierre del objeto scanner
    }
}
