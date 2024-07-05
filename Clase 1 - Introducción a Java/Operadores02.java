import java.util.Scanner;
// usando los operadores de comparación 01
public class Operadores02 {
    public static void main(String[] args) { 
        // creamos la instancia del scanner
        Scanner números = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num01 = números.nextInt(); // pedimos el primer número
        System.out.print("Ingrese otro número entero: ");
        int num02 = números.nextInt(); // pedimos el segundo número
        System.out.println("El número " + num01 +  " es mayor a " + num02 + " ? = " +  (num01 > num02)); // es mayor que
        String respuesta = num01 > num02? "El número " + num01 + " es mayor que " + num02 : // ahora lo hacemos con operadores ternarios
                            num01 == num02? "El número " + num01 + " es igual que " +  num02 : 
                            "El número " + num02 + " es mayor que " +  num01;
        System.out.println(respuesta);        
        System.out.println("El número " +  num01 + " es distinto a " + num02 + " ? = " + (num01 != num02)); // es distinto que
        System.out.println(num01 % 2 == 0 ? "El número " + num01 + " es divisible por 2" : num01 + " no es divisible por 2"); // verificamos si el primero num es divisible por 2
        // cerramos el scanner
        números.close();
    }
}
// usando los operadores lógicos 02 AND (&&), OR (||) y NOT (!)
class OperadoresLógicos {
    public static void main(String[] args) {
        // creamos una instancia scanner
        Scanner números = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num1 = números.nextInt(); // pedimos el primer número
        System.out.print("Ingrese otro número: ");
        int num2 = números.nextInt(); // pedimos el segundo número
        System.out.print("Ingrese el tercer número: ");
        int num3 = números.nextInt(); // pedimos el tercer número
        System.out.print("Ingrese el cuarto número: ");
        int num4 = números.nextInt(); // pedimos el cuarto número
        // Si el número 1 es mayor al número 2 "y" si el número 3 es mayor al número 4.
        System.out.println(num1 > num2 && num3 > num4 ? "El número " + num1 + " es mayor al " + 
                            num2 + " y el número " + num3 + " es mayor al número " + num4 :
                            "No se cumple que el " + num1 + " sea mayor al número " + num2 + 
                            " y el número " + num3 + " sea mayor al número " + num4);
        // Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
        System.out.println(num1 > num2 || num3 > num4? "El número 01 es mayor al número 02 o el número 03 es mayor al número 04.":
                                                        "El número 01 no es mayor al número 02 y el número 03 no es mayor al número 04.");
        números.close();
    }
}