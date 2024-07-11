// La clase Math tiene muchos métodos útiles para varias operaciones matemáticas,
// como Math.sqrt(), Math.pow(), Math.max(), Math.min(), etc.
// A continuación solo veremos algunos
public class IntroducciónClaseMath {
    public static void main(String[] args) {
        System.out.println(Math.abs(-5)); // devuelve el valor absoluto de un número
        System.out.println(Math.random()); // devuelve un número aleatorio entre 0 y 1 en decimales
        // genera un número aleatorio entre 1 y 10, inclusive
        // el rango se calcula de la siguiente manera: (Math.random() * (max - min + 1)) + min
        int numeroEntero = (int) (Math.random()*(10-1+1)) + 1; // Convierte el resultado en un int, truncando la parte decimal.
        System.out.println(numeroEntero); // imprime el número aleatorio
    }
}