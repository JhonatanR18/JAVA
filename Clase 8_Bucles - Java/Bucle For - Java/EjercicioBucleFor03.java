// Actividad: Imprimiendo elementos en orden inverso
// Escribe un programa que recorra un array de enteros y los imprima en orden inverso, comenzando desde el último elemento.. El tamaño y los números  a contener pueden ser de tu elección.
public class EjercicioBucleFor03 {
    public static void main(String[] args) {
        // definimos un array de enteros
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array impreso en orden inverso");
        // recorremos el array en orden inverso
        for(int i = 0; i < array.length; i++){
            // calculamos el índice inverso
            // array.length - 1 es el índice del último elemento
            // al restar i (que va de 0 a array.length - 1) obtenemos los índices en orden inverso
            int índiceInverso = array[(array.length - 1) - i];
            // imprimimos el número el el índice inverso calculado
            System.out.println(índiceInverso);
        }
        
    }
}
