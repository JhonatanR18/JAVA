import java.util.Scanner;
// Actividad: Longitud de Cadena
// Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla su longitud utilizando el método length() de la clase String.
public class EjercicioClaseString01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        System.out.println("Calculadora de longitud de cadenas de texto");
        System.out.print("Ingrese una cadena de texto: "); 
        String texto = scanner.nextLine(); // almacena la cadena de texto ingresa
        int longitud = texto.length(); // devuelve el número de caracteres que contiene la cadena de texto
        // imprime el número de caracteres que contiene la cadena de texto ingresada
        System.out.println("La longitud de la cadena de texto ingresada es de: " + longitud);
        scanner.close(); // cierra el scanner para liberar recursos
    }
}
