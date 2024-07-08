import java.util.Scanner;
public class EjercicioSwitch06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // título y opciones de figuras
        System.out.println("Calculadora de Área y Perímetro");
        System.out.println("Figuras Geométricas\n1-círculo\n2-Rectángulo");
        System.out.print("Ingrese número de la figura geométrica: ");
        int número = scanner.nextInt(); // lee el número de la figura geométrica seleccionada
        // switch principal para manejar las opciones de figura geométrica
        switch (número){
            case 1 -> { // Caso para el círculo
                System.out.println("Desea calcular su: ");
                System.out.println("1-Área\n2-Perímetro");
                System.out.print("Ingrese número de la opción: ");
                int AoP = scanner.nextInt(); // lee la opción seleccionada
                // switch interno para calcular el área o perímetro del círculo
                String respuesta = switch (AoP){
                    case 1 -> { // calcula el área del círculo
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = scanner.nextDouble();
                        double area = Math.PI * (radio * radio);
                        yield "El area del círculo es de: " + area + " cm\u00B2";
                    }
                    case 2 -> { // calcula el perímetro del círculo
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = scanner.nextDouble();
                        double perímetro = 2 * Math.PI * radio;
                        yield "El perímetro del círculo es de: " + perímetro + " cm\u00B2";
                    }
                    default -> "Opción invalida.";
                };
                System.out.println(respuesta); // muestra el resultado
            }
            case 2 -> { // caso para el rectángulo
                System.out.println("Desea calcular su: ");
                System.out.println("1-Área\n2-Perímetro");
                System.out.print("Ingrese número de la opción: ");
                int AoP = scanner.nextInt(); // lee la opción seleccionada
                // switch interno para calcular el área o perímetro del círculo
                String respuesta = switch (AoP){
                    case 1 -> { // calcular el área del rectángulo
                        System.out.println("Ingrese el ancho y largo del rectángulo: ");
                        System.out.print("Ancho: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Largo: ");
                        double largo = scanner.nextDouble();
                        double area = (ancho * largo);
                        yield "El area del rectángulo es de: " + area + " cm\u00B2"; // maneja caso de opción inválida
                    }
                    case 2 -> { // calcular el perímetro del rectángulo
                        System.out.println("Ingrese el ancho y largo del rectángulo: ");
                        System.out.print("Ancho: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Largo: ");
                        double largo = scanner.nextDouble();
                        double perímetro = 2 * (ancho + largo);
                        yield "El perímetro del rectángulo es de: " + perímetro + " cm\u00B2"; // maneja caso de opción inválida
                    }
                    default -> "Opción invalida."; // manejar caso de figura geométrica inválida
                };
                System.out.println(respuesta); // muestra el resultado del calculo
            }            
            default -> {System.out.println("Opción invalida");}
        };
        scanner.close();
    }
}