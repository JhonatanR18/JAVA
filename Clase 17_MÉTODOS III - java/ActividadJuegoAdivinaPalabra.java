// Actividad Ejercicio Complementario
// Juego de Adivinar Palabra:
// Escribe un programa que implemente un juego en el que el usuario debe adivinar una palabra aleatoria. El programa elegirá una palabra al azar de una lista predefinida y mostrará una pista de la longitud de la palabra. El usuario tendrá un número limitado de intentos para adivinar la palabra. Después de cada intento, el programa mostrará cuántas letras ha adivinado correctamente y en qué posición se encuentran.

import java.util.Arrays;
import java.util.Scanner;
public class ActividadJuegoAdivinaPalabra {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        iniciarJuego(); // inicia el juego
        scanner.close(); // cierra el scanner al final del juego
    }

    // método principal que controla la lógica del juego
    public static void jugar(String palabraIngresada, int intentos, String palabraRandom) {
        do {  
            System.out.print("Ingresa una palabra: ");
            palabraIngresada = scanner.next();
            scanner.nextLine();

            // verifica si la palabra ingresada es correcta
            if (palabraRandom.equals(palabraIngresada)) {
                System.out.println("¡Palabra correcta! Has ganado.");
            } else {
                // si es incorrecta, muestra cuántos intentos quedan y actualiza la pista
                System.out.println("Incorrecto. Te quedan " + (intentos-1) + " intentos.");
                pista(palabraRandom, palabraIngresada);
                intentos--;
            }

            // si se agotan los intentos, muestra la palabra correcta
            if (intentos == 0) {
                System.out.println("Lo siento, has perdido. La palabra era: " + palabraRandom);
            }
        } while (intentos > 0 && !palabraRandom.equals(palabraIngresada));
    }

    // método que inicia el juego y establece las variables iniciales
    public static void iniciarJuego() {
        String palabraRandom = palabraRandom(); // selecciona una palabra aleatoria
        System.out.println("Se ha generado una palabra aleatoria. ¡Adivínala!");    

        String pista = pistaInicial(palabraRandom); // genera la pista inicial
        int intentos = 10; // número de intentos disponibles
        String palabraIngresada = "";

        System.out.println("Tienes 10 intentos para adivinar la palabra.");
        System.out.println("Pista: " + pista);

        jugar(palabraIngresada, intentos, palabraRandom); // comienza el juego
    }

    // método para seleccionar una palabra aleatoria de la lista
    public static String palabraRandom() {
        String [] palabras = {"casa", "auto","laptop", "celular", "manta", "mesa"};
        int random = (int) (Math.random() * ((palabras.length-1) - 0 + 1)) + 0;
        return palabras[random];
    }

    // método para generar la pista inicial con guiones bajos
    public static String pistaInicial(String palabraRandom) {
        String pista = "";
        for(int i = 0; i < palabraRandom.length();i++){
            pista = pista + "_"; // añade un guion bajo por cada letra de la palabra
        }
        return pista; // retorna la pista inicial
    }

    // método para actualizar y mostrar la pista según las letras adivinadas
    public static void pista(String palabraRandom, String palabraIngresada) {
        char[] palabraChar = palabraRandom.toCharArray();
        char[] palabraIngresadaChar = palabraIngresada.toCharArray();
        String[] pista = new String[palabraRandom.length()];

        // compara las letras de la palabra ingresada con la palabra correcta
        for (int i = 0; i < palabraChar.length;i++){
            for (char letra : palabraIngresadaChar){
                if (palabraChar[i] == letra) {
                    pista[i] = String.valueOf(letra); // si coinciden, actualiza la pista
                }
            }

            // si no hay coincidencia, mantiene el guion bajo
            if (pista[i] == null) {
                pista[i] = "_";
            }
        }

        // muestra las letras encontradas en la pista
        System.out.println("Letras encontradas -> " + Arrays.toString(pista)
                                        .replace("[","")
                                        .replace(",", "")
                                        .replace("]", ""));
    }
}