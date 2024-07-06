import java.util.Scanner;
// Identificador de número par o impar
public class ActividadIntegradora01 {
    public static void main(String[] args) {
        // instancia scanner
        Scanner scanner = new Scanner(System.in);
        // solicitamos  y almacenamos el número ingresado
        System.out.print("Ingrese número: ");
        int número = scanner.nextInt();
        // verificamos si el número es par o impar
        System.out.println(número % 2 == 0? "El número es par." : "El número es impar." );
        // cerramos scanner
        scanner.close();
    }
}
// creando una calculadora básica
class calculadora {
    public static void main(String[] args) {
        System.out.println("Calculadora"); // name calculator
        Scanner scanner = new Scanner(System.in); // creamos la instancia scanner
        // Solicitamos y almacenamos el primer número ingresado
        System.out.print("Ingrese el primer número: ");
        int número01 = scanner.nextInt();
        // Solicitamos y almacenamos el segundo número ingresado
        System.out.print("Ingrese el segundo número: ");
        int número02 = scanner.nextInt();
        // lista de opciones - operaciones
        System.out.println("1 - sumar\n2 - restar\n3 - multiplicar\n4 - dividir");
        // solicitamos el número de operación que desea realizar
        System.out.print("Ingrese el número de opción del calculo que quieras realizar: ");
        int option = scanner.nextInt();
        // de acuerdo a la operación seleccionada se ejecutara su operación correspondiente
        if (option == 1) {
            String suma = "El resultado es: " + (número01 + número02);
            System.out.println(suma);
        } else if (option == 2) {
            String resta = "El resultado es: " + (número01 - número02);
            System.out.println(resta);
        } else if (option == 3) {
            String multiplicar = "El resultado es: " + (número01 * número02);
            System.out.println(multiplicar);
        } else if (option == 4) {
            if (número02 == 0) {
                System.out.println("Error, no se puede dividir entre 0.");
            } else {
                String dividir = "El resultado es: " + (número01 / número02);
            System.out.println(dividir);
            }
        } else {
            System.out.println("Opción no valida.");
        }
        // cerramos scanner
        scanner.close();
    }
}