import java.util.Scanner;

public class MO02Ejercicio02MétodosII {
    // scanner global
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // se solicita que se ingrese una contraseña
        System.out.print("Ingrese contraseña: ");
        String contraseña = scanner.next();

        // verifica si la contraseña cumple con los criterios y muestra el mensaje correspondiente
        if (contraseñaCorrecta(contraseña)) System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        else System.out.println("Contraseña no segura: la contraseña debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");

        // cierre del objeto scanner
        scanner.close();
    }

     // verifica si la contraseña cumple con todos los criterios de seguridad
    public static boolean contraseñaCorrecta(String contraseña) {
        return passwordLength(contraseña) &&
                hasUpperCase(contraseña) &&
                hasLowerCase(contraseña) &&
                hasDigit(contraseña) &&
                hasCharacter(contraseña);
    }

    // verifica si la contraseña tiene al menos 8 caracteres
    public static Boolean passwordLength(String contraseña) {
        return contraseña.length() >= 8;
    }

    // verifica si la contraseña contiene al menos una letra mayúscula
    public static boolean hasUpperCase(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++){
            if (Character.isUpperCase(contraseña.charAt(i))){
                return true;
            }
        }
        return false;
    }

    // verifica si la contraseña contiene al menos una letra minúscula
    public static boolean hasLowerCase(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++){
            if (Character.isLowerCase(contraseña.charAt(i))){
                return true;
            }
        }
        return false;
    }

    // verifica si la contraseña contiene al menos un número
    public static boolean hasDigit(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++){
            if (Character.isDigit(contraseña.charAt(i))){
                return true;
            }
        }
        return false;
    }

    // verifica si la contraseña contiene al menos un carácter especial
    public static boolean hasCharacter(String contraseña) {
        for (int i = 0; i < contraseña.length(); i++){
            char c = contraseña.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
