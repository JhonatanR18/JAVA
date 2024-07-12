import java.util.Scanner;
// Actividad: Sumando elementos
// Escribe un programa en el cual se cree una variable de tipo array que contenga tres elementos de tipo entero. El programa debe sumar los tres elementos de forma manual e imprimir por consola el resultado utilizando solamente las herramientas adquiridas hasta el momento.
public class EjercicioArrays0102 {
    public static void main(String[] args) {
        // definimos un array de enteros con 3 elementos
        int [] números = {4, 6, 2};
        // calculamos la suma de los elementos del array
        int suma = números[0] + números[1] + números[2];
        // imprimimos la suma de los elementos del array
        System.out.println("La suma de los 3 números del array es: " + suma);
    }
}
// Actividad: Promediando elementos
// Escribe un programa en el cual se cree una variable de tipo array que contenga cuatro elementos de tipo entero. Estos elementos deben ser ingresados por el usuario. El programa debe sumar y promediar los cuatro elementos de forma manual e imprimir por consola el resultado, utilizando solamente las herramientas adquiridas hasta el momento.
class EjercicioArrays02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // declaración del array de enteros con longitud de 4
        int [] números = new int[4];
        // solicitud al usuario para que ingrese los elementos
        System.out.print("Ingrese primer elemento: ");
        números[0] = scanner.nextInt();
        System.out.print("Ingrese segundo elemento: ");
        números[1] = scanner.nextInt();
        System.out.print("Ingrese tercer elemento: ");
        números[2] = scanner.nextInt();
        System.out.print("Ingrese cuarto elemento: ");
        números[3] = scanner.nextInt();
        // calculamos el promedio de los elementos del array
        // Convertir números.length a double para obtener un promedio decimal preciso
        double promedio = (números[0] + números[1] + números[2] + números[3]) / (double)números.length;
        // imprimimos el promedio
        System.out.println("El promedio de los elementos es de: " + promedio);
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}