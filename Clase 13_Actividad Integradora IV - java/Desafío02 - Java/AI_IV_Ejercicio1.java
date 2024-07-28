// Números primos plus
// Siguiendo el ejemplo del ejercicio de “números primos”, ahora el desafío es que desarrolles un programa que te solicite la cantidad deseada de números primos que deseas obtener.
// Tu programa deberá generar y mostrar la cantidad de números primos que hayas solicitado.
import java.util.Scanner;

public class AI_IV_Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // pedir al usuario la cantidad de números primos a obtener
        System.out.print("Cantidad de números primos a obtener: ");
        int cantidad = scanner.nextInt();
        
        int cantidadPrimos = 0; // contador de números primos encontrados
        int numero = 2; // primer número a verificar si es primo
        
        // bucle while que se ejecutara hasta encontrar la cantidad deseada de números primos
        while (cantidadPrimos < cantidad) {
            boolean esPrimo = true; // suponer que el número es primo
            
            // verificar si el número es primo
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false; // no es primo si es divisible por algún número
                    break;
                }
            }
            
            // si el número es primo, incrementa el contador y lo imprime
            if (esPrimo) {
                cantidadPrimos++;
                System.out.println("Primo N° " + cantidadPrimos + ": " + numero);
            }
            
            numero++; // aumenta en 1 para verificar el siguiente número
        }
        
        scanner.close(); // cerrar el scanner
    }
}
