// Actividad: Contando los dígitos en un número
// Pídele al usuario que introduzca un número. Convierte el número en una cadena y luego utiliza un bucle y Character.isDigit() para contar el número de dígitos en el número.
import java.util.InputMismatchException;
import java.util.Scanner;
public class EjercicioWrappers06 {
    public static void main(String[] args) {
        // crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; // bandera para controlar el bucle

        // bucle para obtener un número válido del usuario
        while (continuar) {
            try {
                // pide al usuario que ingrese un número
                System.out.print("Ingrese un número: ");
                int numero = scanner.nextInt(); // lee el número ingresado
                
                // convierte el número en una cadena
                String cadena = String.valueOf(numero);
                int dígitos = 0; // inicializa el contador de dígitos
                
                // recorre cada carácter en la cadena
                for (int i = 0; i < cadena.length(); i++) {
                    // verifica si el carácter es un dígito
                    if (Character.isDigit(cadena.charAt(i))) {
                        dígitos++; // incrementa el contador de dígitos
                    }
                }
                
                // muestra el número total de dígitos encontrados
                System.out.println("El número ingresado tiene: " + dígitos + " dígitos");
                continuar = false; // sale del bucle si todo es correcto
            } catch (InputMismatchException e) {
                // mensaje de error si se ingresa un carácter en lugar de un número
                System.out.println("Error: Ingresó un carácter en lugar de un número.");
                scanner.next(); // limpia el buffer del scanner
            } catch (Exception e) {
                // mensaje de error para cualquier otra excepción inesperada
                System.out.println("Error inesperado: " + e.getMessage());
                scanner.next(); // limpia el buffer del scanner
            }
        }
        
        // cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}