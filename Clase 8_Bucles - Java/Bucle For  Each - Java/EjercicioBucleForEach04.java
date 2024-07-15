import java.util.Scanner;
// Contar ocurrencias
// Escribe un programa que cree un array de 50 elementos de tipo carácter, inicializando el array con una frase elegida. Luego, solicita al usuario un carácter objetivo y cuenta cuántas veces aparece ese carácter en el array. Finalmente, imprime el resultado por consola.
public class EjercicioBucleForEach04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // array de 50 elementos de tipo carácter
        char [] array = new char[50];
        // pedimos que se ingrese una frase
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        //for para inicializar el array con la frase ingresada
        for (int i = 0; i < array.length;i++){
            // si i es menor que la longitud de la frase ingresada
            if(i < frase.length()){
                array[i] = frase.toLowerCase().charAt(i); // asigna el carácter i de la frase al array i en minúscula
            } else { // si la frase tiene menos de 50 carácter, llenamos el resto con espacios
                array[i] = ' ';
            }
            
        }
        // pedimos que se ingrese el carácter objetivo
        System.out.print("Ingrese el carácter a contabilizar: ");
        String carácter = scanner.next().toLowerCase(); // lee el carácter ingresado en minúscula
        // variable que cuenta la cantidad de caracteres iguales al carácter ingresado 
        int contador = 0;
        // for para recorrer cada elemento del array
        for (char i : array) {
            // si el carácter ingresado es igual al carácter i del array se le sumara 1 al contador
            if (carácter.charAt(0) == i) { 
                contador = contador + 1;
            }
        }
        if (contador == 0){
            System.out.println("El carácter '" + carácter + "' no aparece en la frase.");
        } else {
            System.out.println("El carácter '" + carácter + "' aparece " + contador + " veces en la frase.");
        }
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}
