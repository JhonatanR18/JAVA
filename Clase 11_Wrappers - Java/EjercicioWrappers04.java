// Actividad: Contando los espacios en blanco en una cadena
// Pídele al usuario que introduzca una cadena. Crea un bucle que recorra cada carácter en la cadena y utiliza Character.isWhitespace() para contar el número de espacios en blanco en la cadena. Muestra el recuento al usuario.
import java.util.Scanner;
public class EjercicioWrappers04 {
    public static void main(String[] args) {
        // crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // pide y lee la cadena de texto ingresada
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        // contador de espacios en blanco
        int espacios = 0;

        // bucle for para recorrer cada carácter de la cadena
        for (int i = 0; i < texto.length();i++){
            // verifica si el carácter es un espacio en blanco
            if(Character.isWhitespace(texto.charAt(i))){
                // incrementa el contador de espacios en blanco
                espacios++;
            }
        }
        // imprime la cantidad de espacios en blanco encontrados en la cadena
        System.out.println("Espacios encontrados en la cadena ingresada: " + espacios);
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}
