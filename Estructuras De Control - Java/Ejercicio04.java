import java.util.Scanner;
// Calculo de descuento
// Si el precio es igual o mayor a $100, se aplicará un descuento del 10% y se mostrará el nuevo precio con descuento. De lo contrario, se mostrará el precio original sin descuento.
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instancia scanner
        // pedimos y almacenamos el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        int precioProducto = scanner.nextInt();
        // verificamos 
        if (precioProducto >= 100) {
            int precioConDescuento = precioProducto - (precioProducto * 10 / 100);
            System.out.println("El precio de su producto es mayor o igual a 100 por ende le corresponde un descuento del 10%.");
            System.out.println("Precio final del producto con el descuento aplicado: " + precioConDescuento);
        } else {
            System.out.println("El precio de su producto no es mayor o igual a 100 por ende no le corresponde el descuento del 10%.");
            System.out.println("El precio final del producto es: " + precioProducto);
        }
        scanner.close();
    }
}
