// Actividad: Calculando el promedio 
// Genera un array de 20 elementos de tipo float, inicializándose con los números de tu elección. 
// Luego, suma todos los elementos del array y calcula su promedio. 
// Finalmente, muestra por consola tanto el resultado de la suma como el promedio de los elementos.
// Te sugerimos implementar el uso de la sintaxis de for-each.
public class EjercicioBucleForEach02 {
    public static void main(String[] args) {
        // array de 20 elementos de tipo float con valores ya inicializados
        float [] array = {
            12.34f, 45.67f, 89.01f, 23.45f, 67.89f,
            12.56f, 78.90f, 34.21f, 56.78f, 91.23f,
            87.65f, 43.21f, 65.43f, 78.12f, 90.34f,
            21.45f, 54.32f, 67.89f, 98.76f, 34.56f
        };
        // variable que ira acumulando la suma de los elementos del array
        float suma = 0f;
        // bucle for para recorrer cada elemento del array
        for (float num : array){
            suma = suma + num; // sumamos cada elemento del array con la variable suma
        }
        // imprime el resultado total de la suma de todos los elementos
        System.out.println("Resultado de la suma: " + suma);
        // calculamos el promedio dividiendo el resultado de la suma entre el número de elementos del array
        float promedio = suma / array.length;
        // imprimimos el promedio de los elementos del array
        System.out.println("El promedio de los elementos es de: " + promedio);
    }
}
