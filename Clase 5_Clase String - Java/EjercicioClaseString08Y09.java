import java.util.Scanner;
// Ejercicios complementarios: Comparación de Cadenas
// Desarrolla un programa que solicite al usuario ingresar dos palabras. Utiliza el método equals() de la clase String para comparar si las dos palabras son iguales. Muestra un mensaje apropiado en pantalla indicando si las palabras son iguales o diferentes.
public class EjercicioClaseString08Y09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        // pide y lee tanto la primera como la segunda palabra ingresada 
        System.out.println("Ingrese dos palabras a comparar");
        System.out.print("Primera palabra: ");
        String palabra = scanner.nextLine(); // lee la primera palabra
        System.out.print("Segunda palabra: ");
        String palabra2 = scanner.nextLine(); // lee la segunda palabra ingresada
        // compara si las dos palabras son iguales
        boolean comparación = palabra.equals(palabra2);
        // verifica el resultado de la comparación
        if ( comparación == true){
            // si las palabras son iguales imprime lo siguiente:
            System.out.println(comparación + ": Las palabras son iguales.");
        } else {
            // si las palabras no son iguales imprime lo siguiente:
            System.out.println(comparación + ": Las palabras no son iguales.");
        }
        // cerramos la instancia scanner para liberar recursos
        scanner.close();
    }
}
// Ejercicios complementarios: Calculando la Longitud de Cadenas sin Espacios:
// En esta actividad, se solicita al usuario ingresar una cadena de texto y calcular su longitud, pero esta vez sin contar los espacios en blanco. Para lograr esto, se utilizará el método length() de la clase String y se realizará un proceso adicional para excluir los espacios de la cuenta.
class EjercicioClaseString09 {
    public static void main(String[] args) {
        // instancia scanner
        Scanner scanner = new Scanner(System.in);
        // pide que se ingrese una cadena de texto a calcular
        System.out.print("Ingrese una cadena de texto: ");
        // lee la cadena de texto ingresada
        String cadenaString = scanner.nextLine();
        // elimina los espacios en blanco de la cadena de texto ingresada
        String textoSinEspacios = cadenaString.replaceAll("\\s", "");
        // calcula y muestra la longitud de la cadena sin espacios en blanco
        System.out.println("La longitud de la cadena de texto sin espacios en blanco es: " + textoSinEspacios.length());
        // cierra scanner
        scanner.close();
    }
}