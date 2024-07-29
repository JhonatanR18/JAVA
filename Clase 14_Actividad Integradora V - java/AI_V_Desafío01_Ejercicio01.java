// Actividad: Manipulando oraciones 
// Escribe un programa en Java que permita al usuario realizar diversas operaciones con una oración. El programa debe cumplir con los siguientes requisitos:
// 1. Muestra un menú de opciones al usuario donde podrá:
// 1.1 Crear oración o Borrar oración: Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".
// 1.2 Cantidad de caracteres de la oración: Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).
// 1.3Cantidad de palabras de la oración: Calcular y mostrar la cantidad de palabras en la oración.
// 1.4 Mostrar palabras ordenadas alfabéticamente: Mostrar las palabras de la oración ordenadas alfabéticamente.
// 1.5 Ingresar un número y devolver la palabra correspondiente: Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".
// 1.6 Buscar palabra dentro de la oración: Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.
// 1.7 Modificar palabra dentro de la oración: Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar que solo contenga letras y espacios).
// 1.8 Agregar contenido a la oración: Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.
// 1.9 Salir: Terminar el programa.
// 2. Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".
// 3. Realiza las validaciones que consideres necesarias.
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AI_V_Desafío01_Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // inicializa el escáner para la entrada del usuario
        boolean continuar = true;  // controla el bucle principal del programa
        
        System.out.print("Ingrese una oración: ");
        while (continuar) {
            String primerTexto = scanner.nextLine();  // lee la oración inicial del usuario
            String texto = primerTexto;  // almacena la oración en la variable texto
            
            System.out.print("Presione Enter para desplegar el menu de opciones...");
            scanner.nextLine();  // espera a que el usuario presione Enter
            
            boolean salir = true;  // controla el bucle del menú de opciones
            while (salir) {
                int opción = 0;
                try {
                    // muestra el menú de opciones
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
                    
                    opción = scanner.nextInt();  // lee la opción seleccionada por el usuario
                    scanner.nextLine();  // limpia el buffer del escáner
                    
                    // verifica que la opción esté dentro del rango válido
                    if (opción < 1 || opción > 9) {
                        System.out.println("Número fuera del rango de opciones disponibles.");
                        System.out.println("Vuelva a intentarlo.");
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                } catch (InputMismatchException e) {
                    // maneja la excepción cuando el usuario ingresa un carácter en lugar de un número
                    System.out.println("Error: Ingresó un carácter en lugar de un número.");
                    System.out.println("Vuelva a intentarlo.");
                    scanner.nextLine();  // limpia el buffer del escáner
                    System.out.print("Presione Enter para continuar...");
                    scanner.nextLine();
                } catch (Exception e) {
                    // maneja cualquier otra excepción inesperada
                    System.out.println("Error inesperado: " + e.getMessage());
                }

                switch (opción) {
                    case 1 -> {
                        // opción para borrar el texto y crear uno nuevo
                        System.out.println("Texto eliminado.");
                        System.out.print("Ingrese un nuevo texto: ");
                        primerTexto = scanner.nextLine();
                        texto = primerTexto;  // actualiza el texto con el nuevo valor
                        salir = false;
                    }
                    case 2 -> {
                        // opción para mostrar la cantidad de caracteres en la oración
                        char[] textChar = texto.toCharArray();
                        System.out.println("El texto ingresado tiene un total de: " + textChar.length + " caracteres");
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                    case 3 -> {
                        // opción para mostrar la cantidad de palabras en la oración
                        String[] palabras = texto.trim().split("\\s+");
                        System.out.println("Número de palabras: " + palabras.length);
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                    case 4 -> {
                        // opción para mostrar las palabras ordenadas alfabéticamente
                        String[] palabras = texto.trim().split("\\s+");
                        Arrays.sort(palabras);
                        System.out.println("Palabras ordenadas alfabéticamente: ");
                        for (String palabra : palabras) {
                            System.out.println(palabra);
                        }
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                    case 5 -> {
                        // opción para ingresar un número y devolver la palabra correspondiente
                        String[] palabras = texto.trim().split("\\s+");
                        System.out.println("El texto ingresado tiene un total de " + palabras.length + " palabras.");
                        int numPalabra = 0;
                        boolean caseCincoContinuar = true;
                        while (caseCincoContinuar) {
                            try {
                                System.out.print("Ingrese un número: ");
                                numPalabra = scanner.nextInt();
                                scanner.nextLine();
                                // verifica que el número esté dentro del rango válido
                                if (numPalabra < 1 || numPalabra > palabras.length) {
                                    System.out.println("Error: Rango min " + 1 + " || Rango max " + palabras.length);
                                } else {
                                    System.out.println("Palabra correspondiente: " + palabras[numPalabra - 1]);
                                    System.out.print("Presione Enter para continuar...");
                                    scanner.nextLine();
                                    caseCincoContinuar = false;
                                }
                            } catch (InputMismatchException e) {
                                // maneja la excepción cuando el usuario ingresa un carácter en lugar de un número
                                System.out.println("Error: Ingresó un carácter en lugar de un número.");
                                System.out.println("Vuelva a intentarlo.");
                                scanner.nextLine();  // limpia el buffer del escáner
                                System.out.print("Presione Enter para continuar...");
                                scanner.nextLine();
                            } catch (Exception e) {
                                // maneja cualquier otra excepción inesperada
                                System.out.println("Error inesperado: " + e.getMessage());
                            }
                        }
                    }
                    case 6 -> {
                        // opción para buscar una palabra dentro de la oración
                        String[] palabras = texto.trim().split("\\s+");
                        System.out.print("Ingrese palabra a buscar: ");
                        String palabraBuscar = scanner.next();
                        scanner.nextLine();
                        boolean palabraEncontrada = false;
                        int palabrasEncontradas = 0;
                        // cuenta las ocurrencias de la palabra en la oración
                        for (String palabra : palabras) {
                            if (palabraBuscar.equals(palabra)) palabrasEncontradas++;
                        }
                        if (palabrasEncontradas == 1) {
                            System.out.println("Se encontró " + palabrasEncontradas + " palabra idéntica en el texto. ");
                            System.out.println("Palabra encontrada en la: ");
                        } else if (palabrasEncontradas > 1) {
                            System.out.println("Se encontraron " + palabrasEncontradas + " palabras idénticas en el texto. ");
                            System.out.println("Palabra encontrada en la: ");
                        }
                        // muestra las posiciones de la palabra en la oración
                        for (int i = 0; i < palabras.length; i++) {
                            if (palabraBuscar.equals(palabras[i])) {
                                System.out.println("Posición " + (i + 1));
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
                        // opción para modificar una palabra dentro de la oración
                        boolean reemplazar = true;
                        String remplazarPalabra = "";
                        while (reemplazar) {
                            System.out.println("Texto: " + texto);
                            String[] palabras = texto.trim().split("\\s+");
                            System.out.print("Ingrese palabra a reemplazar: ");
                            remplazarPalabra = scanner.next();
                            scanner.nextLine();
                            // verifica si la palabra está en la oración
                            for (String palabra : palabras) {
                                if (remplazarPalabra.equals(palabra)) {
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
                        if (!reemplazar) {
                            System.out.print("Ingrese nueva palabra: ");
                            String nuevaPalabra = scanner.next();
                            scanner.nextLine();
                            texto = texto.replace(remplazarPalabra, nuevaPalabra);  // reemplaza la palabra en la oración
                            System.out.println("Texto actualizado: " + texto);
                            System.out.print("Presione Enter para continuar...");
                            scanner.nextLine();
                        }
                    }
                    case 8 -> {
                        // opción para agregar contenido al final de la oración
                        System.out.print("Ingrese texto a añadir al final: ");
                        String newTexto = scanner.nextLine();
                        texto = texto + " " + newTexto;  // añade el nuevo texto al final de la oración
                        System.out.println("Texto actualizado: " + texto);
                        System.out.print("Presione Enter para continuar...");
                        scanner.nextLine();
                    }
                    case 9 -> {
                        // opción para salir del programa
                        System.out.println("Programa finalizado.");
                        salir = false;
                        continuar = false;
                    }
                }
            }
        }
        scanner.close();  // cierra el escáner
    }
}