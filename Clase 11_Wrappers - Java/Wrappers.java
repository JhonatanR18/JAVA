public class Wrappers {
    public static void main(String[] args) {
        // convierte la cadena "true" (sea en may o min) en un valor booleano usando el método valueOf de la clase Boolean
        // si la cadena es cualquier otra palabra dará false
        // imprime el valor booleano convertido.
        System.out.println("valueOf: " + Boolean.valueOf("true")); // Imprime: valueOf: true

        // Declara un objeto de la clase Character que representa el carácter 'a'.
        Character a = 'a'; 

        // Declara un objeto de la clase Character que representa el carácter espacio (espacio en blanco).
        Character espacio = ' '; 

        // Aquí, la concatenación está convirtiendo los caracteres a sus valores numéricos
        // 'a' tiene un valor Unicode de 97 y el espacio tiene un valor Unicode de 32.
        // Al sumar 97 + 32 obtenemos 129.
        System.out.println(a + espacio); // Imprime: 129

        // Convierte los caracteres 'a' y espacio a cadenas usando toString() y luego los concatena con una cadena adicional.
        // Imprime el resultado. Aquí, 'a' se convierte a "a", espacio a " " y luego se concatena con "hay un espacio antes".
        System.out.println(a.toString() + espacio.toString() + "hay un espacio antes"); 
        // Imprime: a hay un espacio antes

        // Usa el método isLetter de la clase Character para verificar si el carácter 'a' es una letra.
        // Imprime el resultado, que es true ya que 'a' es una letra.
        System.out.println("isLetter: " + Character.isLetter(a)); // Imprime: isLetter: true

        // Usa el método isWhitespace de la clase Character para verificar si el carácter espacio es un espacio en blanco.
        // Imprime el resultado, que es true ya que el carácter espacio es considerado un espacio en blanco.
        System.out.println("isWhitespace: " + Character.isWhitespace(espacio)); // Imprime: isWhitespace: true

        // Convierte la cadena "234" en un valor entero usando el método valueOf de la clase Integer
        // Luego imprime el valor entero convertido.
        Integer entero = Integer.valueOf("234"); 
        System.out.println("entero: " + entero); // Imprime: entero: 234

        // Convierte la cadena "3.5" en un valor de tipo Double usando el método valueOf de la clase Double
        // Luego imprime el valor Double convertido.
        Double numero = Double.valueOf("3.5"); 
        System.out.println("numero: " + numero); // Imprime: numero: 3.5

        // Convierte el entero a cadena usando toString(), toma el primer carácter de la cadena y verifica si es un dígito
        // usando el método isDigit de la clase Character.
        // Imprime el resultado, que es true ya que el primer carácter del entero "234" (que es '2') es un dígito.
        System.out.println("isDigit: " + Character.isDigit(entero.toString().charAt(0))); 
        // Imprime: isDigit: true
    }
}

