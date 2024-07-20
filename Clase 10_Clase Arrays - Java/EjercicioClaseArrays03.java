// Actividad: Comparando arreglos
// Escribe un programa que compare dos arreglos de enteros utilizando el método Arrays.equals(). 
// El programa debe imprimir si los arreglos son iguales o no.
import java.util.Arrays;
public class EjercicioClaseArrays03 {
    public static void main(String[] args) {
        // declaramos y inicializamos el primer arreglo de enteros
        int [] array = {1,2,3,4,5,6};
        System.out.println("Array Nro 01 -> " + Arrays.toString(array));
        // declaramos y inicializamos el primer arreglo de enteros
        int [] array2 = {1,2,3,4,5,6};
        System.out.println("Array Nro 02 -> " + Arrays.toString(array2));
        // Arrays.equals() para comparar los dos arreglos
        if (Arrays.equals(array,array2)) {
            // si son iguales devuelve true
            System.out.println("El array 1 y el array 2 son iguales.");
        } else {
            // si no son iguales devuelve false
            System.out.println("El array 1 y 2 no son iguales.");
        }
    }
}
