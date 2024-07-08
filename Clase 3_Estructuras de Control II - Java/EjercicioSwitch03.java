import java.util.Scanner;
// En esta actividad, vas a desarrollar un programa que mostrará un menú con las siguientes opciones:
// Opción 1: "Guardar" // Opción 2: "Cargar" // Opción 3: "Salir"
public class EjercicioSwitch03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menu de opciones
        System.out.println("-------Menu-------\n1: Guardar\n2: Cargar\n3: Salir");
        System.out.print("Ingrese la opción deseada: "); // solicitud al usuario
        int número = scanner.nextInt(); // lee el número ingresado por el usuario
        // switch para determinar la acción correspondiente a la opción ingresada
        String opción = switch (número){
            case 1 -> "Guardando..."; // Caso cuando el número es 1
            case 2 -> "Cargando..."; // Caso cuando el número es 2
            case 3 -> "Saliendo..."; // Caso cuando el número es 3
            default -> "Opción no valida."; // default para manejar cualquier entrada no válida
        };
         // Imprimir la acción correspondiente a la opción ingresada
        System.out.println(opción);
        scanner.close(); // cierre de scanner para liberar recursos
    }
}