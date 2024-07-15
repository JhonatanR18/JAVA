// Actividad: Contando Elementos Pares
// Escribe un programa que genere un array de 10 elementos de tipo entero.
// Inicializa cada elemento con un número aleatorio menor a 100 y
// luego imprime todos los elementos del array en una única línea. 
// Posteriormente, recorre el array para contar los elementos pares y muestra el total en la consola.
import java.util.Arrays;
public class EjercicioBucleForEach01 {
    public static void main(String[] args) {
        // inicializamos un array de 10 elementos
        int [] array = new int[10];
        // bucle for para inicializar cada elemento del array con un número aleatorio
        for (int i = 0; i < array.length;i++){
            int aleatorio = (int) (Math.random() * (100 - 1 + 1))+1; // generamos un número aleatorio entre 0 y 100
            array[i] = aleatorio; // asignamos el número aleatorio al elemento del array en la posición i
        }
        // imprime en una sola línea el array con los números aleatorios generados
        System.out.println(Arrays.toString(array));

        // variable que irá contando cuantos números pares hay en el array
        int pares = 0;
        // for each para recorrer cada elemento del array
        for (int num : array) {
            // si el sobrante de la division de num entre 2 es igual a 0 es par
            if (num % 2 == 0) {
                pares = pares + 1; // si el número es par, se le sumara +1 a la variable "pares"
            }
        }
        // imprime el total de números pares encontrados
        System.out.println("El total de números pares encontrados en el array es de: " + pares);
    }
}
