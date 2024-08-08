// Actividad: Ejercicios Complementarios
// Tabla de multiplicar
// En esta actividad, vas a crear un programa que solicita al usuario que ingrese un número (incluida la lógica en un método llamado pedirNumero())  y luego imprime la tabla de multiplicar de ese número del 1 al 10 (incluida la lógica en un método llamado imprimirTablaMultiplicar()). Para ello, implementarás un método que reciba el número ingresado por el usuario y que imprima la tabla de multiplicar correspondiente.
import java.util.Scanner;
public class Ejercicio03MétodosI {
    // variable global del objeto scanner
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("-----Tabla de multiplicar del 1 al 10-----");

        // invoca al método pedirNúmero()
        int número = pedirNúmero();

        // invoca al método imprimirTablaDeMultiplicar() para mostrar la tabla del número ingresado
        imprimirTablaDeMultiplicar(número);
    }

    // método para solicitar al usuario que ingrese un número
    public static int pedirNúmero() {
        System.out.print("Ingrese un número de tabla a generar: ");
        return scanner.nextInt();// devuelve el número ingresado
    }

     // método que imprime la tabla de multiplicar del número dado del 1 al 10
    public static void imprimirTablaDeMultiplicar(int número) {
        System.out.println("Tabla del número: " + número);
        // bucle para generar e imprimir la tabla de multiplicar
        for (int i = 1; i <= 10; i++){
            System.out.println(número + " * " + i + " = " + (número*i));
        }
    }
}
