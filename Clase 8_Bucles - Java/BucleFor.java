public class BucleFor {
    public static void main(String[] args) {
        // inicio de un bucle for que se ejecutará 10 veces
        for (int i = 1; i <= 10; i++ ){
            // int i = 1: Inicializa la variable de control del bucle con valor 1
            // i <= 10: condición del bucle. Mientras sea verdadera, el bucle sigue ejecutándose
            // i++: incrementa la variable de control en 1 después de cada iteración

            // Dentro del bucle, se imprime la tabla de multiplicar del 2
            System.out.println("2 x " + i + " = " + 2 * i);
            // imprime una cadena de texto que muestra la multiplicación de 2 por el valor actual de i

            // Explicación del funcionamiento del bucle:
            // 1. El bucle comienza con i igual a 1.
            // 2. Verifica la condición i <= 10. Si es verdadera, ejecuta el bloque de código dentro del bucle.
            // 3. Imprime "2 x " seguido del valor actual de i, seguido de " = " y el resultado de 2 * i.
            // 4. Después de imprimir, incrementa i en 1.
            // 5. Repite los pasos 2 a 4 hasta que i sea mayor que 10.
            // 6. Cuando i es mayor que 10, la condición i <= 10 se vuelve falsa y el bucle termina.
        }
    }
}
class BucleForConArrays {
    public static void main(String[] args) {
        // inicializa un array de número enteros
        int [] array = {2, 4, 5 ,3, 7, 6};
        // bucle for para recorrer el arreglo
        for (int i = 0; i < array.length; i++){
            // imprime el indice y el valor correspondiente del array
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
}