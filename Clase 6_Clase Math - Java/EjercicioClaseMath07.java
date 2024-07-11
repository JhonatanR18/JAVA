import java.util.Scanner;
import java.util.InputMismatchException;
// Ejercicios complementarios: Generación aleatoria y análisis de raíz cuadrada
// Escribe un programa que cumpla con las siguientes condiciones:
// Pide al usuario que ingrese un número entre 1 y 30. Este número será almacenado en una variable llamada numeroLimite .
// Utiliza la clase Math para generar un número aleatorio entre 1 y el numeroLimite recibido del usuario.
// Utiliza el método Math.sqrt() para calcular la raíz cuadrada del número aleatorio generado y muéstrelo en pantalla.
// Analiza si el número aleatorio generado es primo y muestra un mensaje en pantalla indicando si lo es o no.
// Finalmente, muestra el número aleatorio generado y su raíz cuadrada en pantalla.
public class EjercicioClaseMath07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // try & catch para capturar posibles excepciones 
        try {
            // pedimos al usuario ingresar el número max entre 1 y 30 
            System.out.println("Ingrese un número entre 1 y 30");
            System.out.print("Número: ");
            int numeroLimite = scanner.nextInt(); // lee el número ingresado
            if (numeroLimite >= 1 && numeroLimite <=30) { // verificamos si el número ingresado esta dentro del rango permitido
                // generamos un número aleatorio entre 1 y el número ingresado por el usuario
                int numeroRandom = (int) (Math.random() * (numeroLimite - 1 + 1)) + 1; 
                System.out.println("Número aleatorio generado: " + numeroRandom); // imprimimos el número ingresado
                double raízCuadrada = Math.sqrt(numeroRandom); // calculamos la raíz cuadrada del número aleatorio
                System.out.println("La raíz cuadrada del número " + numeroRandom + " es de: " + raízCuadrada); // imprimimos la raíz del num
                boolean esPrimo = esPrimo(numeroRandom); // almacenamos en una variable el método para verificar si el número es primo
                if (esPrimo) { // si el número es primo imprime:
                    System.out.println("El número " + numeroRandom + " es Primo.");
                } else { // si el número no es primo imprime:
                    System.out.println("El número " + numeroRandom + " no es Primo.");
                }
            } else { // si el número ingresado no esta dentro del rango permitido imprimimos
                System.out.println("El número esta fuera del rango permitido.");
            }
        } catch (InputMismatchException e) { // captura cuando se ingresa un carácter no numérico
            System.out.println("Error: Ingreso un carácter en lugar de un número.");
        } catch (Exception e) { // captura cualquier otra excepción no esperada
            System.out.println("Error...");
        } finally { // cierre del objeto scanner para liberar recursos
            scanner.close();
        }
    }
    // método para verificar si el número es primo
    public static boolean esPrimo (int n) {
        if (n <= 1) return false; // un número menor o igual a 1 no es primo
        for ( int i = 2; i <= Math.sqrt(n); i++){ // itera desde 2 hasta la raíz cuadrada de n
            if (n % i == 0) return false; // si n es divisible por cualquier i no es primo
        } return true; // si no se encuentra ningún divisor, n es primo
    }
}