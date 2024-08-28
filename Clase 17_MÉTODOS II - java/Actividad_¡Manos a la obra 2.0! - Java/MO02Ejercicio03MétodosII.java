// 3. Adivinar el número: Basándose en el ejercicio que ya has realizado, crea un método "numeroAleatorio()" que reciba por parámetro dos variables de tipo "int": un número máximo y un número mínimo. El método debe generar y devolver un número aleatorio dentro del rango especificado.
// Ejercicio anterior: “Adivinando un número” Escribe un programa que genere un número aleatorio entre 1 y 20, y muestra por consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while. El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas correctamente.

import java.util.InputMismatchException;
import java.util.Scanner;
public class MO02Ejercicio03MétodosII {
    public static Scanner scanner = new Scanner(System.in); // scanner global
    public static void main(String[] args) {
        // mensaje inicial 
        System.out.println("----------Adivina el número----------");

        // define el rango para el número aleatorio
        int[] rango = new int[2];
        definirRango(rango); // solicita el número máximo y el número mínimo

        // obtiene el valor mínimo y máximo del rango
        int rangoMin = rango[0];
        int rangoMax = rango[1];

        // genera un número aleatorio dentro del rango especificado
        int númeroAleatorio = generarNúmeroAleatorio (rangoMin, rangoMax);

        // proceso de adivinanza del número
        adivinarNúmero(númeroAleatorio);

        // cierre del objeto scanner
        scanner.close();
    }

    // genera un número aleatorio dentro del rango especificado
    public static int generarNúmeroAleatorio(int min, int max){
        System.out.println("Se acaba de generar un número aleatorio entre "+min+" y "+ max+".");
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    // solicita y valida el rango mínimo y máximo
    public static void definirRango(int[] rango) {
        System.out.println("Ingrese el rango del número aleatorio a generar");
        String mensajeNumMin  = "Número mínimo: ";
        rango[0] = númeroEntero(mensajeNumMin );
        boolean continuar = true;
        do {
            String mensajeNumMax  = "Número máximo: ";
            rango[1] = númeroEntero(mensajeNumMax);
            if (rango[1] <= rango[0]) {
                System.out.println("Error: el rango máximo no se puede ser menor o igual que el rango mínimo.");
                System.out.println("Vuelva a intentarlo.");
            } else continuar = false;
        } while (continuar);
        
    }

    // permite adivinar el número generado
    public static void adivinarNúmero(int númeroAleatorio) {
        boolean continuar = true;
        do {
            String mensajeIngreseNúm = "Ingrese el número que cree que es: ";
            int númeroIngresado = númeroEntero(mensajeIngreseNúm);
            if (númeroAleatorio > númeroIngresado) {
                System.out.println("Número incorrecto... Vuelva a intentarlo.");
                System.out.println("Pista -> El número aleatorio a adivinar es mayor al número que acabas de ingresar.");
            } else if (númeroAleatorio < númeroIngresado) {
                System.out.println("Número incorrecto... Vuelva a intentarlo.");
                System.out.println("Pista -> El número aleatorio a adivinar es menor al número que acabas de ingresar.");
            } else {
                System.out.println("Genial, adivinaste el número.");
                continuar = false;
            }
        } while (continuar);
    }

    // solicita un número entero con manejo de excepciones
    public static int númeroEntero(String mensaje) {
        boolean continuar = true;
        int número = 0;
        do {
            try {
                System.out.print(mensaje);
                número = scanner.nextInt();
                scanner.nextLine(); // limpiar el buffer del scanner
                continuar = false;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados..");
                scanner.nextLine(); // limpiar el buffer del scanner
            }
        } while (continuar);
        return número;
    }
}