import java.util.Arrays;
// Actividad: Ejercicios Complementarios
// Calcular suma acumulada:
// Escribe un programa que recorra un array de enteros y  calcule la suma acumulada de los elementos, reemplazando cada elemento por la suma acumulada hasta ese punto.El tamaño y los números  a contener pueden ser de tu elección.
public class EjercicioBucleFor05 {
    public static void main(String[] args) {
        // definimos un array de enteros
        int [] array = {1,2,3,4,5,6,7,8,9};      
        // variable para ir acumulando la suma
        int suma = 0;
        // recorre el array para calcular la suma
        for (int i = 0; i < array.length; i++){
            suma = suma + array[i]; // calculamos la suma acumulada
            array[i] = suma; // reemplazamos cada elemento por la suma acumulada hasta ese momento
        } 
        // imprimimos la suma acumulada total
        System.out.println("La suma acumulada de los elementos del array es de: " + suma);
        // imprimimos el array con las sumas acumuladas
        System.out.println(Arrays.toString(array));
    }
}