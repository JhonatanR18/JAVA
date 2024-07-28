// Creando un gráfico de barras:
// Escribe un programa que solicite al usuario ingresar 4 números entre 1 y 20. Luego, imprime una representación visual de estos números en forma de gráfico de barras utilizando asteriscos. Cada número ingresado corresponderá a la longitud de una barra en el gráfico, donde cada asterisco representa una unidad en la escala. A modo de ejemplo:
import java.util.Arrays;
import java.util.Scanner;
public class AI_IV_Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadNúmeros = 4; // número de entradas que se pedirán
        int contador = 0; // contador para el número de entradas recibidas
        int numeroIngresado = 0; // variable para almacenar cada entrada temporalmente
        int[] números = new int[cantidadNúmeros]; // array para almacenar las entradas

        System.out.println("Ingrese 4 números entre 1 y 20.");
        
        // bucle para pedir al usuario los números
        while (contador < cantidadNúmeros) {
            boolean numeroValido = true; // bandera para controlar la validación de cada número
            while (numeroValido) {
                System.out.print("Número " + (contador + 1) + ": ");
                numeroIngresado = scanner.nextInt();
                // verificar si el número está entre 1 y 20
                if (numeroIngresado >= 1 && numeroIngresado <= 20) {
                    números[contador] = numeroIngresado; // almacenar el número en el array
                    contador++; // incrementar el contador de entradas
                    numeroValido = false; // salir del bucle de validación
                } else {
                    System.out.println("El número debe estar entre 1 y 20. Intente nuevamente.");
                }
            }
        }

        // mostrar los números ingresados en formato de array
        System.out.println("Gráfico de barras de los números "+ Arrays.toString(números) + ": ");

        // bucle para imprimir el gráfico de barras
        for (int i = 0; i < cantidadNúmeros; i++) {
            numeroIngresado = números[i]; // obtener el valor del array
            System.out.print(números[i]); // imprimir el número ingresado seguido de ":"
            // bucle para imprimir los asteriscos correspondientes al valor
            for (int j = 0; j < numeroIngresado; j++) {
                System.out.print("*");
            }
            System.out.print("\n"); // nueva línea después de cada barra
        }

        scanner.close(); // cerrar el escáner
    }
}
