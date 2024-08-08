public class PorValor {
    // Paso por valor: en este paso se crea una copia de la variable que se pasa en
    // la invocación del método, en la declaración de este
    public static void main(String[] args) {
    // Se crea una variable número y se le asigna el valor 10
    int número = 10;
        
    // Se llama al método métodoDos y se pasa el valor de número (10)
    métodoDos(número);
    
    // Se imprime el valor de número después de la llamada a métodoDos
    System.out.println("Número: " +  número); // Imprime 10
}

// Este método recibe un valor int y lo modifica localmente
public static void métodoDos(int número) {
    // Se cambia el valor del parámetro número a 20
    número = 20;
    
    // Se imprime el valor del parámetro número dentro del método
    System.out.println("MétodoDos: " + número); // Imprime 20
}
}
// En el paso por valor, se pasa una copia del valor de la variable al método. 
// Los cambios realizados en el parámetro dentro del método no afectan 
// la variable original fuera del método.