import java.util.Scanner;
// Ejercicios complementarios: Generando un número aleatorio entre dos límites
// Escribe un programa que pida al usuario ingresar dos números enteros: un límite inferior y un límite superior. Luego, utiliza el método random() de la clase Math para generar y mostrar en pantalla un número aleatorio dentro del rango especificado por los límites ingresados.
public class EjercicioClaseMath06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // pedimos que se ingresen dos números enteros
        System.out.println("Ingrese dos números enteros: ");
        // pedimos que se ingrese el limite inferior
        System.out.print("Límite inferior: ");
        // lee el número inferior ingresado
        int limiteInferior = scanner.nextInt();
        // pedimos que se ingrese el limite superior
        System.out.print("Límite superior: ");
        // lee el número superior ingresado
        int limiteSuperior = scanner.nextInt();
        // utilizamos math.random() para que nos de un número aleatorio de acuerdo al rango previamente especificado
        // (Math.random() * (max - min + 1) + min)
        int numeroRandom = (int) (Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior);
        // imprimimos el número aleatorio que obtuvimos
        System.out.println("Número aleatorio generado: " + numeroRandom);
        // cerramos el objeto scanner para liberar recursos
        scanner.close();
    }
}
