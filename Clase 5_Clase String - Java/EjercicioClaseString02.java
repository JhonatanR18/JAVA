import java.util.Scanner;
// Actividad:Concatenación de Cadenas
// Escribe un programa que solicite al usuario ingresar su nombre y apellido por separado, y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String.
public class EjercicioClaseString02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        // solicitamos y almacenamos el nombre ingresado en una variable
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        // Solicitamos y almacenamos los apellidos en variables distintas
        System.out.print("Apellido paterno: ");
        String apellidoPaterno = scanner.nextLine();
        System.out.print("Apellido materno: ");
        String apellidoMaterno = scanner.nextLine();
        //  .concat para concatenar las cadenas de texto ingresadas
        String nombreCompleto = nombre.concat(" " + apellidoPaterno + " " + apellidoMaterno);
        System.out.println("Nombre Completo: " + nombreCompleto); // imprimimos las cadenas de texto ya unidas
        scanner.close(); // cerramos la instancia scanner para liberar recursos
    }
}