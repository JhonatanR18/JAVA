import java.util.InputMismatchException;
import java.util.Scanner;

public class MOEjercicio02MétodosII {
    // se crea un objeto Scanner para leer la entrada del usuario
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // se llama al método menú para iniciar el programa
        menú();
    }

    // método que muestra el menú, recibe la entrada del usuario y realiza las operaciones
    public static void menú() {
        int opción = 0;
        Double[] números = new Double[2];
        boolean salir = true;
        System.out.println("Bienvenido a la calculadora.");
        do {
            try {
                // se muestra el menú de opciones
                System.out.println("-----Menú-----");
                System.out.println("1 - Sumar");
                System.out.println("2 - Restar");
                System.out.println("3 - Multiplicar");
                System.out.println("4 - Dividir");
                System.out.println("5 - Salir");
                System.out.print("Ingrese opción: ");
                opción = scanner.nextInt(); // se lee la opción seleccionada por el usuario
                scanner.nextLine();
                
                // si la opción está en el rango válido, se piden los números
                if (opción >= 1 && opción <= 4) {
                    pedirNúmeros(números);
                    // se ejecuta la operación seleccionada usando un switch
                    switch (opción) {
                        case 1 -> imprimirResultado("suma", suma(números));
                        case 2 -> imprimirResultado("resta", resta(números));
                        case 3 -> imprimirResultado("multiplicación", multiplicación(números));
                        case 4 -> { 
                            // se verifica si la división es posible (no hay división por cero)
                            if (dividir(números) != null) {
                                imprimirResultado("División", dividir(números));
                            } else {
                                System.out.println("Error: División por cero.");
                                esperarEnter("Pulse Enter para retornar al menú...");
                            }
                        }
                    }    
                } else if (opción == 5) { // opción para salir del programa
                    System.out.println("Programa finalizado...");
                    salir = false;
                } else {
                    // si la opción no es válida, se muestra un mensaje de error
                    System.out.println("Entrada no válida. Seleccione una opción del 1 al 5.");
                    System.out.print("Pulse Enter para volver a intentarlo...");
                    scanner.nextLine();
                }
                
            } catch (InputMismatchException e) {
                // maneja la excepción si el usuario ingresa un dato que no es un número
                System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados..");
                scanner.nextLine(); // limpia el scanner para evitar un bucle infinito
                System.out.print("Pulse Enter para volver a intentarlo...");
                scanner.nextLine();
            }
        } while (salir); // se repite el menú hasta que el usuario decida salir
    }

    // método para sumar los números del array
    public static Double suma(Double[] números) {
        Double resultado = 0.0;
        for (Double número : números) {
            resultado += número;
        }
        return resultado;
    }

    // método para restar los números del array
    public static Double resta(Double[] números) {
        Double resultado = números[0];
        for (int i = 1; i < números.length; i++) {
            resultado -= números[i];
        }
        return resultado;
    }

    // método para multiplicar los números del array
    public static Double multiplicación(Double[] números) {
        Double resultado = 1.0;
        for (Double número : números) {
            resultado *= número;
        }
        return resultado;
    }

    // método para dividir los números del array
    public static Double dividir(Double[] números) {
        Double resultado = números[0];
        for (int i = 1; i < números.length; i++) {
            if (números[i] != 0) { // se verifica que el divisor no sea cero
                resultado /= números[i];
            } else {
                return null; // si hay división por cero, se retorna null
            }
        }
        return resultado;
    }

    // método para solicitar números al usuario
    public static void pedirNúmeros(Double[] números) {
        for (int i = 0; i < números.length; i++) {
            números[i] = null;
            do {
                try {
                    System.out.print("Número 0" + (i + 1) + ": ");
                    números[i] = scanner.nextDouble(); // se solicita el número
                    scanner.nextLine();
                } catch (InputMismatchException e) {
                    // maneja la excepción si el usuario ingresa un dato que no es un número
                    System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados..");
                    scanner.nextLine(); // limpia el scanner para evitar un bucle infinito
                }
            } while (números[i] == null); // se repite hasta que el número sea válido
        }
    }

    // método para imprimir el resultado de la operación
    public static void imprimirResultado(String operación, Double resultado) {
        System.out.println("Resultado de la " + operación + ": " + resultado);
        esperarEnter("Pulse Enter para retornar al menú...");
    }

    // método para pausar el programa hasta que el usuario presione Enter
    public static void esperarEnter(String mensaje) {
        System.out.print(mensaje);
        scanner.nextLine();
    }
}
