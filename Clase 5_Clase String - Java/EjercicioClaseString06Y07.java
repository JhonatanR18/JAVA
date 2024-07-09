import java.util.Scanner;
// Ejercicios complementarios: Reemplazo de Caracteres
// Escribe un programa que solicite al usuario ingresar una frase y dos caracteres. Utiliza el método replace() de la clase String para reemplazar todas las ocurrencias del primer carácter con el segundo carácter en la frase ingresada por el usuario. Muestra la frase resultante en pantalla.
public class EjercicioClaseString06Y07 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        System.out.print("Ingrese carácter a reemplazar: ");
        String primerCarácter = scanner.nextLine();
        System.out.print("Ingrese segundo carácter: ");
        String segundoCarácter = scanner.nextLine();
        String subCadena = frase.replace(primerCarácter, segundoCarácter);
        System.out.println("Frase con los caracteres reemplazados: " + subCadena);
        scanner.close();
    }
}
// Ejercicios complementarios: Eliminación de Espacios en Blanco al principio y al final
// Crea un programa que solicite al usuario ingresar una frase con espacios en blanco al principio y al final. Utiliza el método trim() de la clase String para eliminar los espacios en blanco y luego muestra la frase resultante en pantalla.
class EjercicioClaseString07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        // pedimos que se ingrese una frase con espacios en blanco
        System.out.print("Ingrese una frase con espacios en blanco al inicio y al final: ");
        String frase = scanner.nextLine(); // lee la frase ingresada
        // imprime la frase con espacios
        System.out.println("Frase con los espacios en blanco sin eliminar:" + frase);
        // elimina los espacios al inicio y al final
        String deleteSpace = frase.trim();
        // muestra la frase sin los espacios
        System.out.println("Frase con los espacios en blanco eliminados:" + deleteSpace);
        // cierre la instancia scanner para liberar recursos
        scanner.close();
    }
}