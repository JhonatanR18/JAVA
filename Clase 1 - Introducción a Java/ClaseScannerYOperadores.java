import java.util.Scanner; // Importa Scanner
public class ClaseScannerYOperadores {
    public static void main(String[] args) {
        System.out.println("Hola mundo :D");
    }
}
class ClaseScanner {
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
class ClaseOperadores {
    public static void main(String[] args) {
        // Realiza 5 operaciones básicas
        // operadores aritméticos +, -, *, /, %
        System. out.println("5 + 5 = " + (5+5));
        System.out.println("5 - 5 = " + (5-5));
        System.out.println("5 * 5 = " + (5*5)); // forzar a que el número que muestre sea en decimal, s se agrega d = double o f = float
        System.out.println("5 / 5 = " + (7d/5d)); 
        System.out.println("5 % 5 = " + (5%5));
        // Realiza una suma con la clase Scanner
        Scanner scannerSuma = new Scanner(System.in);
        System.out.print("Ingrese su primer número: ");
        int primerNúmero = scannerSuma.nextInt();
        System.out.print("Ingrese su segundo número: ");
        int segundoNúmero = scannerSuma.nextInt();
        System.out.print("La suma de las dos variables es: " + (primerNúmero + segundoNúmero));
    }
}