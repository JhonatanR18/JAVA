public class PorReferencia {
    // clase Persona con atributos nombre, edad y altura
    static class Persona {
        String nombre;
        int edad;
        double altura = 1.80;

        // constructor de la clase Persona
        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        // se crea un objeto Persona con nombre "Jhonatan" y edad 10
        Persona persona = new Persona("Jhonatan", 10);

        // se imprimen los valores iniciales de nombre, edad y altura
        System.out.println("Nombre: " + persona.nombre); // imprime "Jhonatan"
        System.out.println("Edad: " + persona.edad);     // imprime 10
        System.out.println("Altura: " + persona.altura); // imprime 1.80

        // se llama al método modificador pasando el objeto Persona y la altura
        modificador(persona, persona.altura);

        // se imprimen los valores de nombre, edad y altura después de la llamada a modificador
        System.out.println("Nombre: " + persona.nombre); // imprime "Jesus"
        System.out.println("Edad: " + persona.edad);     // imprime 20
        System.out.println("Altura: " + persona.altura); // imprime 1.80 (sin cambios)
    }

    // este método recibe un objeto Persona y una variable altura y los modifica localmente
    public static void modificador(Persona persona, double altura) {
        // modifica el nombre del objeto Persona
        persona.nombre = "Jair";
        System.out.println("Nombre: " + persona.nombre); // imprime "Jesus"

        // modifica la edad del objeto Persona
        persona.edad = 20;
        System.out.println("Edad: " + persona.edad);     // imprime 20

        // modifica localmente la variable altura (no afecta la variable original)
        altura = 1.67;
        System.out.println("Altura: " + altura);         // imprime 1.67
    }
}

// en este ejemplo, los cambios realizados en el objeto Persona dentro del método
// modificador son visibles fuera del método, ya que se está modificando el objeto
// referenciado. sin embargo, los cambios realizados en la variable altura no afectan
// la variable original fuera del método, ya que altura es un tipo primitivo y se pasa por valor.