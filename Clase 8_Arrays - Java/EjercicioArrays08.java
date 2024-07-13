import java.util.Arrays;
import java.util.Scanner;
// Ordenando Nombres Alfabéticamente
// Desarrolla un programa que pida al usuario ingresar 4 nombres. Estos nombres serán ordenados alfabéticamente y posteriormente impresos en la consola. Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento.
public class EjercicioArrays08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // pedimos que se ingresen 4 nombres
        System.out.println("Ingrese 4 nombres");
        System.out.print("Nombre N° 01: ");
        String nombre01 = scanner.nextLine();
        System.out.print("Nombre N° 02: ");
        String nombre02 = scanner.nextLine();
        System.out.print("Nombre N° 03: ");
        String nombre03 = scanner.nextLine();
        System.out.print("Nombre N° 04: ");
        String nombre04 = scanner.nextLine();
        // creamos un array con los nombres ingresados
        String [] nombres = {nombre01, nombre02, nombre03, nombre04};
        // imprime el array desordenado
        System.out.println(Arrays.toString(nombres));
        // Utilizamos Array.sort() para ordenar los elementos del array alfabéticamente
        Arrays.sort(nombres);
        // imprime los los nombres ordenados alfabéticamente
        System.out.println("Nombres ordenados alfabéticamente: " + Arrays.toString(nombres));
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}
