import java.util.Scanner; // Importa Scanner
public class ClaseScannerYOperadores {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in); // Crea Scanner
        System.out.print("Ingrese su Nombre: ");
        String nombre = miScanner.nextLine(); // Lee el nombre
        System.out.print("¡Bienvenido " + nombre + "!");
        miScanner.nextLine(); // Espera Enter
        System.out.print("Ingrese su edad: ");
        int edad = miScanner.nextInt(); // Lee la edad
        System.out.print("Guardando datos... El usuario se llama " + nombre + ", y tiene " + edad + " años.");
        miScanner.close(); // Cierra Scanner
    }
}