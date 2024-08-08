// Tabla de multiplicar 2.0
// En esta actividad, vas a crear un programa que solicita al usuario que ingrese 3 números (incluida la lógica en un método llamado pedirNúmeros())  y luego imprime la tabla de multiplicar de cada uno de ellos  1 al 10 (incluida la lógica en un método llamado imprimirTablasMultiplicar(int[] números)). Para ello, implementarás un  un array para almacenar los números ingresados y luego invocarás el método para cada uno de ellos.
import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio04MétodosI {
    // variable global del objeto scanner
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // array para almacenar los tres números ingresados
        int[] números = new int[3];

        // método pedirNúmeros para solicitar y almacenar los tres números
        pedirNúmeros(números);

        // imprime el array con los 3 números ingresados
        System.out.println("Números ingresados: " + Arrays.toString(números));

        // método imprimirTablaMultiplicar para imprimir la tabla de multiplicar de cada número
        imprimirTablaMultiplicar(números);

        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }

      // método que solicita ingresar 3 números y los almacena en el array números
    public static void pedirNúmeros(int[] números) {
        System.out.println("-----Ingrese 3 números-----");

        // bucle que itera tres veces, solicitando un número en cada iteración
        for (int i = 0; i < números.length; i++){
            System.out.print("Número 0" + (i + 1) + ": ");
            // guarda el número ingresado en el array en la posición correspondiente
            números[i] = scanner.nextInt();
        }
    }

     // método que imprime la tabla de multiplicar del 1 al 10 para cada número en el array números
    public static void imprimirTablaMultiplicar(int[] números) {
        for (int número : números){
            System.out.println("Tabla del número: " + número);
            for(int i = 1; i <= 10; i++){
                // imprime el formato de la multiplicación con un espaciado bonito xd
                System.out.printf("| %2d * %2d | = %2d", número, i, número * i);
                System.out.print("      ");
                if (i % 5 == 0) {
                    // añade un salto de línea cada 5 multiplicaciones para mejorar la legibilidad
                    System.out.print("\n");
                }
            }
        }
    }
}