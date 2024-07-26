import java.util.InputMismatchException;
import java.util.Scanner;
public class AI_IV_Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // crear un objeto Scanner para la entrada del usuario
        boolean continuar = true; // variable para controlar la continuidad del bucle

        do {
            try {
                // solicitar al usuario que ingrese la posición en la serie de Fibonacci
                System.out.print("Ingrese posición Fibonacci a buscar || '-1' Para salir del programa: ");
                int posición = scanner.nextInt(); // leer la posición ingresada por el usuario

                // verificar si el usuario desea salir del programa
                if (posición == -1) {
                    System.out.println("\n-------------------------Programa finalizado.-------------------------\n");
                    break; // salir del bucle
                }

                // manejar los casos especiales para las primeras posiciones de la serie
                if (posición == 0) {
                    System.out.println("-------------------------Posición " + 0 + ": " + 0 + "-------------------------\n");
                } else if (posición == 1) {
                    System.out.println("-------------------------Posición " + 1 + ": " + 1 + "-------------------------\n");
                } else {
                    // inicializar variables para calcular la serie de Fibonacci
                    int primerNumero = 0; // primer número de la serie
                    int segundoNumero = 1; // segundo número de la serie
                    int términos = 2; // contador inicializado a 2
                    int suma = 0; // variable para almacenar la suma de los dos números anteriores

                    // calcular el valor de la serie de Fibonacci para la posición dada
                    while (términos <= posición) {
                        suma = primerNumero + segundoNumero; // calcular la suma de los dos números anteriores
                        primerNumero = segundoNumero; // actualizar el primer número
                        segundoNumero = suma; // actualizar el segundo número
                        términos++; // incrementar el contador
                    }

                    // imprimir el valor correspondiente a la posición en la serie de Fibonacci
                    System.out.println("-------------------------Posición " + posición + ": " + suma + "-------------------------\n");
                }
            } catch (InputMismatchException e) {
                // Manejar el caso donde la entrada no es un número entero
                System.out.println("\n---------Entrada inválida. Por favor, ingrese un número valido.---------\n");
                scanner.next(); // Limpiar el buffer del scanner
            } catch (Exception e) {
                // Manejar cualquier otra excepción inesperada
                System.out.println("Error inesperado: " + e.getMessage());
                scanner.next(); // Limpiar el buffer del scanner
            }
        } while (continuar); // continuar el bucle hasta que el usuario ingrese -1
        scanner.close(); // cerrar el scanner para liberar recursos
    }
}