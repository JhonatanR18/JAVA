import java.util.Scanner;
// Actividad: Calculando el valor absoluto
// Escribe un programa que  pida al usuario un número entero y muestra en pantalla su valor absoluto utilizando el método abs() de la clase Math.
public class EjercicioClaseMath010203 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        System.out.print("Ingrese por favor un número entero: "); // realiza una petición
        int numeroEntero = scanner.nextInt(); // lee el número ingresado
        // utiliza Math.abs() para mostrar el valor absoluto del número ingresado
        System.out.print("El valor absoluto del número ingresado es: " + Math.abs(numeroEntero));
        // cerramos la instancia scanner para liberar recursos
        scanner.close();
    }
}
// Actividad: Redondeo de números
// Escribe un programa que pida al usuario un número decimal y muestra en pantalla su valor redondeado utilizando el método round() de la clase Math.
class EjercicioClaseMath02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        System.out.print("Ingrese un número decimal a redondear: "); // realiza una petición
        float numero = scanner.nextFloat(); // lee el número ingresado
        // utilizamos Math.round() que hace el redondeo de un número al entero más cercano
        System.out.println("Número redondeado: " + Math.round(numero));
        scanner.close(); // cerramos la instancia scanner para liberar recursos 
    }
}
// Actividad: Generando números aleatorios
// Escribe un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 355  utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.
class EjercicioClaseMath03 {
    public static void main(String[] args) {
        // genera un número aleatorio en el rango del 1 al 355
        double random = (Math.random() * (355 - 1 + 1) + 1);
        // redondea el número hacia abajo y lo imprime
        System.out.println(Math.floor(random));
    }
}