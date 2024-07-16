import java.util.Scanner;
// Actividad: Validación de contraseña
// Escribe un programa que solicite que ingreses una contraseña y la valide utilizando un bucle while. La contraseña correcta es "secreto". Continuará pidiéndote que ingreses la contraseña hasta que sea correcta.
public class EjercicioBucleDoWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        String contraseñaCorrecta = "secreto"; // contraseña correcta que debe ingresarse
        String contraseña; // variable que almacena la contraseña ingresada por el usuario
        // bucle do While para verificar que la contraseña sea correcta
        do {
            System.out.print("Ingrese contraseña: ");
            contraseña = scanner.nextLine(); // lee la contraseña ingresada por el usuario
            // si la contraseña ingresada no es igual a la contraseña correcta imprime los siguientes mensajes
            if (!contraseñaCorrecta.equals(contraseña)) { 
                System.out.println("Contraseña incorrecta... Vuelva a intentarlo.");
            }
        } // mientras contraseña no sea igual a contraseñaCorrecta el bucle se seguirá ejecutando
            while (!contraseñaCorrecta.equals(contraseña)); 
            // mensaje que se imprime cuando la contraseña ingresada es la correcta
        System.out.println("Bienvenido, contraseña correcta.");
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}
