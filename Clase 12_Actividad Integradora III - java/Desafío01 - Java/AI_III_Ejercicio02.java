// Actividad: Estadísticas de calificaciones
// Vas a desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria. Estas calificaciones se almacenarán en un arreglo de Strings.
// Una vez generado el arreglo, el programa deberá generar 3 arreglos nuevos, separando las calificaciones entre desaprobados (< 4), aprobado (>= 4), y excelente (>=10). Necesitarás convertir los String a double para lograrlo.
// Luego calcula el promedio del arreglo original y de cada uno de los nuevos arreglos.
// Por último, imprimiré los resultados en consola.
import java.util.Arrays;
import java.util.Random;
public class AI_III_Ejercicio02 {
    public static void main(String[] args) {
        Random random = new Random();

        // contador para calificaciones
        int cantidadDesaprobados = 0, cantidadAprobados = 0, cantidadExcelentes = 0;

        // array para almacenar calificaciones como Strings
        String[] calificaciones = new String[12];

        // generar calificaciones aleatorias y contar las calificaciones en cada categoría
        for (int i = 0; i < calificaciones.length; i++) {
            int aleatorio = random.nextInt(11); // generar un número aleatorio entre 0 y 10
            String calificaciónString = String.valueOf(aleatorio); // convertir el número a String
            calificaciones[i] = calificaciónString; // almacenar la calificación en el array
            if (aleatorio < 4) cantidadDesaprobados++;
            if (aleatorio >= 4) cantidadAprobados++;
            if (aleatorio == 10) cantidadExcelentes++;
        }

        // inicializar arrays para cada categoría de calificaciones
        double[] arrayDesaprobados = new double[cantidadDesaprobados];
        double[] arrayAprobados = new double[cantidadAprobados];
        double[] arrayExcelentes = new double[cantidadExcelentes];

        // índices de los arrays
        int indexDesaprobados = 0, indexAprobados = 0, indexExcelentes = 0;

        // suma de calificaciones
        double sumaDesaprobados = 0.0, sumaAprobados = 0.0, sumaExcelentes = 0.0, sumaCalificaciones = 0.0;

        // clasificar y almacenar las calificaciones en los arrays correspondientes
        for (int i = 0; i < calificaciones.length; i++) {
            double calificaciónDouble = Double.valueOf(calificaciones[i]); // convertir String a double
            sumaCalificaciones += calificaciónDouble; // sumar la calificación a la suma total
            if (calificaciónDouble < 4) {
                arrayDesaprobados[indexDesaprobados] = calificaciónDouble;
                indexDesaprobados++;
                sumaDesaprobados += calificaciónDouble; // sumar la calificación a la suma de desaprobados
            }
            if (calificaciónDouble >= 4) {
                arrayAprobados[indexAprobados] = calificaciónDouble;
                indexAprobados++;
                sumaAprobados += calificaciónDouble; // sumar la calificación a la suma de aprobados
            }
            if (calificaciónDouble == 10) {
                arrayExcelentes[indexExcelentes] = calificaciónDouble;
                indexExcelentes++;
                sumaExcelentes += calificaciónDouble; // sumar la calificación a la suma de excelentes
            }
        }

        // calcular los promedios
        double promedioCalificaciones = sumaCalificaciones / calificaciones.length;
        double promedioDesaprobados = cantidadDesaprobados > 0 ? sumaDesaprobados / cantidadDesaprobados : 0.0;
        double promedioAprobados = cantidadAprobados > 0 ? sumaAprobados / cantidadAprobados : 0.0;
        double promedioExcelentes = cantidadExcelentes > 0 ? sumaExcelentes / cantidadExcelentes : 0.0;

        // imprimir los resultados
        System.out.println("Total de calificaciones: " + Arrays.toString(calificaciones) + " | Promedio: " + promedioCalificaciones);
        System.out.println("Calificaciones desaprobadas: " + Arrays.toString(arrayDesaprobados) + " | Promedio: " + promedioDesaprobados);
        System.out.println("Calificaciones aprobadas: " + Arrays.toString(arrayAprobados) + " | Promedio: " + promedioAprobados);
        System.out.println("Calificaciones excelentes: " + Arrays.toString(arrayExcelentes) + " | Promedio: " + promedioExcelentes);
    }
}