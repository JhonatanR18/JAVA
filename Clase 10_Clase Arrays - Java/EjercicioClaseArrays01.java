// Actividad: Ordenar en forma descendente
// Escribe un programa en el que declares una variable de tipo array que contenga 10 elementos de tipo entero. Inicializa el arreglo con valores aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego Ordenarlo en forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los elementos ordenados en la consola.
import java.util.Arrays;
public class EjercicioClaseArrays01 {
    public static void main(String[] args) {
        // variable de tipo array que contiene 10 elementos
        int [] numbers = new int[10];
        // inicializamos el arreglo con valores aleatorios entre 1 y 100
        for (int i = 0; i < numbers.length; i++){
            int aleatorio = (int) (Math.random()*(100-1+1))+1;
            numbers[i] = aleatorio;
        }
        // imprime el arreglo inicial
        System.out.println("Array original: " + Arrays.toString(numbers));
        // clase Arrays.sort() que ordena de forma ascendente el arreglo
        Arrays.sort( numbers);
        // imprime el array ordenado de forma ascendente
        System.out.println("Array ordenado de forma ascendente: " + Arrays.toString(numbers));
        // bucle for para invertir el array y así obtener el orden descendente
        for (int i = 0; i < numbers.length/2; i++){
            int num = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = numbers[i];
            numbers[i] = num;
        }
        // imprime el array ordenado en forma descendente
        System.out.println("Array ordenado de forma descendente: " + Arrays.toString(numbers));
    }
}