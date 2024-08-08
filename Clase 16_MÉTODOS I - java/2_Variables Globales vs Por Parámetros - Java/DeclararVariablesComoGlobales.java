import java.util.Scanner;
public class DeclararVariablesComoGlobales {
    // Declara la Variable Scanner de forma Global
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // llama al método1 y obtiene palabra
        System.out.print("Palabra: ");
        String palabra = método1();
        // llama al método2 y obtiene un número
        System.out.print("Número: ");
        int numero = método2();
        // imprime palabra
        System.out.println(palabra);
        // imprime número
        System.out.println(numero);
    }
    public static String método1() {
        return scanner.nextLine(); // lee y devuelve una línea de texto
    }
    public static int método2() {
        return scanner.nextInt(); // lee y devuelve una número entero
    }
}