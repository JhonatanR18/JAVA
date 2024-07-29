import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AI_V_Desafío01_Ejercicio01Limpio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        System.out.print("Ingrese una oración: ");
        while (continuar) {
            String primerTexto = scanner.nextLine();
            String texto = primerTexto;
            System.out.print("Presione Enter para desplegar el menu de opciones...");
            scanner.nextLine();
            boolean salir = true;
            while (salir) {
                int opción = 0;
                try {
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
                    System.out.print("Opción: ");
                    opción = scanner.nextInt();
                    scanner.nextLine();
                    if (opción < 1 || opción > 9) {
                        System.out.println("Número fuera del rango de opciones disponibles.");
                        System.out.println("Vuelva a intentarlo.");
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Ingresó un carácter en lugar de un número.");
                    System.out.println("Vuelva a intentarlo.");
                    scanner.nextLine(); // limpia el buffer del escáner
                    System.out.print("Presione Enter para continuar...");
                    scanner.nextLine();
                } catch (Exception e) {
                    System.out.println("Error inesperado: " + e.getMessage());
                }
                switch (opción) {
                    case 1 -> {
                        System.out.println("Texto eliminado.");
                        System.out.print("Ingrese un nuevo texto: ");
                        salir = false;
                    }
                    case 2 -> {
                        char [] textChar = texto.toCharArray();
                        System.out.println("El texto ingresado tiene un total de: "+ textChar.length + " caracteres");
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                    case 3 -> {
                        String[] palabras = texto.trim().split("\\s+");
                        System.out.println("Número de palabras: " + palabras.length);
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                    case 4 -> {
                        String[] palabras = texto.trim().split("\\s+");
                        Arrays.sort(palabras);
                        System.out.println("Palabras ordenadas alfabéticamente: ");
                        for (String palabra : palabras){
                            System.out.println(palabra);
                        }
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                    case 5 -> {
                        String[] palabras = texto.trim().split("\\s+");
                        System.out.println("El texto ingresado tiene un total de " + palabras.length + " palabras.");
                        int numPalabra = 0;
                        boolean caseCincoContinuar = true;
                        while (caseCincoContinuar) {
                            try {
                                System.out.print("Ingrese un número: ");
                                numPalabra = scanner.nextInt();
                                scanner.nextLine();
                                if (numPalabra < 1 || numPalabra > palabras .length){
                                    System.out.println("Error: Rango min " + 1 + " || Rango max " + palabras.length);
                                } else {
                                    System.out.println("Palabra correspondiente: " + palabras[numPalabra-1]);
                                    System.out.print("Presione Enter para continuar...");
                                    scanner.nextLine();
                                    caseCincoContinuar = false;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Ingresó un carácter en lugar de un número.");
                                System.out.println("Vuelva a intentarlo.");
                                scanner.nextLine(); // limpia el buffer del escáner
                                System.out.print("Presione Enter para continuar...");
                                scanner.nextLine();
                            } catch (Exception e) {
                                System.out.println("Error inesperado: " + e.getMessage());
                            }
                        }
                    }
                    case 6 -> {
                        String[] palabras = texto.trim().split("\\s+");
                        System.out.print("Ingrese palabra a buscar: ");
                        String palabraBuscar = scanner.next();
                        scanner.nextLine();
                        boolean palabraEncontrada = false;
                        int palabrasEncontradas = 0;
                        for (String palabra : palabras){
                            if (palabraBuscar.equals(palabra)) palabrasEncontradas++;
                        }
                        if (palabrasEncontradas==1) {
                            System.out.println("Se encontró " + palabrasEncontradas + " palabra idéntica en el texto. ");
                            System.out.println("Palabra encontrada en la: ");
                        } else if (palabrasEncontradas > 1) {
                            System.out.println("Se encontraron " + palabrasEncontradas + " palabras idénticas en el texto. ");
                            System.out.println("Palabra encontrada en la: ");
                        }
                        
                        for (int i = 0; i < palabras.length; i++){
                            if (palabraBuscar.equals(palabras[i])) {
                                System.out.println("Posición " + (i+1));
                                palabraEncontrada = true;
                            }
                        }
                        if (!palabraEncontrada) {
                            System.out.println("Palabra no encontrada.");
                        }
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                    case 7 -> {
                        boolean reemplazar = true;
                        String remplazarPalabra = "";
                        while (reemplazar) {
                            System.out.println("Texto: " + texto);
                            String[] palabras = texto.trim().split("\\s+");
                            System.out.print("Ingrese palabra a reemplazar: ");
                            remplazarPalabra = scanner.next();
                            scanner.nextLine();
                            for (String palabra : palabras){
                                if (remplazarPalabra.equals(palabra)){
                                    reemplazar = false;
                                    break;
                                }
                            }
                            if (reemplazar) {
                                System.out.println("Palabra no encontrada en el texto.");
                                System.out.println("Vuelva a intentarlo.");
                                System.out.print("Presione Enter para continuar...");
                                scanner.nextLine();
                            } 
                        }
                        if (!reemplazar){
                            System.out.print("Ingrese nueva palabra: ");
                            String nuevaPalabra = scanner.next();
                            scanner.nextLine();
                            texto = texto.replace(remplazarPalabra, nuevaPalabra);
                            System.out.println("Texto actualizado: " + texto);
                            System.out.print("Presione Enter para continuar...");
                            scanner.nextLine();
                        }
                    }
                    case 8 -> {
                        System.out.print("Ingrese texto a añadir al final: ");
                        String newTexto = scanner.nextLine();
                        texto = texto + " " + newTexto;
                        System.out.println("Texto actualizado: " + texto);
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                    case 9 -> {
                        System.out.println("Programa finalizado.");
                        salir = false;
                        continuar = false;
                    }
                }
            }
        }
        scanner.close();
    }
}