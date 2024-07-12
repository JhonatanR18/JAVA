import java.util.Arrays;

public class IniciandoConElUsoDeArrays {
    public static void main(String[] args) {
        int numero = 7;
        int [] array = {2, 5, numero,6}; // forma nro 01 de declarar un array con valores iniciales
        System.out.println(Arrays.toString(array)); // imprime todos los elementos del array encerrados entre corchetes
        System.out.println(array[3]); // imprimir el valor del elemento en el índice 3 (4to elemento)
        array[1] = 3; // reasignar el valor en el índice 1 (2do elemento) a 3
        System.out.println("El nuevo valor es: " + array[1]); // imprimir el nuevo valor del elemento en el índice 1
        // intentar acceder al índice 4 que no existe (el array tiene índices de 0 a 3) provocará un error
        // System.out.println(array[4]); // esto causará una excepción ArrayIndexOutOfBoundsException
        // array.length devuelve la longitud del array, que en este caso es 4
        System.out.println(array.length); // imprime la longitud del array
        // (array.length - 1) devuelve el índice del último elemento del array (3 en este caso)
        System.out.println(array.length - 1); // imprime el índice del último elemento del array
        // String
        // declarar e inicializar un array de cadenas con valores específicos
        String [] arrayStrings = {"Hola", "Hola"};
        // arrayStrings[0]. podemos asi también acceder a los métodos como equals, split, format, etc.
        System.out.println(arrayStrings[0].equals(arrayStrings[1])); // imprime true porque ambas cadenas son iguales
        // forma nro 02: declarar un array especificando su tamaño (inicializado con valores por defecto (ceros))
        int [] array2 = new int [4];
        // Inicializaron de los elementos del array2
        array2[0] = 10;
        array2[1] = 20;
        array2[2] = 30;
        array2[3] = 40;
        System.out.println(Arrays.toString(array2)); // imprime todos los elementos del array encerrados entre corchetes
    }
}    