// Ejercicio Complementario
// Rellenando un arreglo de manera personalizada
// Escribe un programa en Java que realice lo siguiente:
// Solicita al usuario un tamaño para un arreglo.
// Luego, pídele que ingrese un número con el que desea rellenar el array.
// Solicita el índice hasta el cual quiere rellenar el array con el número anterior.
// Asegúrate de validar lo siguiente:
// La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.
// Si el índice ingresado no es el índice del último elemento del arreglo, el programa debe continuar pidiendo al usuario nuevos números e índices para rellenar el arreglo.
// El índice siempre debe ser menor que el tamaño total del arreglo.
// Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice ingresado debe ser mayor que el último índice ingresado; a su vez, se debe rellenar el array con el nuevo número desde el índice anterior hasta el nuevo índice.
// Por último, el programa debe imprimir por consola el arreglo completo.
import java.util.Arrays;
import java.util.Scanner;
public class EjercicioComplementario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();
        int[] array = new int[tamaño];

        // Mostrar arreglo vacío
        System.out.println("Arreglo vacío -> " + Arrays.toString(array));

        // Variable para el control de índices
        int ultimoIndice = 0;

        // Bucle para pedir números y rellenar el arreglo hasta completarlo
        while (ultimoIndice < tamaño) {
            // Solicitar número para rellenar el arreglo
            System.out.print("Número con el que desea rellenar el arreglo: ");
            int relleno = scanner.nextInt();

            // Solicitar índice hasta donde rellenar el arreglo
            System.out.print("Ingrese el índice hasta donde quiere rellenar el arreglo (Índice actual " + ultimoIndice + "): ");
            int indice = scanner.nextInt();

            // Validar el índice
            while (indice <= ultimoIndice || indice > tamaño) {
                System.out.println("Índice inválido. Debe ser mayor que " + ultimoIndice + " y menor o igual que " + tamaño + ".");
                System.out.print("Ingrese el índice nuevamente: ");
                indice = scanner.nextInt();
            }

            // Rellenar el arreglo desde el último índice hasta el índice final
            Arrays.fill(array, ultimoIndice, indice, relleno);

            // Mostrar el estado actual del arreglo
            System.out.println("Arreglo actual -> " + Arrays.toString(array));

            // Actualizar el último índice utilizado
            ultimoIndice = indice;
        }

        // Mostrar arreglo completo
        System.out.println("Arreglo final -> " + Arrays.toString(array));

        // Cerrar el escáner
        scanner.close();
    }
}