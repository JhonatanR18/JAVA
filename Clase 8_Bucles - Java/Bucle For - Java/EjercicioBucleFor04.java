import java.util.Arrays;
// Actividad: Ejercicios Complementarios
// Invertir un array
// Escribe un programa que recorra un array de enteros y lo invierta, es decir, que el primer elemento se convierta en el último y viceversa, luego imprime el array resultante por consola.  El tamaño y los números  a contener pueden ser de tu elección.
// IMPORTANTE: Debes invertir de forma permanente el orden de los elementos. Analiza si necesitas hacer uso de elementos auxiliares para concluir el ejercicio. 
public class EjercicioBucleFor04 {
    public static void main(String[] args) {
        // definimos un array de enteros
        int [] array = {1,2,3,4,5,6,7,8,9};
        // array original
        System.out.println(Arrays.toString(array));
        // variable temporal para intercambiar elementos
        int temp;
        // recorre la mitad del array para intercambiar los elementos
        for (int i = 0; i < array.length / 2; i++){
            // guardamos el valor actual en la variable temporal
            temp = array[i];
            // asignamos el valor del final del array al inicio
            array[i] = array[(array.length-1)-i];
            // asignamos el valor guardado en temp al final
            array[(array.length-1)-i] = temp;
        }
        // mostramos el array invertido
        System.out.println(Arrays.toString(array));
    }   
}