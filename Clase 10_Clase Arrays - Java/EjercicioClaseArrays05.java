// Actividad: Rellenando un arreglo
// El método fill() de la clase Arrays cambia todos los elementos en un arreglo por un valor estático, desde el índice start (por defecto 0) hasta el índice end (por defecto array.length) y devuelve el arreglo modificado. Vamos a escribir un programa que solicite al usuario el tamaño para un arreglo y un número entero con el que quiera rellenarlo. Luego crea el arreglo y utiliza Arrays.fill(). Finalmente, imprime el arreglo resultante.
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EjercicioClaseArrays05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner

        boolean continuar = true; // controla la repetición del bucle do-While en caso de errores

        // bucle que maneja las entradas del usuario y sus validaciones
        do {
            try {
                // solicita y lee el tamaño del arreglo ingresado
                System.out.print("Ingrese el tamaño del arreglo: ");
                int tamaño = scanner.nextInt();

                // crea un arreglo con el tamaño ingresado
                int [] arreglo = new int[tamaño];

                // solicita y lee el número con el que se rellenara el arreglo
                System.out.print("Ingrese el número con el que quieras rellenar el arreglo: ");
                int número = scanner.nextInt();

                // Arrays.fill() para llenar el arreglo con el número ingresado
                Arrays.fill(arreglo, número);
                System.out.println("Arreglo resultante: " + Arrays.toString(arreglo)); // imprime el arreglo

                // si las validaciones son exitosas, se detiene el bucle
                continuar = false;

            } catch (InputMismatchException e) {
                // manejo de excepciones para casos no numéricos
                System.out.println("Error: Ingreso un carácter en lugar de un número, vuelva a intentarlo.");
                scanner.next(); // limpia el buffer del scanner
            } catch (Exception e) {
                // maneja excepciones no esperadas
                System.out.println("Error...");
                scanner.next(); // limpia el buffer del scanner
            }
        } while (continuar);
        // repite hasta que se ingresen índices validos y la variable continual cambie a "false"

        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}
