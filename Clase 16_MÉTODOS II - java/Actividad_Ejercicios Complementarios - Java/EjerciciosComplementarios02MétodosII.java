// 2. Figuras geométricas:
// Crea un programa que calcule las áreas y los perímetros de un círculo, un triángulo o un paralelogramo. Debe tener dos menús: uno para elegir la figura geométrica y otro para elegir qué calcular. 
// En cada opción se deben solicitar los datos necesarios para aplicar la fórmula correspondiente:
import java.util.InputMismatchException;
import java.util.Scanner;
public class EjerciciosComplementarios02MétodosII {
    // scanner global
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = true; // variable que controla el bucle principal

        do {
            // muestra el menu principal y obtiene la opción seleccionada
            int optionMenu = chooseShape();

            // switch que que ejecuta acciones según la opción seleccionada 
            switch (optionMenu) {
                case 1 -> {
                    // muestra el menú para la figura seleccionada y obtener la opción seleccionada
                    int menuOperación = 0;
                    do {
                        menuOperación = menúOperación("Círculo");
                        switch (menuOperación) {
                            case 1 -> areaCírculo(); // método que calcula el área del círculo
                            case 2 -> perímetroCírculo(); // método que calcula el perímetro del círculo
                            case 3 -> System.out.println("Regresando al menu de figuras...");
                        }
                    } while (menuOperación != 3); // continuara el bucle hasta que seleccione regresar
                }
                case 2 -> {
                    int menuOperación = 0;
                    do {
                        menuOperación = menúOperación("Triángulo");
                        switch (menuOperación) {
                            case 1 -> areaTriángulo();
                            case 2 -> perímetroTriángulo();
                            case 3 -> System.out.println("Regresando al menu de figuras...");
                        }
                    } while (menuOperación != 3);
                }
                case 3 -> {
                    int menuOperación = 0;
                    do {
                        menuOperación = menúOperación("Paralelogramo");
                        switch (menuOperación) {
                            case 1 -> areaParalelogramo();
                            case 2 -> perímetroParalelogramo();
                            case 3 -> System.out.println("Regresando al menu de figuras...");
                        }
                    } while (menuOperación != 3);
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                    salir = false; // cambia la variable para salir del bucle principal
                }
            }
            ;
        } while (salir); // continua el bucle principal hasta que se elija la opción salir

        scanner.close(); // cierre del objeto scanner
    }

    // calcula y muestra el área del Paralelogramo
    public static void areaParalelogramo() {
        System.out.println("Área");
        double base = getPositiveNumber("Ingrese la base del Paralelogramo: ");
        double altura = getPositiveNumber("Ingrese la altura del Paralelogramo: ");
        double areaParalelogramo = base * altura;
        System.out.println("El área del Paralelogramo es: " + areaParalelogramo);
    }

    // calcula y muestra el perímetro del Paralelogramo
    public static void perímetroParalelogramo() {
        System.out.println("Perímetro");
        double base = getPositiveNumber("Ingrese la base del Paralelogramo: ");
        double lado = getPositiveNumber("Ingrese un lado del Paralelogramo: ");
        double perímetroParalelogramo = (lado + base) * 2;
        System.out.println("El perímetro del Paralelogramo es: " + perímetroParalelogramo);
    }

    // calcula y muestra el área del Triángulo
    public static void areaTriángulo() {
        System.out.println("Área");
        double base = getPositiveNumber("Ingrese la base del triangulo: ");
        double altura = getPositiveNumber("Ingrese la altura del Triángulo: ");
        double areaTriángulo = (base * altura) / 2;
        System.out.println("El área del triángulo es: " + areaTriángulo);
    }

    // calcula y muestra el perímetro del Triángulo
    public static void perímetroTriángulo() {
        System.out.println("Perímetro");
        double ladoA = getPositiveNumber("Ingrese el lado a del triangulo: ");
        double ladoB = getPositiveNumber("Ingrese el lado b del triangulo: ");
        double base = getPositiveNumber("Ingrese la base del triangulo: ");
        double perímetroTriángulo = ladoA + ladoB + base;
        System.out.println("El perímetro del triángulo es: " + perímetroTriángulo);
    }

    // calcula y muestra el área del Círculo
    public static void areaCírculo() {
        System.out.println("Área");
        double radio = getPositiveNumber("Ingrese el radio del círculo: ");
        double areaCírculo = Math.PI * (radio * radio);
        System.out.println("El área del círculo es: " + areaCírculo);
    }

    // calcula y muestra el perímetro del Círculo
    public static void perímetroCírculo() {
        System.out.println("Perímetro");
        double radio = getPositiveNumber("Ingrese el radio del círculo: ");
        double perímetroCírculo = 2 * Math.PI * radio;
        System.out.println("El perímetro del círculo es: " + perímetroCírculo);
    }

    // lee un número entero y maneja posibles excepciones
    public static int fetchNumber(String message) {
        Integer number = null;
        do {
            try {
                System.out.print(message);
                number = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número valido. Los caracteres no son aceptados..");
                scanner.nextLine(); // limpiar el buffer del scanner
            }
            ;
        } while (number == null);
        return number;
    }

    // lee un número positivo y maneja posibles excepciones
    public static int getPositiveNumber(String message) {
        Integer number = null;
        do {
            try {
                System.out.print(message);
                number = scanner.nextInt();
                scanner.nextLine();
                if(number <= 0) System.out.println("Error: Para calcular el área o el perímetro, se requieren números positivos mayores que cero. Por favor, ingrese un número válido.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número valido. Los caracteres no son aceptados..");
                scanner.nextLine(); // limpiar el buffer del scanner
            }
            ;
        } while (number == null || number <= 0);
        return number;
    }

    // muestra el menú principal y obtener la opción seleccionada
    public static int chooseShape() {
        int option = 0;
        do {
            System.out.println(" =================================");
            System.out.println("| Calculadora de área y perímetro |");
            System.out.println("|             Menú                |");
            System.out.println("|---------------------------------|");
            System.out.println("| 1. Círculo                      |");
            System.out.println("| 2. Triángulo                    |");
            System.out.println("| 3. Paralelogramo                |");
            System.out.println("| 4. Salir                        |");
            System.out.println(" =================================");
            option = fetchNumber("Seleccione una opción (1-4): ");
            if (option < 1 || option > 4)
                System.out.println("Opción incorrecta, vuelva a intentarlo.");
        } while (option < 1 || option > 4);

        return option;
    }

    // muestra el menú de operaciones para una figura y obtiene la opción seleccionada
    public static int menúOperación(String figura) {
        int optionMenuOperation = 0;
        do {
            System.out.println(" ============================= ");
            System.out.println("     Opciones - " + figura + "        ");
            System.out.println("|-----------------------------|");
            System.out.println("| 1. Calcular Área            |");
            System.out.println("| 2. Calcular Perímetro       |");
            System.out.println("| 3. Regresar al menú anterior|");
            System.out.println(" ============================= ");
            optionMenuOperation = fetchNumber("Seleccione una opción (1-3): ");
            if (optionMenuOperation < 1 || optionMenuOperation > 3)
                System.out.println("Opción incorrecta, vuelva a intentarlo.");
        } while (optionMenuOperation < 1 || optionMenuOperation > 3);

        return optionMenuOperation;
    }
}