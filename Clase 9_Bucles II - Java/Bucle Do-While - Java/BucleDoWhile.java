import java.util.Scanner;
public class BucleDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // variable que va almacenar el número ingresado
        int numero = 0;
        // do-While para que solicite que se ingrese un número 
        do {
            System.out.print("Ingrese un número mayor a 0: ");
            numero = scanner.nextInt();
        } while (numero <= 0); // si el número es menor o igual a 0, el programa seguirá solicitando al usuario que ingrese otro número.
        // Esto continuará hasta que el usuario ingrese un número mayor que 0.
        
        // una vez que se detiene el bucle imprimirá lo siguiente
        System.out.println("Ingresaste: " + numero);
        // cierre del objeto scanner
        scanner.close();
    }
}