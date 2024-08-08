// 1. Es par: Reemplaza la lógica de pedir un número por un método llamado "solicitarNumero()" que no reciba parámetros y devuelva un entero. También reemplaza la condición del if por un método llamado "esPar()" que reciba por parámetro un entero y devuelva un booleano.
//    public static void main(String[] args) {
//         Scanner pepe = new Scanner(System.in);
//         Integer numero = null;
//         System.out.println("Por favor ingrese un número:");
//         do {
//             try {
//                 numero = pepe.nextInt();
//             } catch (Exception e) {
//                 pepe.nextLine();
//                 System.out.println("No ingresó un número, intente nuevamente:");
//             }
//         } while (numero == null);
//         if (numero % 2 == 0) {
//             System.out.println("El "+numero+" es par");
//         }
//     }
import java.util.InputMismatchException;
import java.util.Scanner;
public class MOEjercicio01MétodosII {
    // variable global del objeto scanner
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // llamada al método solicitarNúmero para obtener un número del usuario
        Integer número = solicitarNúmero();

        // imprime si el número es par o no utilizando el método esPar
        System.out.println("¿El número " + número + " es par?: " + esPar(número));

        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }

    // método que solicita al usuario un número entero
    public static Integer solicitarNúmero() {
        Integer número = null;
        do {
            try {
                System.out.print("Ingrese un número: ");
                número = scanner.nextInt(); // captura el número ingresado
                scanner.nextLine();
            } catch (InputMismatchException e) {
                // maneja la excepción si el usuario ingresa un dato que no es un número
                System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados..");
                scanner.nextLine(); // limpia el scanner para evitar un bucle infinito
            }
        } while (número == null); // repite hasta que se ingrese un número válido

        // retorna el número válido ingresado por el usuario
        return número; 
    }

    // método para determinar si un número es par
    public static boolean esPar(Integer número) {
        // retorna true si el número es par, false en caso contrario
        return número % 2 == 0;
    }
}