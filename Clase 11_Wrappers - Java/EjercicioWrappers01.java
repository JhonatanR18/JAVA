// Actividad: Verificando si una cadena representa un número válido
// Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un número decimal usando Double.valueOf(). Si la cadena no representa un número válido, Double.valueOf() lanzará una excepción. Captura esta excepción y muestra un mensaje al usuario indicando que la entrada no es un número válido.
import java.util.Scanner;
public class EjercicioWrappers01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner

        // variable de control para determinar si el bucle debe continuar o detenerse
        boolean continuar = true;

        // bucle que seguirá ejecutándose hasta que el usuario ingrese una cadena válida
        while (continuar) {
            try {
                System.out.print("Ingrese un número en formato de cadena: ");
                String cadena = scanner.nextLine(); // lee la entrada del usuario como una línea completa de texto.
                // intenta convertir la cadena a un número decimal (Double).
                Double numeroDecimal = Double.valueOf(cadena);
                // imprime el número decimal convertido.
                System.out.println("Número decimal convertido: " + numeroDecimal);
                // cambia la variable 'continuar' a false para salir del bucle, ya que la conversión fue exitosa.
                continuar = false;
            } catch (NumberFormatException e) {
                // captura la excepción si la cadena ingresada no puede ser convertida a un número decimal.
                System.out.println("Error: La cadena ingresada no tiene el formato adecuado para ser convertida a un número.");
            } catch (Exception e) {
                // captura cualquier otra excepción inesperada que pueda ocurrir.
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }

        // cierre del objeto scanner
        scanner.close();
    }
}
