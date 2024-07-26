// Actividad: Cálculo del factorial
// El objetivo de esta actividad es que desarrolles un programa que solicite al usuario ingresar un número y posteriormente calcule su factorial mediante un bucle do-while. El factorial de un número se define como el producto de todos los enteros desde 1 hasta ese número. A continuación, te presentamos  algunos ejemplos para mayor claridad:
// El factorial de 3 se calcula como 1 * 2 * 3, lo que resulta en 6.
// El factorial de 5 se obtiene multiplicando 1 * 2 * 3 * 4 * 5, dando como resultado 120.
// Para calcular el factorial de 7, multiplicamos 1 * 2 * 3 * 4 * 5 * 6 * 7, que da 5040.
import java.util.InputMismatchException;
import java.util.Scanner;

public class AI_IV_Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------Calculadora de factorial.--------------");
        boolean continuar = true; // Variable para controlar la continuidad del bucle

        do {
            try {
                // Solicitar al usuario que ingrese un número
                System.out.print("Ingrese un número || '0' Para finalizar el programa: ");
                int numero = scanner.nextInt(); // Leer el número ingresado por el usuario

                // Verificar si el número es 0 para finalizar el programa
                if (numero == 0) {
                    continuar = false; // Actualizar la variable para salir del bucle
                    System.out.println("\n-----Esperamos haberte sido de mucha ayuda. :D-----");
                    System.out.println("--------------Programa Finalizado.--------------\n");
                    break; // Salir del bucle
                }

                // Inicializar variables para el cálculo del factorial
                int recorridos = 1; // Contador inicializado a 1
                int multiplicación = 1; // Resultado del factorial inicializado a 1

                // Calcular el factorial utilizando un bucle do-while
                do {
                    multiplicación = multiplicación * recorridos; // Actualizar el resultado del factorial
                    recorridos++; // Incrementar el contador
                } while (recorridos <= numero); // Continuar hasta que el contador sea mayor que el número

                // Imprimir el resultado del factorial
                System.out.println("------------------Factorial: " + multiplicación + "------------------\n");

            } catch (InputMismatchException e) {
                // Manejar el caso donde la entrada no es un número entero
                System.out.println("\n<>Entrada inválida. Por favor, ingrese un número entero.<>\n");
                scanner.next(); // Limpiar el buffer del scanner
            } catch (Exception e) {
                // Manejar cualquier otra excepción inesperada
                System.out.println("Error inesperado: " + e.getMessage());
                scanner.next(); // Limpiar el buffer del scanner
            }
        } while (continuar); // Continuar el bucle hasta que el usuario ingrese 0
        
        scanner.close(); // Cerrar el scanner para liberar recursos
    }
}