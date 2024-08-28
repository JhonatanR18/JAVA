// Actividad: Fibonacci y recursividad
// Reorganiza el código extrayendo la lógica en métodos sin alterar su funcionamiento. Después, intenta modificar la lógica para resolverlo de forma recursiva. 
// Ejercicio anterior: “serie Fibonacci mejorada” - Clase 13_Desafío01_Ejercicio02
import java.util.Scanner;
public class ActividadFibonacciYRecursividad {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int posición;
        do {
            // solicitar que se ingrese la posición en la serie de Fibonacci
            System.out.print("Ingrese posición Fibonacci a buscar || '-1' Para salir del programa: ");
            posición = scanner.nextInt(); // Leer la posición ingresada por el usuario
            
            // calcula y muestra el resultado si la posición es válida
            if (posición >= 0) {
                int resultado = Fibonacci(posición);
                System.out.println("-------------------------Posición " + posición + ": " + resultado + "-------------------------\n");
            } else if (posición != -1) {
                System.out.println("Posición no válida. Por favor, ingrese un número positivo o '-1' para salir.");
            }
        } while (posición != -1);
        
        // cierre del objeto scanner
        scanner.close();
    }

    // calcula el valor de Fibonacci
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}



