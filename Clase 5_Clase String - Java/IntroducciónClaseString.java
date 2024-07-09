// En la programación Java, una cadena de texto, o String, es una secuencia de caracteres tratada como un objeto.
public class IntroducciónClaseString {
    public static void main(String[] args) {
        String palaString = "Hola";
        // .length - método del objeto
        System.out.println("Longitud: " + palaString.length()); // devuelve la cantidad de caracteres
        // subString - método del objeto
        System.out.println(palaString.substring(0, 4)); // cantidad especifica que nosotros queramos
        System.out.println(palaString.substring(1)); // muestra ola
        System.out.println(palaString.substring(palaString.length()-1)); // muestra el ultimo carácter
        // .valueOf convierte un entero a un string -- métodos estáticos, pertenecen a la clase
        palaString = String.valueOf(120);;
        System.out.println(palaString);
    }
}