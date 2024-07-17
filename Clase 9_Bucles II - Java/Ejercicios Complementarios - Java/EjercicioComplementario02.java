// Ejercicios Complementarios
// Contador de números pares e impares
// Escribe un programa que solicite al usuario ingresar una serie de números enteros. Utiliza un bucle while para contar la cantidad de números pares e impares ingresados hasta que el usuario decida terminar la entrada de números. Al finalizar, muestra la cantidad de números pares e impares ingresados
import java.util.ArrayList;
import java.util.Scanner;
public class EjercicioComplementario02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        ArrayList<Integer> numbers = new ArrayList<>(); // crea un array para almacenar los números ingresados
        int par = 0; // contador de números pares
        int impar = 0; // contador de números impares
        System.out.println("Ingresa números enteros (o ingresa 'fin' para terminar)");
        // bucle while que se detendrá cuando el usuario ingrese "Fin"
        while (true) {
            String input = scanner.nextLine(); // lee la entrada del usuario
            // verifica si se ingreso la palabra "Fin" (ignora mayúsculas y minúsculas)
            if (input.equalsIgnoreCase("fin")) {
                break; // cierra el bucle aquí mismo
            }
            try {
                int número = Integer.parseInt(input); // intenta convertir la entrada en un número
                numbers.add(número); // agrega el número convertido a la lista
                // verifica si el número es par o impar y actualiza los contadores
                if (número % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            } catch (NumberFormatException e) {
                // captura la excepción y muestra un mensaje de error si la entrada no es un número entero
                System.out.println("Error: Por favor ingresa un número entero (o ingresa 'fin para terminar')");
            } catch (Exception e){
                // captura cualquier otra excepción y muestra un mensaje de error genérico
                System.out.println("Error.");
            }
        }
        // verifica si no se ingreso ningún número
        if (par == 0 && impar == 0) {
            System.out.println("No ingresaste ningún número.");
        } else {
            // muestra la cantidad de números pares e impares ingresados
            System.out.println("Números pares en la lista ingresada: " + par);
            System.out.println("Números impares en la lista ingresada: " + impar);
        }
        // cierre del objeto scanner
        scanner.close();
    }
}