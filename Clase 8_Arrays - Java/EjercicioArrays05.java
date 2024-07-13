import java.util.Arrays;
import java.util.Scanner;
// Actividad: Copiando elementos
// Desarrolla un programa que inicie creando un array de 3 enteros, con valores predeterminados. Posteriormente, genera una copia del mismo con una extensión de 2 elementos adicionales.
// Solicita al usuario que ingrese dos números para ser almacenados en las nuevas posiciones del array.
// Finalmente, muestra por consola el contenido del nuevo array.
// Es esencial emplear exclusivamente las herramientas aprendidas hasta el momento, evitando el uso de bucles en el proceso.
public class EjercicioArrays05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // creación del array con 3 valores predeterminados
        int [] array = {2, 4, 6};
        // solicitud de que se ingresen dos números
        System.out.println("Ingrese 2 números");
        System.out.print("Número 01: ");
        int número01 = scanner.nextInt();
        System.out.print("Número 02: ");
        int número02 = scanner.nextInt();
        // crea la copia del array y se agregan 2 elementos adicionales
        int [] newArray = Arrays.copyOf(array, array.length + 2);
        // almacena los nuevos números ingresados en las nuevas posiciones del array
        newArray[3] = número01;
        newArray[4] = número02;
        // imprime el contenido del nuevo array
        System.out.println(Arrays.toString(newArray));
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}
