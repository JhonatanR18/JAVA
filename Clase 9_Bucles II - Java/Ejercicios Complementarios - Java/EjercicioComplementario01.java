// Ejercicios Complementarios
// Tabla de multiplicar
// Escribe un programa que solicite al usuario un número entero y muestre la tabla de multiplicar de ese número utilizando un bucle while. El programa debe seguir solicitando números hasta que el usuario ingrese un valor igual a cero, en cuyo caso debería salir del bucle.
import java.util.Scanner;
public class EjercicioComplementario01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // variable que almacena el número ingresado
        int número;
        // mensaje inicial
        System.out.println("Tabla de multiplicar del 1 al 12");
        // do-while para seguir pidiendo números hasta que el usuario ingrese 0
        do {
            // solicitud a que se ingrese un número
            System.out.print("Ingrese número de la tabla a mostrar (0 para salir): ");
            número = scanner.nextInt(); 
            // si el número el mayor a 0, se muestra la tabla de multiplicar
            if (número > 0){ 
                int i = 1; // inicializa el contador
                while (i <= 12 ) { // bucle while para que muestre la tabla de multiplicar del 1 al 12
                    int multiplicación = i * número; // calcula la multiplicación 
                    System.out.println(número + " x " + i + " = " + multiplicación); // muestra el resultado
                    i++; // incrementa el contador el 1 por cada vuelta
                }
            } else if (número < 0) { // si el número es negativo, muestra el mensaje
                System.out.println("Ingrese un número positivo.");
            }
            // si el número es 0, el bucle terminara
        } while (número != 0); // continual el bucle mientras que número no sea 0
        // mensaje de salida
        System.out.println("Saliendo...");
        scanner.close(); // cierre del objeto scanner para liberar recursos
    }
}