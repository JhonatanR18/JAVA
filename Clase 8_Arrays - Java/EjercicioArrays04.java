import java.util.Scanner;
// Actividad: Buscando un elemento
// El programa debe crear un array de tamaño 3 que almacene números enteros. Luego, solicita un número al usuario y muestra por consola si ese número está presente en el array o no. Es importante utilizar únicamente las herramientas aprendidas hasta el momento, sin emplear bucles en el proceso.
public class EjercicioArrays04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declaración del array de enteros con longitud de 3
        int [] números = new int[3];
        // solicitud al usuario para que ingrese los elementos
        System.out.print("Ingrese primer número: ");
        números[0] = scanner.nextInt();
        System.out.print("Ingrese segundo número: ");
        números[1] = scanner.nextInt();
        System.out.print("Ingrese tercer número: ");
        números[2] = scanner.nextInt();
        // solicitud al usuario par que ingrese el número a buscar
        System.out.print("Ingrese número a buscar: ");
        int numeroBuscar = scanner.nextInt();
        // if para verificar si el número ingresado esta en el array
        if (números[0] == numeroBuscar || números[1] == numeroBuscar || números[2] == numeroBuscar){
            // imprime este mensaje si el número esta presente
            System.out.println("El número " + numeroBuscar + " si esta presente en el array.");
        } else { 
            // imprime este mensaje si el ´número ingresado no esta presente en el array
            System.err.println("El número " + numeroBuscar + " no esta presente en el array.");
        }
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}