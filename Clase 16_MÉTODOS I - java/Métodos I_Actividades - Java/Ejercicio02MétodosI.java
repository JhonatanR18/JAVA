// Actividad: ¡Manos a la obra!
// 1. Obtener datos: Perfeccionando la actividad de “imprimir datos”, no solo crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, sino a su vez, crea dos métodos para obtener el nombre y la edad, respectivamente. Ambos métodos deben recibir por parámetro un objeto de tipo "Scanner".
// 2. Usar una variable global: Modifica los métodos "obtenerNombre()" y "obtenerEdad()" para que no necesiten recibir el Scanner por parámetro. En su lugar, utiliza una variable global para acceder al Scanner y obtener los datos necesarios.
import java.util.Scanner;
public class Ejercicio02MétodosI {
    // variable global para el objeto Scanner
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // solicita el nombre
        System.out.print("Ingrese su nombre: ");
        // llama al método obtenerNombre para capturar el nombre ingresado
        String nombre = obtenerNombre();

        // solicita la edad
        System.out.print("Ingrese su edad: ");
        // llama al método obtenerEdad para capturar la edad ingresada
        int edad = obtenerEdad();

        // llama al método imprimirNombreYEdad para mostrar el nombre y la edad del usuario
        imprimirNombreYEdad(nombre, edad);
    }

    // método que imprime el nombre y la edad ingresada
    public static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // método que obtiene el nombre usando el Scanner global
    public static String obtenerNombre() {
        return scanner.nextLine();
    }

    // método que obtiene la edad usando el Scanner global
    public static int obtenerEdad() {
        return scanner.nextInt();
    }
}