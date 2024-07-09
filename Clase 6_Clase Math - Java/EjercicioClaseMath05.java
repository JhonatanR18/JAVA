import java.util.Scanner;
// Actividad: Calculando la raíz cuadrada
// Escribe un programa que pida al usuario un número positivo y calcule su raíz cuadrada utilizando el método sqrt() de la clase Math. Si el número ingresado es negativo, muestra un mensaje adecuado en pantalla.
public class EjercicioClaseMath05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        System.out.println("Calculadora de raíz cuadrada");
        System.out.print("Ingrese un número positivo a calcular: "); // informamos sobre el número que queremos
        double numero = scanner.nextDouble(); // lee el numero ingresado
        // verifica si el número ingresado es no negativo
        if (numero >= 0) {
            // calcula la raíz cuadrada utilizando Math.sqrt
            double raízCuadrara = Math.sqrt(numero);
            // imprime el resultado de la raíz cuadrada
            System.out.println("La raíz cuadrada de " + numero +  " es: " + raízCuadrara);
        } else { // mensaje de erro por si el número ingresado el negativo
            System.out.println("Error: Por favor ingrese un número no negativo.");
        }
        scanner.close(); // cierre del objeto scanner para liberar recursos
    }
}