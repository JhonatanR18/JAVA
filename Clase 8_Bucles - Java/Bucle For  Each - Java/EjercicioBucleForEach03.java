// Actividad: Concatenando elementos
// Crea un array del tamaño que prefieras que contenga elementos de tipo cadena. Luego, concatena los elementos en una sola cadena, separados por espacios, e imprime el resultado por consola.
public class EjercicioBucleForEach03 {
    public static void main(String[] args) {
        // array de cadenas 
        String [] arrString = {
            "Hola", "mundo", "este", "es", "un", "ejemplo", "de", "concatenación", "de", "cadenas"
        };
        // variable para acumular la concatenación de cadenas
        String resultado = "";
        // bucle for each para recorrer cada elemento del array
        for (String elements : arrString){
            // concatena cada elemento con espacio adelante
            resultado = resultado + " " + elements;
        }
        // imprime la cadena con todos los elementos ya concatenados
        System.out.println(resultado.trim()); // .trim() para eliminar el espacio inicial
    }
}
