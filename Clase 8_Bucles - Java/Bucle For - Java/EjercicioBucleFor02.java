// Actividad: Encontrando el valor mínimo 
// Escribe un programa que recorra un array de enteros y encuentre el valor mínimo presente en el array. El tamaño y los números  a contener pueden ser de tu elección.
public class EjercicioBucleFor02 {
    public static void main(String[] args) {
        // definimos un array de enteros
        int [] arrayNúmeros = {13,34,3,16,34,43,56,41};
        // inicializamos una variable con el primer número del array
        int númeroMenor = arrayNúmeros[0];
        // recorremos el array empezando desde el segundo elemento del array
        for (int i = 1; i < arrayNúmeros.length; i++){
            // si se encuentra un elemento menor que númeroMenor, actualizamos númeroMenor
            if (arrayNúmeros[i] < númeroMenor) {
                númeroMenor = arrayNúmeros[i];
            }
        }
        // imprimimos el número menor encontrado en el array
        System.out.println("El número menor del array es: " + númeroMenor);
    }
}