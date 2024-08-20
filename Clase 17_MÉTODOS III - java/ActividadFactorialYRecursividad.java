// Actividad: Factorial y recursividad
// Crea un método llamado "factorial()" que tome un parámetro de tipo "int" y devuelva un valor entero que corresponda al cálculo del factorial del número proporcionado. Posteriormente, intenta modificar la lógica para resolverlo de manera recursiva.
// Ejercicio anterior: “Cálculo del factorial” - Clase 13_Desafío01_Ejercicio01
public class ActividadFactorialYRecursividad {
    public static void main(String[] args) {

        // número para calcular su factorial
        int número = 5;

        // llama al método y muestra el resultado
        System.out.println("El factorial de " + número + " es: " + calculoDeFactorial(número)); 
    }
    // método recursivo que calcula el factorial de un número
    public static int calculoDeFactorial(int num) {
        // caso base: el factorial de 0 o 1 es 1
        if (num == 0 || num == 1) {
            return 1;
        } else {
            // caso recursivo: n * factorial(n - 1)
            return num * calculoDeFactorial(num - 1);
        }
    }
}

