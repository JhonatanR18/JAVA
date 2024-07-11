import java.util.Scanner;
public class Desafío02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una contraseña: ");
        String contraseña = scanner.next();
        // verificamos los criterios de la contraseña
        boolean tieneMinúscula = tieneMinúscula(contraseña);
        boolean tieneMayúscula = tieneMayúscula(contraseña);
        boolean tieneNumero = tieneNúmero(contraseña);
        boolean tieneCarácterEspecial = tieneCarácterEspecial(contraseña);
        // if para evaluar si la contraseña es segura
        if (contraseña.length() >= 8 & tieneMinúscula & tieneMayúscula & tieneNumero & tieneCarácterEspecial) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else { // si la contraseña no cumple con todos los criterios se ejecuta lo siguiente:
            System.out.println("Contraseña no segura: la contraseña debe tener al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial.");
        } // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
    // método para verificar si la contraseña tiene al menos una letra minúscula
    public static boolean tieneMinúscula(String palabra){
        for (int i = 0; i < palabra.length(); i++){
            char carácter = palabra.charAt(i);
            if (Character.isLowerCase(carácter)){
                return true; // retorna true si encuentra al menos una minúscula
            }
        } return false; // retorna false si no encuentra ninguna minúscula
    }
    // método para verificar si la contraseña tiene al menos una letra mayúscula
    public static boolean tieneMayúscula(String palabra){
        for (int i = 0; i < palabra.length();i++){
            char carácter = palabra.charAt(i);
            if (Character.isUpperCase(carácter)){
                return true; // retorna true si encuentra al menos una mayúscula
            }
        } return false; // retorna false si no encuentra ninguna mayúscula
    }
    // método para verificar si la contraseña tiene al menos una letra número
    public static boolean tieneNúmero(String palabra) {
        for (int i = 0; i < palabra.length(); i++){
            char carácter = palabra.charAt(i);
            if (Character.isDigit(carácter)) {
                return true; // retorna false si no encuentra ninguna número
            }
        } return false; // retorna false si no encuentra ningún número
    }
    // método para verificar si la contraseña tiene al menos un carácter especial
    public static boolean tieneCarácterEspecial (String palabra){
        for (int i = 0; i < palabra.length(); i++){
            char carácter = palabra.charAt(i);
            // si la contraseña no tiene una letra o un número quire decir que se ingreso un carácter especial
            if (!Character.isLetterOrDigit(carácter)) { 
                return true; // retorna true si encuentra al menos un carácter especial
            }
        } return false; // retorna false si no encuentra ningún carácter especial
    }
}
