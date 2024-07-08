import java.util.Scanner;
public class EjercicioSwitch04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia del objeto scanner
        // Impresión del menu de opciones
        System.out.println("-------Calculadora de área de Figuras Geométricas-------");
        System.out.println("----Seleccione de forma numérica la figura a calcular----");
        System.out.println("1: Círculo\n2: Cuadrado\n3: Triangulo");
        System.out.print("Ingrese la opción deseada: "); // Solicita al usuario que ingrese una opción
        int option = scanner.nextInt(); // lee la opción ingresada por el usuario
        // switch para determinar la figura y calcular el área correspondiente
        String respuesta = switch (option) {
            case 1 -> {
                // caso para calcular el área del circulo
                System.out.print("Ingrese el radio del circulo: ");
                double radio = scanner.nextDouble(); // lle el radio ingresado
                double calcularArea = Math.PI * (radio * radio); // calcula el área del circulo
                yield "El area del circulo es de: " + calcularArea + " cm\u00B2"; // retorna la respuesta formateada
            }
            case 2 -> {
                // caso para calcular el área del cuadrado
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = scanner.nextDouble(); // lee el lado ingresado
                double calcularArea = lado * lado; // calcula el área del cuadrado
                yield "El area del cuadrado es de: " + calcularArea + " cm\u00B2"; // retorna la respuesta formateada
            } 
            case 3 -> {
                // caso para calcular el área del triangulo
                System.out.println("Ingrese la base y altura del triangulo");
                System.out.print("Base: ");
                double base = scanner.nextDouble(); // lee la base ingresada
                System.out.print("Altura: ");
                double altura = scanner.nextDouble(); // lee la altura ingresada
                double calcularArea = (base * altura) / 2; // calcula el área del triangulo
                yield "El area del triangulo es de: " + calcularArea + " cm\u00B2"; // retorna la respuesta formateada
            }
            default ->"Opción no valida."; // Caso por defecto para opciones no válidas
        };
        System.out.println(respuesta); // imprime la respuesta calculada
        scanner.close(); // cierre el objeto scanner para liberar recursos
    }
}