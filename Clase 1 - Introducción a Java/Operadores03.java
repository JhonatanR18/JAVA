import java.util.Scanner;
// verificación de edad
public class Operadores03 {
    public static void main(String[] args) {
        // creamos la instancia scanner
        Scanner veriEdad = new Scanner(System.in);
        System.out.print("Ingrese su año de nacimiento: ");
        int añoNacimiento = veriEdad.nextInt(); // almacenamos el año ingresado en una variable
        final int AÑO_ACTUAL = 2024; // constante con el año actual
        int calculoEdad = AÑO_ACTUAL - añoNacimiento; // calculamos la edad
        // determinamos si el usuario es mayor o menor de edad
        System.out.println(calculoEdad >= 18? "Eres mayor de edad. Tienes " + calculoEdad + " años de edad." : 
                                                "Eres menor de edad. Tienes " + calculoEdad + " años de edad.");
        veriEdad.close();
    }
}
// calculadora de área y perímetro
class ÁreaYPerímetro {
    public static void main(String[] args) {
        // instancia scanner
        Scanner scanner = new Scanner(System.in);
        // pedimos y almacenamos la base de un rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        // pedimos y almacenamos la altura de un rectángulo
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        // calculamos el area y mostramos en consola
        System.out.println("El área del rectángulo es: " + base * altura);
        // calculamos el perímetro y mostramos en consola
        System.out.println("El perímetro del rectángulo es de: " + (2 * (base + altura)));
        // cerramos scanner
        scanner.close();
    }
}