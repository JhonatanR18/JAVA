import java.util.Scanner;
// verificación de contraseña
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // contraseña pre definida
        String contraseña = "Jhonatan188";
        // pedimos y almacenamos la contraseña ingresada
        System.out.print("Ingrese contraseña: ");
        String contraseñaIngresada = scanner.nextLine();
        System.out.println(contraseñaIngresada);
        // verificamos si la contraseña ingresada coincide con la contraseña almacenada
        if (contraseña.equals(contraseñaIngresada)) { // // El método equals() se utiliza para comparar el contenido de dos objetos String
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }
        scanner.close(); // cerramos el scanner
    }
}
