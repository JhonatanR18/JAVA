// Actividad: Seleccionando el Tipo de Dato Adecuado en Java ---------------------------------------------------
// Temperatura media de una ciudad durante el verano (en grados Celsius) `double` Permite decimales, necesario para temperaturas precisas.
// Precio de un producto en una tienda (en dólares y centavos) `double` Maneja decimales, ideal para precios con centavos.
// Nombre completo de una persona `String` Almacena texto y caracteres especiales.
// Fecha de nacimiento de una persona `LocalDate` Maneja fechas sin zona horaria.
// Número de habitantes de una ciudad `long` Un entero de 64 bits es adecuado para representar números grandes, como la población de una ciudad.
// Duración de una película (en minutos) `int` Suficiente para tiempos en minutos.
// Si un artículo está disponible o no en una tienda (true/false) `boolean` Representa valores binarios, como disponible/no disponible.
// Distancia entre dos ciudades (en kilómetros) `double` Permite decimales, necesario para distancias precisas.
// Número de teléfono de una persona `String` Almacena números con guiones y paréntesis.
// Cantidad de existencias de un producto en una tienda `int` Adecuado para cantidades enteras.

public class TipoDeDatoAdecuadoEnJava {
    public static void main(String[] args) {
        String mensajeBienvenida = "Bienvenido a Java";
        int temperaturaActual = 31;
        boolean datoLógico = true;
        System.out.println(mensajeBienvenida + ", Jhonatan!");
        System.out.println("La temperatura del día de hoy es de: " + temperaturaActual + "°");
        System.out.println("Dato Lógico: " + datoLógico);
    }
}