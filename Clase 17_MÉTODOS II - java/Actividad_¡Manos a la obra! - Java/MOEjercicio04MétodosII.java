// Imprimir array: Crea un programa que utilice un método "imprimirArray(int[] array)" que se encargue de imprimir un array por consola. El método debe recibir como parámetro un arreglo de tipo "int" y no devolver nada. Luego, crea una sobrecarga del método para que acepte arrays de tipo String y arreglos bidimensionales de tipo "int" y de tipo "String".
import java.util.Arrays;
public class MOEjercicio04MétodosII {
    public static void main(String[] args) {
        int[] arrayInt = {5,7,8,4};
        imprimirArray(arrayInt);

        String [] arrayString = {"Hola", "Gente"}; 
        imprimirArray(arrayString);

        int [][] arrayBidimensionalInt = {
            {6, 2, 3},
            {2, 5, 6},
            {1, 5, 4}
        };
        imprimirArray(arrayBidimensionalInt);

        String[][] arrayBidimensionalString = {
            {"Jhonatan", "Jair", "Juarez", "Rivera"},
            {"Deyvi", "Anthony", "Juarez", "Rivera"},
            {"Jesus", "Aldair", "Juarez", "Rivera"},
        };
        imprimirArray(arrayBidimensionalString);

        Object[][] arrayBidimensionalMixto  = {
            {"Jhonatan", 20},
            {"Jesus", 10},
            {"Deyvi", 25}
        };
        imprimirArray(arrayBidimensionalMixto );
    }
    // método que imprime un array unidimensional  de enteros
    public static void imprimirArray(int[] array) {
        System.out.println("Array Int: " + Arrays.toString(array));
    }
    // método sobrecargado que imprime un array unidimensional de Strings
    public static void imprimirArray(String[] array) {
        System.out.println("\nArray String: " + Arrays.toString(array));
    }
    // método sobrecargado para imprimir un array bidimensional de enteros
    public static void imprimirArray(int[][] array){
        System.out.println("\nArray bidimensional Int:");
        int alumno = 1;
        for (int[] cal : array){
            System.out.println("Notas Alumno 0" + alumno + ": " + Arrays.toString(cal));
            alumno++;
        }
    }
    // método sobrecargado para imprimir un array bidimensional de Strings
    public static void imprimirArray(String[][] array){
        System.out.println("\nArray bidimensional String:");
        for (String[] persona : array){
            System.out.println("Nombre completo: " + Arrays.toString(persona));
        }
    }
    // método sobrecargado para imprimir un array bidimensional mixto
    public static void imprimirArray(Object[][] array) {
        System.out.println("\nArray bidimensional Mixto: ");
        for (Object[] persona : array){
            System.out.println("Nombre y edad: " + Arrays.toString(persona));
        }
    }
}
