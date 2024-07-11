import java.util.InputMismatchException;
import java.util.Scanner;
// Actividad: Conversión de unidades de temperatura
// Escribe un programa que cumpla con las siguientes condiciones:
// 1. Solicita al usuario ingresar una temperatura y una unidad de medida: Celsius (C) o Fahrenheit (F).
// De Celsius a Fahrenheit - De Fahrenheit a Celsius
// 2. Convierte la temperatura a la otra unidad de medida y muestra el resultado en pantalla.
// 3. El programa debe manejar al menos las siguientes situaciones:
// Si ingresa una unidad de medida inválida, mostrará un mensaje de error.
// Si ingresa una temperatura no válida, mostrará un mensaje de error.
public class Desafío01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        try {
            // solicitar al usuario ingresar la temperatura
            System.out.print("Ingrese la temperatura: ");
            double temperatura = scanner.nextDouble(); // lee la temperatura ingresada
            System.out.print("Ingrese la unidad de medida (C/F): ");
            // solicitar al usuario ingresar la unidad de medida (C o F)
            String unidadDeMedida = scanner.next().toUpperCase();
            // convierte y muestra la temperatura según la unidad de medida ingresada
            if (unidadDeMedida.equals("C")) {
                // convierte de Fahrenheit a Celsius
                double FahrenheitACelsius = (temperatura - 32.0) * (5.0 / 9.0);
                System.out.println(temperatura + " grados Fahrenheit equivale a " + FahrenheitACelsius + " grados Celsius.");
            } else if (unidadDeMedida.equals("F")) {
                // convierte de Celsius a Fahrenheit
                double CelsiusAFahrenheit = temperatura * (9.0 / 5.0) + 32;
                System.out.println(temperatura + " grados Celsius equivale a " + CelsiusAFahrenheit + " grados Fahrenheit.");
            } else {
                // muestra un mensaje de error si la unidad de medida ingresada no es válida
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (InputMismatchException e){ // excepción si se ingresa una temperatura no numérica
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        } catch (Exception e) { // captura cualquier otra excepción no esperada
            System.out.println("Error inesperado.");
        } finally {
            // cierre del objeto Scanner para liberar recursos
            scanner.close();
        }
    }
}