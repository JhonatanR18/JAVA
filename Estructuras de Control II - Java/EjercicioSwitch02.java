import java.util.Scanner;
// En esta actividad, desarrollarás un programa que solicitará al usuario ingresar una calificación numérica del 1 al 5. Luego, mostrará en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:
// 1: "Muy deficiente" // 2: "Deficiente" // 3: "Suficiente" // 4: "Notable" // 5: "Sobresaliente"
public class EjercicioSwitch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia Scanner
        System.out.print("Ingrese su calificación numérica del 1 al 5: "); // Solicitud al usuario
        int calificaciónNumérica = scanner.nextInt(); // Lee el número ingresado por el usuario
        // switch para convertir la calificación numérica a letras
        String calificación = switch(calificaciónNumérica){
            case 1 -> "Muy deficiente";
            case 2 -> "Deficiente";
            case 3 -> "Suficiente";
            case 4 -> "Notable";
            case 5 -> "Sobresaliente";
            default -> "Error, calificación invalida"; // default para manejar cualquier entrada fuera del rango 1-5
        };
        // Imprimir la calificación en letra
        System.out.println("Calificación: " + calificación);
        scanner.close(); // cierre de scanner para liberar recursos
    }
}
