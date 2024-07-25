// Actividad: Generando contraseñas
// Vas a desarrollar un programa en Java que genere una contraseña aleatoria. Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. La contraseña será almacenada en un arreglo de caracteres.
// Para generar la contraseña, utilizarás un bucle for que repetirá la operación tantas veces como la longitud de la contraseña especificada por el usuario.
// Para asegurarte de que la contraseña generada contenga al menos una letra mayúscula, una letra minúscula y un dígito, usaré bucles do-while y while junto con los métodos isUpperCase, isLowerCase e isDigit de la clase Character.
// Finalmente, convertirás el arreglo de caracteres en un String con un bucle for y luego imprimirás la contraseña generada en la consola.
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class AI_III_Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuar = true;
        int longitud = 0;

        // pide al usuario la longitud de la contraseña y valida la entrada
        do {
            try {
                System.out.print("Ingrese la longitud de la contraseña a generar: ");
                longitud = scanner.nextInt();
                if (longitud < 3) {
                    System.out.println("La longitud mínima de la contraseña es de 3.");
                } else {
                    continuar = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresó un carácter en lugar de un número.");
                System.out.println("Vuelva a intentarlo.");
                scanner.next(); // limpia el buffer del escáner
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        } while (continuar);

        // crea un array que almacenará cada letra o dígito generado
        char[] contraseñaChar = new char[longitud];

        // variables para asegurar al menos una mayúscula, una minúscula y un dígito
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;

        // bucle que se asegura de incluir al menos una mayúscula, una minúscula y un dígito
        while (!(hasUpperCase && hasLowerCase && hasDigit)) {
            for (int i = 0; i < longitud; i++) {
                char c;
                int tipo = random.nextInt(3); // decide aleatoriamente si el carácter será mayúscula, minúscula o dígito

                // genera un carácter aleatorio basado en el tipo
                switch (tipo) {
                    case 0 -> {
                        c = (char) (random.nextInt(26) + 'A'); // genera una letra mayúscula
                    }
                    case 1 -> {
                        c = (char) (random.nextInt(26) + 'a'); // genera una letra minúscula
                    }
                    default -> {
                        c = (char) (random.nextInt(10) + '0'); // genera un dígito
                    }
                }
                contraseñaChar[i] = c; // almacena el carácter en el array
            }

            // verifica si el array contiene al menos una mayúscula, una minúscula y un dígito
            for (int i = 0; i < longitud; i++) {
                if (Character.isUpperCase(contraseñaChar[i])) hasUpperCase = true;
                if (Character.isLowerCase(contraseñaChar[i])) hasLowerCase = true;
                if (Character.isDigit(contraseñaChar[i])) hasDigit = true;
            }

            // reinicia las variables si no se cumplen todas las condiciones
            if (!(hasUpperCase && hasLowerCase && hasDigit)) {
                hasUpperCase = false;
                hasLowerCase = false;
                hasDigit = false;
            }
        }

        // convierte el array de caracteres en un String y lo imprime
        String contraseña = new String(contraseñaChar);
        System.out.println("Contraseña generada: " + contraseña);
        scanner.close();
    }
}