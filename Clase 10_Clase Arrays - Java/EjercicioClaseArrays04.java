// Actividad: Copiando parte de un arreglo. 
// Crea un programa en Java que declare y muestre un arreglo de enteros junto con sus índices. Luego, solicita al usuario dos índices: un índice inicial y un índice final. Con estos dos índices, copia la parte del arreglo original comprendida entre ellos (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrate de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos índices están dentro del rango válido del arreglo original. Finalmente, imprime el nuevo arreglo por consola.
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EjercicioClaseArrays04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declaramos y inicializamos un arreglo de números enteros
        int[] enteros = {13,22,33,42,51,67,79,85,9,10,1,21};

        // imprime el arreglo original
        System.out.println("------------------------Arreglo------------------------");
        System.out.println("     " + Arrays.toString(enteros));

        //imprime el índice y valores del arreglo
        System.out.println("------------------------Índice------------------------");
        int salto = 3; // determina cuando realizar un salto de linea para mejor visualización
        for(int i = 0; i < enteros.length; i++){
            // realiza un salto de linea cada 3 elementos para mejorar la legibilidad
            if (i == salto){
                System.out.print("\n");
                salto += 3;
            }
            // imprime el índice y el valor actual del elemento actual
            System.out.print("Índice " + i + " => " + enteros[i] );
            // agrega espacio entre los elementos, excepto después del ultimo elemento
            if (i != enteros.length-1) {
                System.out.print("     ");
            }
        }

        // Aquí inicia el proceso para copiar parte de un arreglo
        System.out.println("\n---------------Copiando parte del arreglo---------------");
        System.out.println("Ingrese dos índices: un índice inicial y un índice final.");

        boolean continuar = true; // controla la repetición del bucle do-While en caso de errores

        // bucle que maneja las entradas del usuario y sus validaciones
        do {
            try {
                int ÍnInicial, ÍnFinal;

                // solicita y valida el índice inicial
                do {
                    System.out.print("Índice inicial: ");
                    ÍnInicial = scanner.nextInt();
                    // verifica que el índice inicial este dentro del rango valido
                    if (ÍnInicial > enteros.length-1 || ÍnInicial < 0) {
                        System.out.println("Error: Ingreso un número fuera del rango admitido.");
                        System.out.println("Vuelva a intentarlo.");
                    }
                } while (ÍnInicial > enteros.length-1 || ÍnInicial < 0);
                // repite la solicitud hasta que se ingrese un índice inicial válido

                // solicita y valida el índice final
                do {
                    System.out.print("Índice final: ");
                    ÍnFinal = scanner.nextInt();
                    // verifica que el índice final este dentro del rango valido
                    if (ÍnFinal > enteros.length-1) {
                        System.out.println("Error: Ingreso un número fuera del rango admitido.");
                        System.out.println("Vuelva a intentarlo.");
                    } else if (ÍnFinal < ÍnInicial) { // verifica que el índice final no sea menor al índice inicial
                        System.out.println("Error: Ingreso un número menor al Índice Inicial.");
                        System.out.println("Vuelva a intentarlo.");
                    }
                } while (ÍnFinal > enteros.length-1 || ÍnFinal < ÍnInicial);
                // repite la solicitud hasta que se ingrese un índice inicial válido

                continuar = false; // si todas la validaciones son exitosas, detiene el bucle

                // copia la parte del arreglo especificada por los índices
                int []newArr = Arrays.copyOfRange(enteros, ÍnInicial,ÍnFinal+1);
                // imprime el nuevo arreglo copiado
                System.out.println("Nuevo arreglo --> " + Arrays.toString(newArr));

            } catch (InputMismatchException e) {
                // manejo de excepciones para datos no numéricos
                System.out.println("Error: Ingreso un carácter en lugar de un número.");
                System.out.println("Vuelva a ingresar los índices.");
                scanner.next(); // limpia el buffer del scanner

            } catch (Exception e) {
                // maneja excepciones no esperadas
                System.out.println("Error...");
                scanner.next(); // limpia el buffer del scanner
            }
        } while (continuar); 
        // repite hasta que se ingresen índices validos y la variable continual cambie a "false"

        // cierre del objeto scanner
        scanner.close();
    }
}