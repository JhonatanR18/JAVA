// Actividad: Números primos
// Escribe un programa que solicite al usuario que introduzca un número y verifique si es un número primo utilizando un bucle do-while. Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo. Finalizar el programa cuando ingrese 0 (cero).
// Un número es primo si solo tiene dos divisores: 1 y él mismo. 
import java.util.InputMismatchException;
import java.util.Scanner;

public class AI_III_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        boolean esPrimo; // Variable para indicar si el número es primo
        int numero = -1; // Inicializar con un valor no válido para asegurar entrada correcta

        do {
            esPrimo = true; // Asumir que el número es primo inicialmente

            try {
                System.out.print("Ingrese un número primo || '0' para finalizar el programa: ");
                numero = scanner.nextInt(); // Leer el número ingresado por el usuario

                // Si el número es 0, terminar el programa
                if (numero == 0) {
                    System.out.println("Saliendo del programa...");
                    break;
                }

                // Verificar si el número es menor que 2 (no es primo)
                if (numero < 2) {
                    esPrimo = false;
                } else {
                    // Verificar si el número es divisible por algún número entre 2 y la raíz cuadrada del número
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            esPrimo = false; // Número no es primo si es divisible por i
                            break; // Salir del bucle si se encuentra un divisor
                        }
                    }
                }

                // Informar al usuario si el número es primo o no
                if (esPrimo) {
                    System.out.println("El número " + numero + " es primo.");
                } else {
                    System.out.println("El número " + numero + " no es primo. Intente de nuevo.");
                }
                
            } catch (InputMismatchException e) {
                // Manejar el caso donde la entrada no es un número entero
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del scanner para la próxima entrada
            }
        } while (numero != 0); // Continuar el bucle hasta que el usuario ingrese 0
        
        // Mensaje final indicando que el programa ha terminado
        System.out.println("Programa terminado.");
        scanner.close(); // Cerrar el scanner para liberar recursos
    }
}
