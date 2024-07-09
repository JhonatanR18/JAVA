import java.util.Scanner;
// Actividad: Calculando la potencia
// Escribe un programa que pida al usuario dos números enteros, representando la base y el exponente, y calcula el resultado de elevar la base al exponente utilizando el método pow() de la clase Math. Muestra el resultado en pantalla.
public class EjercicioClaseMath04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        System.out.println("Calculadora de Potencia");
        System.out.print("Ingrese la base: "); // pedimos ingresar la base de la potencia
        int base = scanner.nextInt(); // lee la base ingresada
        System.out.print("Ingrese el exponente: "); // pedimos ingresar el exponente de la potencia
        int exponente = scanner.nextInt(); // lee el exponente ingresado
        //  Math.pow(base, exponente) para calcular la potencia 
        int resultado =(int) Math.pow(base, exponente);
        // imprimimos el resultado
        System.out.println("Resultado: " + resultado);
        scanner.close(); // cierre del objeto scanner para liberar recursos
    }
}
