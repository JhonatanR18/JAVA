public class MO02Ejercicio01MétodosII {
    public static void main(String[] args) {
        // lama al método y muestra el resultado
        System.out.println(númeroAleatorio());
    }

    // método que genera un número aleatorio entre 1 y 355
    public static int númeroAleatorio() {
        // genera un número aleatorio entre 1 y 355 utilizando el método Math.random()
        double númeroAleatorio = (double) (Math.random()* (355 - 1 + 1)) + 1;
        System.out.print("Número aleatorio generado: ");
        return (int) Math.floor(númeroAleatorio);
    }
}
