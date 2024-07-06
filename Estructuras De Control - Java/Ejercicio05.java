import java.util.Scanner;
// desarrolla un programa que solicite al usuario su edad y determine en qué categoría se encuentra.
public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: "); // solicitamos la edad
        int edad = scanner.nextInt(); // almacenamos la edad escrita
        // validamos 
        if (edad < 18 && edad >= 0 ) { // Si la edad es menor de 18 años, mostrar la categoría "Eres menor de edad".
            System.out.println("Eres menor de edad.");
        } else if (edad >= 18 && edad <= 64) { // Si la edad está entre 18 y 64 años (inclusive), mostrar la categoría "Eres adulto".
            System.out.println("Eres adulto.");
        } else if (edad >= 65) { // Si la edad es igual o mayor a 65 años, mostrar la categoría "Eres un adulto mayor".
            System.out.println("Eres adulto mayor.");
        } else {
            System.out.println("Edad no valida.");
        }
        scanner.close(); // cerramos scanner para evitar fugas de memoria
    }
}
