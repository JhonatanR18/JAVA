public class Switch {
    public static void main(String[] args) {
        // Declaración de una variable de tipo int y asignación del valor 1
        int número = 5;
        // Declaración de una estructura switch para evaluar la variable 'número'
        switch (número) {
            // Caso cuando 'número' es igual a 1
            case 1 :
                System.out.println("El número es igual a 1");
                break; // Finaliza la ejecución del switch para este caso
            // Caso cuando 'número' es igual a 2
            case 2 :
                System.out.println("El número es igual a 2");
                break; // Finaliza la ejecución del switch para este caso
            // Caso cuando 'número' es igual a 3
            case 3 :
                System.out.println("El número es igual a 3");
                break; // Finaliza la ejecución del switch para este caso
            // Caso cuando 'número' es igual a 4
            case 4 :
                System.out.println("El número es igual a 4");
                break; // Finaliza la ejecución del switch para este caso
            // Caso por defecto cuando 'número' no coincide con ningún caso anterior
            default: 
                System.out.println("El número puede tener cualquier valor.");
                break; // Finaliza la ejecución del switch para este caso
        }
    }
}
// Ejemplo de “Switch expression”
class SwitchExpression {
    public static void main(String[] args) {
        // Declaración de una variable de tipo int y asignación del valor 5
        int número = 5;
        // Uso de una expresión switch para evaluar la variable 'número'
        String resultado = switch (número) {
            // Caso cuando 'número' es igual a 1 o 2
            case 1, 2 -> "El número es igual a 1 o 2";
            // Caso cuando 'número' es igual a 3
            case 3 -> "El número es igual a 3";
            // Caso cuando 'número' es igual a 4
            case 4 -> "El número es igual a 4";
            // Caso por defecto cuando 'número' no coincide con ningún caso anterior
            default -> {
                System.out.println("---"); // Imprime una línea de separación
                yield "El número puede tener cualquier valor."; // Devuelve el valor para la expresión switch
            }
        };  
        // Imprime el resultado de la expresión switch
        System.out.println(resultado);
    }
}