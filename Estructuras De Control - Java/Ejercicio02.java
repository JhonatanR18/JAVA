import java.util.Scanner;
// escribe un programa que solicite al usuario un número y determine si es divisible por 5, por 3, por ambos o por ninguno. El resultado se mostrará en pantalla.
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        // pedimos y almacenamos el número a determinar si es divisible por 5 o por 3
        System.out.print("Ingrese número: ");
        int número = scanner.nextInt();
        // validación si es:
        if (número % 5 == 0 && número % 3 == 0) { // divisible por ambos
            System.out.println("El número " + número + " es divisible tanto como por 5 como por 3."); 
        } else if (número % 5 == 0) { // divisible por 5
            System.out.println("El número " + número + " es divisible solo por 5");
        } else if (número % 3 == 0) { // divisible por 3
            System.out.println("El número " + número + " es divisible solo por 3");
        } else { // divisible por ninguno
            System.out.println("El número " + número + " no es divisible ni por 5, ni por 3");
        }
        scanner.close(); // cerramos scanner
    }
}
