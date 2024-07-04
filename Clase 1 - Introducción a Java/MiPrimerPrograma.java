// Declaración de la clase MiPrimerPrograma
public class MiPrimerPrograma {
    public static void main(String[] args) throws Exception { // método principal main
        // Declara una variable por cada uno de los siguientes tipos de dato, asignando un valor (nombre y valor de tu preferencia):
        // Declaración de variables
        boolean esActivo = true;        // boolean
        char inicial = 'C';             // char
        String nombre = "Juan";         // String
        int edad = 25;                  // int
        long totalVentas = 1000000L;    // long
        float altura = 1.75f;           // float

        // Impresión en consola de algunas variables
        System.out.println("Valor de esActivo: " + esActivo);
        System.out.println("Inicial: " + inicial);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Total de Ventas: " + totalVentas);
        System.out.println("Altura: " + altura);

        // Declara una nueva variable para almacenar tu edad y otra para almacenar tu nombre e imprimir en pantalla
        final String PRIMER_NOMBRE = "Jhonatan";  // declaración de una constante PRIMER_NOMBRE
        int edadJhonatan = 20;  // declaración de una variable edad
        System.out.println("Mi nombre es " + PRIMER_NOMBRE + ", y tengo " + edadJhonatan + " años.");  // Imprime un mensaje con nombre y edad
    }
}