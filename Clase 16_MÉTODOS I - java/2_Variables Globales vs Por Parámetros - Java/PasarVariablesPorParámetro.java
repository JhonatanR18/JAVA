import java.util.Scanner;
public class PasarVariablesPorParámetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // llama al método1 y obtiene palabra
        System.out.print("Palabra: ");
        String palabra = método1(scanner);
        // llama al método2 y obtiene un número
        System.out.print("Número: ");
        int numero = método2(scanner);
        // imprime palabra
        System.out.println(palabra);
        // imprime número
        System.out.println(numero);
    }
    // método que recibe un Scanner como parámetro y devuelve una cadena ingresada 
    public static String método1( Scanner scanner) {
        return  scanner.nextLine(); // lee y devuelve una línea de texto
    }
    // método que recibe un Scanner como parámetro y devuelve un número entero ingresado
    public static int método2(Scanner scanner) {
        return scanner.nextInt(); // lee y devuelve un número entero    
    }
}
