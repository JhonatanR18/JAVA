// Actividad:  Manipular oraciones
// Crea un método para generar el menú y otro método separado para resolver cada opción. Si es necesario, puedes crear más métodos adicionales para mejorar la modularidad y claridad del código.
// Ejercicio anterior: “Manipulando oraciones” - Clase 14_Desafió01_AI_V_Desafío01_Ejercicio01
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ActividadManipularOraciones {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese una oración: ");
        String oración = scanner.nextLine();
        System.out.println(oración);
        pressEnterMenu();
        boolean continuar = true;
        while (continuar) {
            int option = menuOption();
            switch (option) {
                case 1 -> oración = option1();
                case 2 -> option2(oración);
                case 3 -> option3(oración);
                case 4 -> option4(oración);
                case 5 -> option5(oración);
                case 6 -> option6(oración);
                case 7 -> option7(oración);
                case 8 -> oración = option8(oración);
                default -> continuar = false;
            }
        }
        scanner.close();
    }

    public static String option8(String oración) {
        String newTexto = fetchText("Ingrese texto a añadir al final: ");
        oración = oración + " " + newTexto;
        System.out.println("Texto actualizado: " + oración);
        pressEnterMenu();
        return oración;
    }

    public static void option7(String oración) {
        boolean reemplazar = true;
        String remplazarPalabra = "";
        while (reemplazar) {
            System.out.println("Texto: " + oración);
            String[] palabras = oración.trim().split("\\s+");
            remplazarPalabra = fetchText("Ingrese palabra a reemplazar: ");
            for (String palabra : palabras) {
                if (remplazarPalabra.equals(palabra)) {
                    reemplazar = false;
                    break;
                }
            }
            if (reemplazar) {
                System.out.println("Palabra no encontrada en el texto, vuelva a intentarlo.");
            }
        }
        if (!reemplazar) {
            String nuevaPalabra = fetchText("Ingrese nueva palabra: ");
            oración = oración.replace(remplazarPalabra, nuevaPalabra);
            System.out.println("Texto actualizado: " + oración);
            pressEnterMenu();
        }
    }

    public static void option6(String oración) {
        String[] palabras = oración.trim().split("\\s+");
        String palabraBuscar = fetchText("Ingrese palabra a buscar: ");
        boolean palabraEncontrada = false;
        int palabrasEncontradas = 0;
        for (String palabra : palabras) {
            if (palabraBuscar.equals(palabra))
                palabrasEncontradas++;
        }
        if (palabrasEncontradas == 1) {
            System.out.println("Se encontró " + palabrasEncontradas + " palabra idéntica en el texto. ");
            System.out.println("Palabra encontrada en la: ");
        } else if (palabrasEncontradas > 1) {
            System.out.println("Se encontraron " + palabrasEncontradas + " palabras idénticas en el texto. ");
            System.out.println("Palabra encontrada en la: ");
        }

        for (int i = 0; i < palabras.length; i++) {
            if (palabraBuscar.equals(palabras[i])) {
                System.out.println("Posición " + (i + 1));
                palabraEncontrada = true;
            }
        }
        if (!palabraEncontrada) {
            System.out.println("Palabra no encontrada.");
        }
        pressEnterMenu();
    }

    public static void option5(String oración) {
        String[] palabras = oración.trim().split("\\s+");
        System.out.println("El texto ingresado tiene un total de " + palabras.length + " palabras.");
        int numPalabra = 0;
        boolean caseCincoContinuar = true;
        while (caseCincoContinuar) {
            numPalabra = fetchNumber("Ingrese un número: ");
            if (numPalabra < 1 || numPalabra > palabras.length) {
                System.out.println("Error: Rango min " + 1 + " || Rango max " + palabras.length);
            } else {
                System.out.println("Palabra correspondiente: " + palabras[numPalabra - 1]);
                caseCincoContinuar = false;
                pressEnterMenu();
            }
        }
    }

    public static void option4(String oración) {
        String[] palabras = oración.trim().split("\\s+");
        Arrays.sort(palabras);
        System.out.println("Palabras ordenadas alfabéticamente: ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        pressEnterMenu();
    }

    public static void option3(String oración) {
        String[] palabras = oración.trim().split("\\s+");
        System.out.println("Número de palabras: " + palabras.length);
        pressEnterMenu();
    }

    public static void option2(String oración) {
        char[] textChar = oración.toCharArray();
        System.out.println("El texto ingresado tiene un total de: " + textChar.length + " caracteres");
        pressEnterMenu();
    }

    public static String option1() {
        System.out.println("Texto eliminado.");
        String oración = fetchText("Ingrese un nuevo texto: ");
        pressEnterMenu();
        return oración;
    }

    public static int menuOption() {
        int option = 0;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Borrar texto y crear uno nuevo");
            System.out.println("2. Cantidad de caracteres en la oración");
            System.out.println("3. Cantidad de palabras de la oración");
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente: ");
            System.out.println("6. Buscar palabra dentro de la oración");
            System.out.println("7. Modificar palabra dentro de la oración");
            System.out.println("8. Agregar contenido a la oración");
            System.out.println("9. Salir");
            option = fetchNumber("Opción: ");
            if (option < 1 || option > 9) {
                System.out.println("Número fuera del rango disponible, vuelva a intentarlo.");
                pressEnterMenu();
            }
        } while (option < 1 || option > 9);
        return option;
    }

    public static int fetchNumber(String message) {
        Integer n = null;
        do {
            try {
                System.out.print(message);
                n = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados.");
                scanner.nextLine();
            }
        } while (n == null);
        return n;
    }

    public static String fetchText(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    public static void pressEnterMenu() {
        System.out.print("Presione Enter para desplegar el menu de opciones...");
        scanner.nextLine();
    }
}