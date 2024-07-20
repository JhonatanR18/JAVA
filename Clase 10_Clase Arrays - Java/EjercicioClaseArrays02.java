// Actividad: Búsqueda binaria
// La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en una lista ordenada de elementos. 
// La clase Arrays ya incluye su implementación mediante el método binarySearch(). 
// Escribe un programa que realice una búsqueda binaria en un arreglo ordenado de enteros 
// utilizando el método Arrays.binarySearch(). 
// El programa debe imprimir el arreglo generado originalmente, 
// solicitar al usuario el valor buscado e 
// imprimir el índice del valor buscado si está presente en el arreglo.
import java.util.Arrays;
import java.util.Scanner;
public class EjercicioClaseArrays02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declaramos y inicializamos un arreglo de números enteros
        int [] enteros = {1, 2, 3, 4, 123, 6, 7, 8, 9, 10};
        // imprime el arreglo original
        System.out.println("Arreglo original: " + Arrays.toString(enteros));
        // ordena el arreglo para realizar la búsqueda binaria
        Arrays.sort(enteros);
        System.out.println("Arreglo ordenado: " + Arrays.toString(enteros));
        // solicitud para que se ingrese el valor a buscar
        System.out.print("Ingrese el valor a buscar: ");
        int buscar = scanner.nextInt();
        // realiza la búsqueda binaria en el arreglo ordenado
        int index = Arrays.binarySearch(enteros, buscar);
        // verifica si el valor buscado esta en el arreglo y muestra el resultado
        if(index < 0){
            System.out.println("El número " + buscar + " no esta en el arreglo.");
        } else {
            System.out.println("El número " + buscar + " esta en el indice " + index + " del arreglo.");
        }
        // cierre del objeto scanner
        scanner.close();
    }
}
