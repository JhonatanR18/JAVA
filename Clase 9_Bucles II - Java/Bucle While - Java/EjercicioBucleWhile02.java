import java.util.Scanner;
// Actividad:  Número de dígitos
// Escribe un programa que te pida que ingreses un número entero y utilice un bucle while para calcular la cantidad de dígitos de ese número. Por ejemplo, el número 4578 tiene 4 dígitos. El programa debe tener en cuenta que el 0 tiene una cifra y también contar las cifras de números negativos.
public class EjercicioBucleWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // solicitud a que se ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int número = scanner.nextInt();
        // guarda una copia del número original para mostrar al final
        int numOriginal = número;
        // variable para contar las cifras del número ingresado
        int cifras = 0;
        // caso especial cuando el número ingresado es 0
        if (número == 0) {
            cifras++; // se suma 1 a cifras cuando el número es 0
        } else { 
            // Math.abs () para tomar el valor absoluto al manejar números negativos
            número = Math.abs(número);
            // calculamos la cantidad de cifras utilizando el bucle while
            while (número > 0) {
                número = número / 10; // elimina el ultimo dígito
                cifras++; // incrementa el contador de cifras
            }
        }
        // muestra el número original y la cantidad de cifras calculadas
        System.out.println("El número " + numOriginal + " tiene: " + cifras + " Cifras");
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}
