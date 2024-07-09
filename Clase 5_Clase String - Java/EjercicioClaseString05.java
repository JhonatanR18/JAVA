import java.util.Scanner;
// Actividad: Conversión de Mayúsculas y Minúsculas
// Escribe un programa que pida al usuario ingresar una cadena de texto y muestre en pantalla la misma cadena, pero con todos los caracteres en mayúsculas o minúsculas. Utiliza los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión.
public class EjercicioClaseString05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        // solicita y lee el texto ingresado por el usuario
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        // muestra las opciones de transformación
        System.out.println("Convertir a: \n1. Mayúsculas\n2. Minúsculas");
        System.out.print("Opción a seleccionar: ");        
        int opción = scanner.nextInt(); // lee la opción seleccionada
        // switch para determinar la opción seleccionada    
        String opciónSeleccionada = switch (opción) {
            case 1 -> { 
                String mayúsculas = texto.toUpperCase(); // convierte el texto a mayúsculas
                yield "Texto convertido a mayúsculas: " + mayúsculas; // devuelve el texto convertido
            }
            case 2 -> { 
                String minúsculas = texto.toLowerCase(); // convierte el texto a minúsculas
                yield "Texto convertido a minúsculas: " + minúsculas; // devuelve el texto convertido
            }
            default -> "Opción invalida."; // caso por si se ingresa una opción invalida
        };
        System.out.println(opciónSeleccionada); // imprime el texto convertido
        scanner.close(); // cierre del scanner para liberar recursos
    }
}