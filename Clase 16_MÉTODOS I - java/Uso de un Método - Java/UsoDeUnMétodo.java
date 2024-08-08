import java.util.Arrays;
public class UsoDeUnMétodo {
    public static void main(String[] args) {
        int[] array = crearArrayAleatorio();
        // imprime el array
        System.out.print("Array: ");
        imprimirArray(array);
        // ordena del array
        ordenarEnFormatoAscendente(array);
        // imprime el array ordenado
        System.out.print("Array ordenado en forma ascendente: ");
        imprimirArray(array);

        int[] array2 = crearArrayAleatorio(5);
        // imprime el array
        System.out.print("Array: ");
        imprimirArray(array2);
        // ordena del array
        ordenarEnFormatoAscendente(array2);
        // imprime el array ordenado
        System.out.print("Array ordenado en forma ascendente: ");
        imprimirArray(array2);
    }
    // método de creación de un array con números aleatorios
    public static int[] crearArrayAleatorio(){
        int[] array = new int[10];
        for(int i = 0; i < array.length;i++){
            int aleatorio = (int) (Math.random() * 10 - 1 + 1) +1;
            array[i] = aleatorio;
        }
        return array;
    }
    // SOBRECARGA DE UN MÉTODO
    // permite utilizar el mismo nombre de método con diferentes conjuntos de parámetros,
    // lo que brinda flexibilidad al diseñar métodos con funcionalidades similares pero con diferentes formas de uso.
        public static int[] crearArrayAleatorio(int numero){
            int[] array = new int[numero];
            for(int i = 0; i < array.length;i++){
                int aleatorio = (int) (Math.random() * 10 - 1 + 1) +1;
                array[i] = aleatorio;
            }
            return array;
        }
    // método que imprime cada elemento del array
    public static void imprimirArray(int[] array) {
        for(int num : array){
            System.out.print("[" + num + "]");
        }
        System.out.println();
    }
    // método que ordena de forma ascendente los elementos del array
    public static void ordenarEnFormatoAscendente(int[] array) {
        Arrays.sort(array);
    }
}
