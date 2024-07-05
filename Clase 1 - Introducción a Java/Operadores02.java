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