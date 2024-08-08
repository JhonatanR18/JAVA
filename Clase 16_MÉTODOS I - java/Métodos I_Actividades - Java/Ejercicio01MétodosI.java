// Actividad: Práctica Inicial
// Imprimir nombre:  Crea un método llamado imprimeNombre() que reciba por parámetro un nombre y luego imprima el mensaje "Mi nombre es [nombre]". Invocar dicho método desde el método main para ver el mensaje por consola
// Imprimir nombre y edad: Crea el método imprimeNombreYEdad(String nombre, int edad) que reciba dos parámetros, el nombre y la edad, y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".

public class Ejercicio01MétodosI {
    public static void main(String[] args) {
        // variable con el nombre almacenado
        String nombre = "Jhonatan";
        // invoca el método imprimirNombre y le pasa la variable nombre como argumento
        imprimirNombre(nombre);

        // variable con el nombre almacenado
        String nombre2 = "Jesus";
        // variable con la edad almacenada
        int edad = 10;
        // invoca al método imprimirNombreYEdad y le pasa las variables nombre2 y edad como argumentos
        imprimirNombreYEdad(nombre2, edad);
    }

    // método que recibe un parámetro de tipo String llamado nombre
    public static void imprimirNombre(String nombre) {
        // imprime el mensaje "Mi nombre es: " seguido del valor del parámetro nombre
        System.out.println("Mi nombre es: " + nombre);
    }

    // método que recibe dos parámetros: un String llamado nombre y un int llamado edad
    public static void imprimirNombreYEdad(String nombre, int edad) {
        // imprime el mensaje "Me llamo [nombre] y tengo [edad] años." agregando el valor de los parámetros
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}