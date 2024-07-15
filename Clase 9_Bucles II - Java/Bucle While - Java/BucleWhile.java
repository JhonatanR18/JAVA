public class BucleWhile {
    public static void main(String[] args) {
        // variable con el valor 40
        int número = 40;
        // variable que guarda el valor original para poder mostrarlo al final
        int número1 = número;
        // variable que cuenta las cifras del número
        int cifras = 0;
        // bucle while se ejecuta mientras 40 sea mayor que 0
        while (número > 0) {
            // dividimos el número por 10 en cada iteración para eliminar la ultima cifra
            número = número / 10;
            // incrementa el contador de cifras en 1
            cifras++;
        }
        // imprime el resultado del número original y la cantidad de cifras
        System.out.println("El número " + número1 + " Tiene " + cifras + " cifras.");
    }
}


