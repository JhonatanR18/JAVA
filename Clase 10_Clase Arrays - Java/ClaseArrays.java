// la clase Arrays es parte del paquete java.util y proporciona métodos estáticos útiles para trabajar con arrays en Java. A continuación, se describen algunos de los métodos más utilizados:
import java.util.Arrays;
public class ClaseArrays {
    public static void main(String[] args) {
        // Crear un array de enteros
        int[] numbers = {5, 3, 8, 1, 2};
        // Imprimir el array original
        System.out.println("Array original: " + Arrays.toString(numbers));
        // Ordenar el array
        Arrays.sort(numbers);
        System.out.println("Array ordenado: " + Arrays.toString(numbers));
        // Buscar un elemento en el array ordenado
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Índice del elemento 3: " + index);
        // Llenar el array con un valor específico
        Arrays.fill(numbers, 7);
        System.out.println("Array después de llenar con 7: " + Arrays.toString(numbers));
        // Copiar un array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Array copiado: " + Arrays.toString(copiedArray));
    }
}