// Dibujando cuadrados
// Realiza un programa para crear un cuadrado de N elementos por lado utilizando el carácter “*”.
// Para ello  simplemente dibuja una línea de N asteriscos. Repite este proceso N veces para completar el cuadrado. 
// Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente
// ****
// *  *
// *  *
// ****
import java.util.Scanner;
public class AI_IV_Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int elementos = scanner.nextInt(); // tamaño del cuadrado
        int fila = 1;
        
        // dibujar la primera fila
        while (fila <= elementos) {
            System.out.print("*");
            fila++;
        }
        System.out.print("\n"); // nueva línea después de la primera fila
        
        // dibujar las filas intermedias
        int mitad = 1;
        while (mitad <= elementos - 2) {
            fila = 1;
            while (fila <= elementos) {
                if (fila == 1 || fila == elementos) {
                    System.out.print("*"); // dibujar asterisco en los bordes
                } else {
                    System.out.print(" "); // dibujar espacio en el medio
                }
                fila++;
            }
            System.out.print("\n"); // nueva línea después de cada fila intermedia
            mitad++;
        }
        
        // dibujar la última fila
        fila = 1;
        while (fila <= elementos) {
            System.out.print("*");
            fila++;
        }
        scanner.close();
    }
}