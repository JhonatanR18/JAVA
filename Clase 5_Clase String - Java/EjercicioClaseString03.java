import java.util.InputMismatchException;
import java.util.Scanner;
// Actividad:Extracción de SubCadena
// Escribe un programa que solicite al usuario ingresar una frase y dos números enteros, que representen un índice inicial y un índice final. Utiliza el método substring() de la clase String para extraer la subCadena que se encuentra entre los índices ingresados por el usuario, y muestra la subCadena resultante en pantalla.
public class EjercicioClaseString03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        // solicitud al usuario de que ingrese una frase
        System.out.println("Extracción de la subCadena de una frase");
        System.out.print("Ingrese frase: ");
        String frase = scanner.nextLine(); // almacena la frase ingresada
        // variables de los indices
        int índiceInicial = 0;
        int índiceFinal = 0;
        // bloque try catch para manejar posibles errores
        try {
            // solicita los dos números para los indices
            System.out.println("Ingrese dos números enteros, que representaran un índice inicial y un índice final.");
            System.out.print("Índice inicial: ");
            índiceInicial = scanner.nextInt(); // lee el índice inicial
            System.out.print("Índice final: "); 
            índiceFinal = scanner.nextInt(); // lee el índice final
            // validación de los índices ingresados
            if (índiceInicial < 0 || índiceFinal > frase.length() || índiceInicial >= índiceFinal) {
                System.out.println("Índices no validos."); // mensaje de que los índices ingresados no son validos
            } else {
                // extrae la subCadena  de la frase usando los índices previamente dados
                String subCadena = frase.substring(índiceInicial, índiceFinal);
                // imprime la subCadena
                System.out.println("SubCadena encontrada por los indices previamente establecidos: \n" + subCadena);
            }
        } catch (InputMismatchException e){ // mensaje error si se ingresa un carácter que no es un número
            System.out.println("Error: Ingreso un carácter en lugar de un número.");
        } catch (Exception e) { // mensaje por si se de cualquier otro error inesperado
            System.out.println("Ha ocurrido un error inesperado");
        } finally {
            scanner.close(); // cierre del objeto scanner para liberar recursos
        }
    }
}