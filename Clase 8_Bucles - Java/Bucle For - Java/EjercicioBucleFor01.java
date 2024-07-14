// Actividad: Imprimiendo elementos
// Escribe un programa que recorra un array de enteros y muestre cada elemento en una línea separada. El tamaño, tipo de datos y la información a contener pueden ser de tu elección.
public class EjercicioBucleFor01 {
    public static void main(String[] args) {
        int [] arrayNúmeros = {13,34,3,16,34,43,56,41};
        for ( int i = 0; i < arrayNúmeros.length;i++){
            System.out.println("Número " + (i + 1) + " del array: " + arrayNúmeros[i]);
        }
    }
}