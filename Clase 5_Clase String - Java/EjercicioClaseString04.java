import java.util.Scanner;
// Actividad: Búsqueda de Caracteres
// Escribe un programa que pida al usuario ingresar una palabra y un carácter, y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String. Muestra un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.
public class EjercicioClaseString04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // solicitamos y almacenamos la palabra ingresada
        System.out.print("Ingrese una palabra: ");
        // solicitamos y almacenamos el carácter ingresado
        String palabra = scanner.nextLine();
        System.out.print("Ingrese un carácter a buscar: ");
        String carácter = scanner.nextLine();
        // indexOf para encontrar la posición del carácter en la palabra
        int índice = palabra.indexOf(carácter);
        // si índice no es igual a -1 quiere decir que se encontró el carácter
        if (índice != -1){ // -1 valor que nos da indexOf cuando no se encontró el carácter
            // imprime el mensaje indicando que el carácter fue encontrado
            System.out.println("El carácter '" + carácter + "' si se encuentra en la palabra: " + palabra);
        } else { // si indice es igual a -1 se va a imprimir lo siguiente, indicando que el carácter no fue encontrado
            System.out.println("El carácter '" + carácter + "' no se encuentra en la palabra: " + palabra);
        }
        scanner.close(); // cerramos el objeto scanner para liberar recursos
    }
}