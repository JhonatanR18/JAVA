// Rellenar un arreglo de manera personalizada: 
// Basándote en el ejercicio que ya has realizado, crea un método llamado "rellenarArray(int[] array)" que recibirá como parámetro un arreglo de tipo "int" y no devolverá ningún valor. Este método contendrá la lógica necesaria para solicitar datos al usuario y completar el arreglo con ellos.
// Ejercicio anterior: “Rellenando un arreglo de manera personalizada” => "CLASE 10 - EjercicioComplementario"
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjerciciosComplementarios01MétodosII {
    // scanner global
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // solicita el tamaño del array
        int arrayLength = fetchNumber("Ingrese el tamaño del array: ");

        // crea un arreglo vacío del tamaño anteriormente especificado
        int[] arrayNumbers = new int[arrayLength];
        System.out.println("Array vació: " +  Arrays.toString(arrayNumbers));

        // llama al método rellenar arreglo con los números proporcionados por el usuario
        fillArray (arrayNumbers);
    }

    // método para solicitar un número entero al usuario y manejar errores de entrada
    public static int fetchNumber (String message){
        Integer number = null;
        do {
            try {
                System.out.print(message);
                number = scanner.nextInt(); // intenta leer un número entero
            } catch (InputMismatchException e) {
                 // maneja el error si el usuario ingresa algo que no es un número entero
                System.out.println("Error: Por favor, ingrese un número valido. Los caracteres no son aceptados..");
                scanner.nextLine(); // limpiar el buffer del scanner
            };
        } while (number == null); // bucle ques se repite hasta que se ingrese un número válido
        return number; // devuelve el número ingresado
    }

    // método para rellenar el arreglo
    public static void fillArray (int[] array) {
        // índice desde el cual se comenzará a rellenar el arreglo
        int lastIndex  = 0;


        while (lastIndex  < array.length) {
            // número con el que se desea rellenar el array
            int fillArrayNumber  = fetchNumber("Ingrese el número con el que desea llenar el array: ");
            
            // pide el índice hasta donde se quiere rellenar el array
            int fillUpToIndex  = fetchNumber("índice hasta donde quiere rellenar el arreglo (Índice Actual " + lastIndex  + "): ");

            // valida que el índice ingresado sea mayor que el último índice y esté dentro de los límites del array
            while (fillUpToIndex  <= lastIndex  || fillUpToIndex  > array.length) {
                System.out.println("Índice inválido. Debe ser mayor que " + lastIndex  + " y menor o igual que " + array.length + ".");
                fillUpToIndex  = fetchNumber("índice hasta donde quiere rellenar el arreglo (Índice Actual " + lastIndex  + "): ");
            }

            // rellena el arreglo desde lastIndex hasta fillUpToIndex con el número ingresado
            Arrays.fill(array, lastIndex , fillUpToIndex , fillArrayNumber );

             // actualiza lastIndex al último índice rellenado
            lastIndex  = fillUpToIndex ;

            // imprime el estado actual del arreglo después de cada llenado
            if (lastIndex == array.length) System.out.println("Arreglo final: " +  Arrays.toString(array));
            else System.out.println("Arreglo actualizado: " +  Arrays.toString(array));
        }
    }
}