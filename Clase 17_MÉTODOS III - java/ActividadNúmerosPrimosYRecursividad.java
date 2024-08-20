// Actividad:  Números primos y recursividad
// Crea un método llamado "esPrimo()" que reciba por parámetro un "int" y devuelva un valor booleano que verifique si el número es primo o no. Luego, intenta modificar la lógica para resolverlo utilizando recursividad.
// Ejercicio anterior: “Números primos” - Clase 12_Desafió02_Ejercicio02
import java.util.InputMismatchException;
import java.util.Scanner;
public class ActividadNúmerosPrimosYRecursividad {
    public static Scanner scanner = new Scanner(System.in); // scanner global
    public static void main(String[] args) {
        int numero;
        do {
            numero = fetchNumber("Ingrese un número a verificar: ");
            // verifica si el número es primo
            boolean esPrimo = esPrimo(numero);
            if (!esPrimo) {
                System.out.println("El número " + numero + " no es primo. Intente con otro número.");
            } else {
                System.out.println("¡Felicidades! El número " + numero + " es primo.");
            }
        } while (!esPrimo(numero)); // repite hasta que se ingrese un número primo
        scanner.close(); // cierra el escáner
    }

    // método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        return esPrimo(numero, 2); // llama al método recursivo
    }

    // método recursivo para verificar si un número es primo
    public static boolean esPrimo(int numero, int divisor) {
        if (numero <= 1) return false; // números <= 1 no son primos
        if (divisor > Math.sqrt(numero)) return true; // no se encontró divisor
        if (numero % divisor == 0) return false; // número es divisible
        return esPrimo(numero, divisor + 1); // prueba con el siguiente divisor
    }

    // método para obtener un número válido del usuario
    public static int fetchNumber(String texto) {
        int number = 0;
        boolean validInput = false;
        do {
            try {
                System.out.print(texto);
                number = scanner.nextInt();
                scanner.nextLine();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados.");
                scanner.nextLine();
            }
        } while (!validInput); // repite hasta obtener una entrada válida
        return number; // devuelve el número
    }
}
