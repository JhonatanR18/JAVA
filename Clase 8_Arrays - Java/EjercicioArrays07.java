// Actividad: Ejercicios Complementarios
// Sumando elementos en posiciones pares
// Desarrolla un programa que cree un array de tamaño 5 que almacene números enteros. Luego, suma los elementos ubicados en las posiciones pares del array (es decir, las posiciones 0, 2 y 4) y muestra por consola el resultado de la suma. Utiliza exclusivamente las herramientas aprendidas hasta el momento.
public class EjercicioArrays07 {
    public static void main(String[] args) {
        // creación del array con 5 números de tipo entero
        int [] array = {2, 5, 3, 7, 9};
        // variable que ira almacenando la suma de los elementos ubicados en posiciones pares del array
        int suma = 0;
        // for para recorrer cada posición del array y verificar si es par
        for (int i = 0; i < array.length; i++){
            if (i % 2 == 0) { // verificamos la posición del array es par (0, 2, 4)
                // sumamos el elemento ubicado en la posición par al total de la suma
                suma = suma + array[i]; 
            }
        } // imprime la suma de los elementos ubicados en las posiciones pares de array
        System.out.println("La suma de los elementos ubicados en las posiciones pares del array es: " + suma);
    }
}
