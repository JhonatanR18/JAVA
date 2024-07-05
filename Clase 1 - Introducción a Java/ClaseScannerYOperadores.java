import java.util.Scanner; // Importa Scanner
public class ClaseScannerYOperadores {
    public static void main(String[] args) {
        System.out.println("Hola mundo :D");
    }
}
class ClaseScanner {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in); // Crea Scanner
        System.out.print("Ingrese su Nombre: ");
        String nombre = miScanner.nextLine(); // Lee el nombre
        System.out.print("¡Bienvenido " + nombre + "!");
        miScanner.nextLine(); // Espera Enter
        System.out.print("Ingrese su edad: ");
        int edad = miScanner.nextInt(); // Lee la edad
        System.out.print("Guardando datos... El usuario se llama " + nombre + ", y tiene " + edad + " años.");
        miScanner.close(); // Cierra Scanner        
    }
}
// Operadores Aritméticos
class ClaseOperadores {
    public static void main(String[] args) {
        // Realiza 5 operaciones básicas
        // operadores aritméticos +, -, *, /, %
        System. out.println("5 + 5 = " + (5+5));
        System.out.println("5 - 5 = " + (5-5));
        System.out.println("5 * 5 = " + (5*5)); // forzar a que el número que muestre sea en decimal, s se agrega d = double o f = float
        System.out.println("5 / 5 = " + (7d/5d)); 
        System.out.println("5 % 5 = " + (5%5));
        // Realiza una suma con la clase Scanner
        Scanner scannerSuma = new Scanner(System.in);
        System.out.print("Ingrese su primer número: ");
        int primerNúmero = scannerSuma.nextInt();
        System.out.print("Ingrese su segundo número: ");
        int segundoNúmero = scannerSuma.nextInt();
        System.out.print("La suma de las dos variables es: " + (primerNúmero + segundoNúmero));
        scannerSuma.close(); // Cierre Scanner
    }
}
// Operadores de comparación || lógicos || condicional (Ternario)
class Operadores {
    public static void main(String[] args) {
        // declaramos variables
        int a = 5;
        int b = 10;
        // ejemplos de implementación de operadores de comparación
        System.out.println("a == b: " + (a == b)); // igual a (==)
        System.out.println("a != b: " +  (a != b)); // no igual a (!=)
        System.out.println("a > b: " +  (a > b)); // mayor que (>)
        System.out.println("a < b: " + (a < b)); // menor que (<)
        System.out.println("a >= b: " +  (a >= b)); // mayo igual que (>=)
        System.out.println("a <= b:" + (a <=b)); // menor igual que (<=)
        // operadores lógicos: combinan expresiones booleanas y producen un resultado booleano basado en ellas
        boolean c = true;
        boolean d = false;
        System.out.println("a && b: " + (c && d)); // AND lógico (&&) = Devuelve true si ambos operadores son true
        System.out.println("c || b: " + (c || d)); // OR Lógico (||)  = Devuelve true si al menos uno de los operadores es true
        System.out.println("!c: " + !c + " !d: " + !d); // NOT Lógico = Invierte el valor del operador
        // operador condicional (operador ternario): permite tomar decisiones basadas en una condición
        int OperadorTernario = a > b ? a : b; // (?:) si a es mayor que b, devuelve a, sino devuelve b.
        System.out.println(OperadorTernario); // verificamos
        // ejemplo
        int edad = 18;
        String verificaciónDeEdad = edad >= 18? "Eres mayor de edad." : "Eres menor de edad.";
        System.out.println(verificaciónDeEdad);
        // ejemplo2
        int num1 = 51;
        int num2 = 50;
        int númeroMay = num1 > num2? num1 : num2;
        System.out.println("El número mayor es: " + númeroMay);
        // ejemplo3
        int nota = 10;
        String resultado = nota > 8 ? "!excelente!" : "Regular";
        System.out.println(nota + " es una calificación, " + resultado);
        // haciéndolo con operador lógico
        resultado = nota > 8 && nota <= 10 ? "!excelente!" : "Regular";
        System.out.println(nota + " es una calificación, " + resultado);
        // anidando operadores ternarios 
        resultado = nota > 8 && nota <= 10 ? "!excelente!" : 
                    nota >= 0 && nota <= 5 ? "Desaprobaría" : 
                    nota < 0 || nota > 10 ? "Errónea" : "Regular";
        System.out.println(nota + " es una calificación, " + resultado);
    }
}