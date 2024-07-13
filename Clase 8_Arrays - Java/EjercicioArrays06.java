// Actividad: Ejercicios Complementarios
// Conteo de Números Pares en un Array
// Escribe un programa en el que se cree una variable de tipo array que contenga seis elementos de tipo entero. El programa debe contar la cantidad de elementos pares presentes en el array y mostrar el resultado por consola utilizando solo las herramientas aprendidas hasta el momento.
public class EjercicioArrays06 {
    public static void main(String[] args) {
        // creación del array con 6 números de tipo entero
        int [] array = {1, 2, 3, 4, 5, 6};
        // CONTEO DE NÚMEROS PARES EN UN ARRAY UTILIZANDO UN BUCLE FOR
        // variable para ir contando la cantidad de números pares
        int pares = 0;
        // for para recorrer cada número y verificar si es par
        for (int i = 0; i < array.length; i++){
            // si el residuo de la división es 0, el número es par
            if (array[i] % 2 == 0) {  
                // suma +1 a la variable 'pares' cada que se encuentra un número par
                pares = pares + 1; 
            }
        } // imprime la cantidad de números pares encontrados
        System.out.println("La cantidad de números pares en el array es de: " + pares);

        // CONTEO MANUAL DE NÚMEROS PARES EN UN ARRAY
        // variable para ir contando la cantidad de números pares
        pares = 0;
        // verifica si cada elemento del array es par de manera individual
        if (array[0] % 2 == 0) {
            pares = pares + 1;
        }
        if (array[1] % 2 == 0) {
            pares = pares + 1;
        }
        if (array[2] % 2 == 0) {
            pares = pares + 1;
        }
        if (array[3] % 2 == 0) {
            pares = pares + 1;
        }
        if (array[4] % 2 == 0) {
            pares = pares + 1;
        }
        if (array[5] % 2 == 0) {
            pares = pares + 1;
        } // imprime la cantidad de números pares encontrados
        System.out.println("La cantidad de números pares en el array es de: " + pares);
    }
}