// Actividad:Fibonacci
// Escribe un programa que imprima los primeros 8 términos de la serie de Fibonacci utilizando un bucle while. La serie de Fibonacci es una secuencia en la que cada número es la suma de los dos anteriores.
// La serie de Fibonacci comienza de la siguiente manera:
// Posición 0: 0
// Posición 1: 1
// Posición 2: 1 (la suma de la posición 0 y la posición 1, 0 + 1 = 1)
// Posición 3: 2 (la suma de la posición 1 y la posición 2, 1 + 1 = 2)
// Posición 4: 3 (la suma de la posición 2 y la posición 3, 1 + 2 = 3)
// Entonces, los primeros 5 términos (considerando el índice inicial 0) de la serie de Fibonacci son: 0, 1, 1, 2, 3.

// Sucesión de Fibonacci se trata de una serie infinita de números naturales que empieza con un 0 y un 1 y continúa añadiendo números que son la suma de los dos anteriores
public class AI_III_Ejercicio1 {
    public static void main(String[] args) {
        int términos = 2; // contador de términos
        int primerNumero = 0; // primer número de la serie
        int segundoNumero = 1; // segundo número de la serie
        int suma; // variable para almacenar la suma de los dos números anteriores
        
        // imprimir los primeros dos términos de la serie de Fibonacci
        System.out.println("Posición " + 0 + ": " + primerNumero);
        System.out.println("Posición " + 1 + ": " + segundoNumero);
        
        // bucle while para generar e imprimir los siguientes términos de la serie
        while (términos < 8) { // imprimir los primeros 8 términos
            suma = primerNumero + segundoNumero; // calcular el siguiente término
            System.out.println("Posición " + términos + ": " + suma);
            primerNumero = segundoNumero; // actualizar el primer número
            segundoNumero = suma; // actualizar el segundo número
            términos++; // incrementar el contador de términos
        }
    }
}