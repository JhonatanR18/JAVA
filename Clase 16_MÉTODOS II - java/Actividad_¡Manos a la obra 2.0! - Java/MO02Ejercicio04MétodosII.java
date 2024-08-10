// 4 .Crear array aleatorio: Basándote en el ejercicio “Generación de números aleatorios” de este paso, crea un programa que te permita generar un array de tipo "int" de manera aleatoria. El programa debe solicitar al usuario el tamaño del array y el rango de números posibles para rellenarlo.

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MO02Ejercicio04MétodosII {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // solicita el tamaño del array
        int arrayLength = fetchInteger("Ingrese el tamaño del array: ");

        // validar que el tamaño del array sea positivo
        while (arrayLength <= 0) {
            System.out.println("Error: El tamaño del array debe ser un número positivo.");
            arrayLength = fetchInteger("Ingrese el tamaño del array: ");
        }

        // crear un array de enteros con el tamaño especificado
        int[] randomArray = new int[arrayLength];

        // solicitar el rango de números para el array
        System.out.println("Ingrese el rango de números posibles para rellenar el array:");
        int rangoMin = fetchInteger("Rango mínimo: ");
        int rangoMax = fetchInteger("Rango Máximo: ");

        // validar que el rango máximo sea mayor que el mínimo
        while (rangoMax <= rangoMin) {
            System.out.println("Error: el rango máximo no puede ser menor o igual que el rango mínimo.");
            rangoMax = fetchInteger("Rango Máximo: ");
        }

        // rellena el array con números aleatorios
        fillArrayRandomly(randomArray, rangoMin, rangoMax);

        // muestra el array generado
        System.out.println("Array Generado: " + Arrays.toString(randomArray));

        // cierra el scanner
        scanner.close();
    }

    // rellena el array con números aleatorios dentro del rango especificado
    public static void fillArrayRandomly(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    // solicita un número entero y maneja excepciones
    public static int fetchInteger(String message) {
        Integer number = null;
        do {
            try {
                System.out.print(message);
                number = scanner.nextInt();
                scanner.nextLine(); // limpiar el buffer del scanner
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número valido. Los caracteres no son aceptados..");
                scanner.nextLine(); // limpiar el buffer del scanner
            }
        } while (number == null);
        return number;
    }
}
