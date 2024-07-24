// Actividad: Suma de números
// Pídele al usuario que introduzca una cadena que represente un número entero y luego otra cadena que represente un número decimal. Convierte cada cadena al tipo de dato correspondiente utilizando los métodos valueOf, suma sus valores e imprime por consola.
import java.util.Scanner;

public class EjercicioWrappers05 {
    public static void main(String[] args) {
        // crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true; // bandera para controlar el bucle
        int numeroEntero = 0; // inicializa la variable para el número entero
        double numeroDecimal = 0.0; // inicializa la variable para el número decimal

        // bucle para obtener un número entero válido
        do {
            try {
                // pide al usuario que ingrese una cadena que represente un número entero
                System.out.print("Ingrese una cadena que represente un número entero: ");
                String entero = scanner.next();
                // intenta convertir la cadena a un número entero
                numeroEntero = Integer.valueOf(entero);
                continuar = false; // sale del bucle si la conversión es exitosa
            } catch (NumberFormatException e) {
                // mensaje de error si la cadena no puede ser convertida a un número entero
                System.out.println("Error: La cadena ingresada no tiene el formato adecuado para ser convertida a un número.");
            } catch (Exception e) {
                // mensaje de error para cualquier otra excepción inesperada
                System.out.println("Error inesperado: " + e.getMessage());
            }
        } while (continuar);

        continuar = true; // restablece la bandera para el siguiente bucle

        // bucle para obtener un número decimal válido
        do {
            try {
                // pide al usuario que ingrese una cadena que represente un número decimal
                System.out.print("Ingrese una cadena que represente un número decimal: ");
                String decimal = scanner.next();
                // intenta convertir la cadena a un número decimal
                numeroDecimal = Double.valueOf(decimal);
                continuar = false; // sale del bucle si la conversión es exitosa
            } catch (NumberFormatException e) {
                // mensaje de error si la cadena no puede ser convertida a un número decimal
                System.out.println("Error: La cadena ingresada no tiene el formato adecuado para ser convertida a un número.");
            } catch (Exception e) {
                // mensaje de error para cualquier otra excepción inesperada
                System.out.println("Error inesperado: " + e.getMessage());
            }
        } while (continuar);

        // suma los dos números convertidos
        double suma = numeroEntero + numeroDecimal;
        // muestra el resultado de la suma
        System.out.println("La suma de los dos valores ingresados es: " + suma);

        // cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}