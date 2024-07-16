import java.util.Scanner;
// Actividad: Adivinando un número 
// Escribe un programa que genere un número aleatorio entre 1 y 20, y 
// muestra por consola un mensaje pidiéndote que adivines ese número utilizando un bucle do-while. 
// El programa te indicará si el número que ingresas es mayor o menor que el número aleatorio, y seguirá pidiéndote que adivines hasta que lo hagas correctamente.
public class EjercicioBucleDoWhile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // genera un número aleatorio entre 1 y 20
        int aleatorio = (int) (Math.random() * (20 - 1 + 1)) + 1;
        int numIngresado;
        // mensajes iniciales
        System.out.println("Número aleatorio generado: " + aleatorio); // se tiene que ocultar xd
        System.out.println("Se acaba de generar un número aleatorio entre 1 y 20.");
        System.out.println("El reto es adivinarlo");
        // bucle do while para adivinar el número
        do {
            System.out.print("Ingrese el número que cree que es: ");
            numIngresado = scanner.nextInt(); // lee el número ingresado
            if (numIngresado < aleatorio) { // verifica si el número ingresado el menor al número aleatorio
                // si la condición se cumple, imprime un mensaje de error y da una pista 
                System.out.println("Número incorrecto... Vuelva a intentarlo.");
                System.out.println("Pista -> El número aleatorio a adivinar es mayor al número que acabas de ingresar.");
            } else if (numIngresado > aleatorio) { // verifica si el número ingresado el mayor al número aleatorio
                // si la condición se cumple, imprime un mensaje de error y da una pista 
                System.out.println("Número incorrecto... Vuelva a intentarlo.");
                System.out.println("Pista -> El número aleatorio a adivinar es menor al número que acabas de ingresar.");
            }
        } while (!(aleatorio == numIngresado)); // continua el bucle hasta que el número sea adivinado
        // mensaje de éxito para cuando el bucle finalice - lo que indicaría que el número fue adivinado
        System.out.println("Genial, adivinaste el número.");
        // cierre del objeto scanner
        scanner.close();
    }
}
