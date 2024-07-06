import java.util.Scanner;
// ESTRUCTURAS DE CONTROL IF
// determinando si el número ingresado es 
public class ClasificaciónDeNúmeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        // pedimos y almacenamos el número
        System.out.print("Ingrese número: ");
        int número = scanner.nextInt();
        // determinando con if | if - else si es positivo, negativo o cero.
        if (número < 0) {
            System.out.println("El número ingresado es negativo.");
        } else if (número == 0 ) {
            System.out.println("El número ingresado es cero.");
        } else if (número > 0) {
            System.out.println("El número ingresado es positivo.");
        } else {
            System.out.println("Error, dato incorrecto.");
        }
        scanner.close(); // cerramos scanner
    }
}