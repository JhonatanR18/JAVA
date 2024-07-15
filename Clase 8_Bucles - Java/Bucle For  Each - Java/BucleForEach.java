public class BucleForEach {
    public static void main(String[] args) {
        // array de Strings que contiene nombres de países
        String [] países = {"Brasil", "Argentina", "Colombia", "Venezuela", "Perú", "Uruguay"};
        // bucle for-each para recorrer cada elemento del array
        for (String país : países) {
            // imprime cada país del array
            System.out.println("País: " + país);
        }
    }
}