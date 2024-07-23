// Actividad: Verificando si una cadena contiene solo letras
// Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la cadena y utiliza Character.isLetter() para verificar si todos los caracteres son letras. Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no.
import java.util.Scanner;

public class EjercicioWrappers03 {
    public static void main(String[] args) {
        // crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // pide y lee la cadena de texto ingresada por el usuario
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        // variable que determinará si la cadena contiene solo letras
        boolean soloLetras = true;

        // recorre cada carácter en la cadena
        for (int i = 0; i < texto.length(); i++) {
            // verifica si el carácter actual es una letra
            if (!Character.isLetter(texto.charAt(i))) {
                // si el carácter no es una letra, la variable 'soloLetras' se establece en false
                soloLetras = false;
                break; // termina el bucle si se encuentra un carácter no letra
            }
        }

        // muestra un mensaje indicando si la cadena contiene solo letras
        if (soloLetras) {
            System.out.println("La cadena ingresada contiene solo letras.");
        } else {
            System.out.println("La cadena ingresada no contiene solo letras.");
        }

        // cierra el objeto Scanner para liberar recursos
        scanner.close();
    }
}

