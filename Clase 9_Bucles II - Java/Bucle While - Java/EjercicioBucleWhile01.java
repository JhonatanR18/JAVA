import java.util.Scanner;
// Actividad: Menú interactivo con while 
// Crea un menú interactivo con 5 opciones para que el usuario elija, como por ejemplo:
// Comprar producto.
// Realizar devolución.
// Ver mis pedidos.
// Preguntas frecuentes.
// Salir.
// Luego, solicita al usuario que elija una opción del menú mostrado en pantalla. El menú debe seguir apareciendo hasta que el usuario elija la opción para salir del programa. En este ejercicio, no es necesario que las opciones del menú realicen acciones reales, simplemente muestra un mensaje que indique qué opción eligió el usuario.
public class EjercicioBucleWhile01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // objeto scanner
        // variable que controla si el menú sigue mostrándose
        Boolean seguirMostrandoMenu = true;
        // bucle while que seguirá ejecutándose hasta que se elija salir y cambie el valor a false
        while (seguirMostrandoMenu == true ) {
            // imprime el menú con las opciones correspondientes
            System.out.println("--------MENU--------");
            System.out.println("1. Comprar Producto\n2. Realizar Devolución\n3. Ver mis Pedidos\n4. Preguntas Frecuentes\n5. Salir");
            System.out.print("Elija una opción: ");
            // lee la opción elegida por el usuario
            int opción = scanner.nextInt();
            // almacena las respuestas que se darán según la opción elegida
            String respuesta = switch (opción){
                case 1 -> "PRODUCTO COMPRADO."; 
                case 2 -> "DEVOLUCIÓN REALIZADA."; 
                case 3 -> "VIENDO PEDIDOS."; 
                case 4 -> "VIENDO PREGUNTAS FRECUENTES."; 
                case 5 -> { // si se elige la opción 5
                    seguirMostrandoMenu = false; // cambia la variable a false para ponerle fin al bucle
                    yield "SALIENDO...";
                }
                // mensaje para opciones no validas
                default -> "Opción no valida";
            };
            // muestra la respuesta en pantalla
            System.out.println(respuesta);
        }
        // cierre del objeto scanner para liberar recursos
        scanner.close();
    }
}