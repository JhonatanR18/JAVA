import java.util.Arrays;
import java.util.Scanner;
// Actividad: Encontrando el máximo
// Escribe un programa en el cual se cree una variable de tipo array que contenga cinco elementos de tipo entero, ingresados por el usuario. El programa debe buscar el máximo e imprimir por consola el resultado utilizando solamente las herramientas adquiridas hasta el momento.
class EjercicioArrays03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // declaración del array de enteros con longitud de 5
        int [] números = new int[5];
        // solicitud al usuario para que ingrese los elementos
        System.out.print("Ingrese primer elemento: ");
        números[0] = scanner.nextInt();
        System.out.print("Ingrese segundo elemento: ");
        números[1] = scanner.nextInt();
        System.out.print("Ingrese tercer elemento: ");
        números[2] = scanner.nextInt();
        System.out.print("Ingrese cuarto elemento: ");
        números[3] = scanner.nextInt();
        System.out.print("Ingrese quinto elemento: ");
        números[4] = scanner.nextInt();
        // encuentra el número mayor utilizando Arrays.stream(números).max().getAsInt()
        int numMayor = Arrays.stream(números) // convierte el array 'números' en un IntStream
        // intStream representa una secuencia especializada de valores enteros en Java,
        // utilizada aquí para manipular y encontrar el valor máximo en el array 'números'.        
                                            .max() // encuentra el valor máximo en el IntStream
                                            .getAsInt(); // obtiene el valor máximo como un entero
        System.out.println("El número mayor usando IntStream es: " + numMayor);
        // encuentra el número mayor utilizando un bucle for
        // inicializamos una variable para almacenar el número mayor encontrado
        int numeroMayor = números[0]; 
        // iteramos sobre el array para encontrar el número mayor
        for ( int i = 1; i < números.length; i++){
            // compara cada elemento del con el número mayor encontrado hasta ahora 
            if (números[i] > numeroMayor){
                // si encontramos un número mayor, actualizamos numeroMayor
                numeroMayor = números[i];
            }
        }
        // imprimimos el número mayor encontrado
        System.out.println("El número mayor usando un bucle for es: " + numeroMayor);
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}