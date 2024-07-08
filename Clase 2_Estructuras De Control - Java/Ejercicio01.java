import java.util.Scanner;
// escribir un programa que solicite al usuario ingresar un número entre 0 y 100. Luego, el programa validará el número ingresado y mostrará la calificación correspondiente
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        // pedimos y almacenamos la puntuación obtenida
        System.out.print("Ingrese su Puntuación: ");
        int puntuación = scanner.nextInt();
        // validación de la puntuación ingresa
        if (puntuación >= 90 && puntuación <= 100) { // Si la puntuación está entre 90 y 100, se mostrará "A".
            System.out.println("Calificación final: A");
        } else if (puntuación >= 80 && puntuación <= 89) { // Si la puntuación está entre 80 y 89, se mostrará "B".
            System.out.println("Calificación final: B");
        } else if (puntuación >= 70 && puntuación <= 79) { // Si la puntuación está entre 70 y 79, se mostrará "C".
            System.out.println("Calificación final: C");
        } else if (puntuación >= 60 && puntuación <= 69) { // Si la puntuación está entre 60 y 69, se mostrará "D".
            System.out.println("Calificación final: D");
        } else if (puntuación < 60 && puntuación >= 0) { // Si la puntuación es menor a 60, se mostrará "F".
            System.out.println("Calificación final: F");
        } else if (puntuación > 100 || puntuación < 0 ) { // si la puntuación esta fuera del rango establecido se mostrara el siguiente mss.
            System.out.println("La puntuación ingresada esta fuera del rango valido.");
        }
        scanner.close(); // cerramos scanner
    }
}