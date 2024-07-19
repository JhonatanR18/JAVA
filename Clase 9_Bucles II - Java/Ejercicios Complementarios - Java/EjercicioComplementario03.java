// Ejercicios Complementarios
// Calculadora de suma acumulada
// Crea un programa que solicite al usuario ingresar una serie de números enteros positivos. Utiliza un bucle do-while para ir acumulando la suma de los números ingresados. Después de cada entrada de número, pregunta al usuario si desea ingresar otro número. Si el usuario responde afirmativamente, continúa solicitando números; de lo contrario, muestra la suma acumulada de todos los números ingresados y termina el programa.
import java.util.InputMismatchException;
import java.util.Scanner;
public class EjercicioComplementario03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creación del objeto scanner 
        int suma = 0; // variable que acumula la suma de los números ingresados
        boolean continuar = true; // controla el bucle principal
        do {
            try {
                System.out.print("Ingrese un número entero positivo: ");
                int number = scanner.nextInt(); // lee el número entero ingresado
                // verifica que el número ingresado sea positivo
                if (number >= 0){
                    suma = suma + number; // acumula el número en la suma total
                    String respuesta; // variable que almacena la respuesta que ingresara el usuario
                    do {
                        System.out.println("¿Desea ingresar otro número? (Si/No)");
                        respuesta = scanner.next(); // lee la respuesta ingresada 
                        // si la respuesta es "no" el bucle termina
                        if (respuesta.equalsIgnoreCase("no")) {
                            continuar = false;
                        } else if (!respuesta.equalsIgnoreCase("si")){ 
                            // si la respuesta no es ni "si" ni "no", mostrar mensaje de error
                            System.out.println("Por favor, ingrese 'Si' o 'No'.");
                        }
                        // repite el bucle hasta obtener una respuesta válida
                    } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
                } else { // mensaje si el número no es positivo
                    System.out.println("El número debe ser positivo. Inténtelo de nuevo.");
                }
            } catch (InputMismatchException e) { // mensaje de error para entrada no numérica
                System.out.println("Error: Ingreso un carácter en lugar de un número.");
                scanner.next(); // limpia el buffer del scanner para evitar bucles infinitos
            }
            
        } while (continuar); // se repite el bucle mientras la variable continuar sea true
        // muestra la suma total
        System.out.println("La suma total de los números positivos ingresados es de: " + suma);
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}