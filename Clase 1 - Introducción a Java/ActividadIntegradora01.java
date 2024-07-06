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
