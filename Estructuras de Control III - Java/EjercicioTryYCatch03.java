import java.util.Scanner;
// Actividad: Conversión de Cadena a Entero
// Escribe un programa que solicite al usuario ingresar una cadena de caracteres que represente un número entero. Utiliza el método Integer.parseInt() para convertir la cadena en un número entero. Implementa un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida en un número entero. En caso de que se produzca la excepción, muestra un mensaje apropiado en la pantalla.
public class EjercicioTryYCatch03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        String numString; // variable para almacenar la cadena ingresada
        int numEntero; // variable para almacenar el número entero convertido
        // bloque try - catch para manejar posibles excepciones
        try {
            // solicita al usuario ingresar un número como cadena
            System.out.print("Ingrese un número entero como cadena: ");
            numString = scanner.nextLine(); // lee la cadena ingresada
            numEntero = Integer.parseInt(numString); // convierte la cadena a un número entero
            System.out.println("El número entero ingresado es: " + numEntero); // muestra el número entero convertido
        } catch (NumberFormatException e){ // excepción en casos de que la cadena no sea un número entero valido
            System.out.println("Error: La cadena ingresada no es un número entero válido.");
            System.out.println("Revisar: " + e.getMessage()); // mensaje de error detallado
        } catch (Exception e) { // por si cualquier otra excepción inesperada
            System.out.println("Error: Ha ocurrido un error inesperado.");
        } finally {
            scanner.close(); // cierre del objeto scanner para liberar recursos            
        }
    }
}
