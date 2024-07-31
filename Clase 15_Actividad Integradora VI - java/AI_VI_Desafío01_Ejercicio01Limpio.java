import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AI_VI_Desafío01_Ejercicio01Limpio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> alumnos = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            
            System.out.println("Menu de opciones");
            System.out.println("1.- Registrar alumno");
            System.out.println("2.- Mostrar todos los alumnos");
            System.out.println("3.- Mostrar promedio de notas");
            System.out.println("4.- Buscar alumno por nombre");
            System.out.println("5.- Modificar nota por nombre");
            System.out.println("6.- Eliminar alumno por nombre");
            System.out.println("7.- Salir");
            System.out.print("Opción: ");

            int opción = 0;
            try {
                opción = scanner.nextInt();
                scanner.nextLine();
                if (opción < 1 || opción > 7) {
                    System.out.println("Entrada no válida. Seleccione una opción del 1 al 7.");
                    System.out.print("Pulse Enter para volver a intentarlo...");
                    scanner.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados..");
                scanner.nextLine();
            }
            int cantidadDeAlumnos = alumnos.size();
            
            switch (opción){
                case 1 -> {
                    boolean nameValido = true;
                    while (nameValido) {
                        System.out.print("Ingrese nombre del alumno || '0' para cancelar el registro: ");
                        String newAlumno = scanner.nextLine();
                        try {
                            int opciónSalirRegistro = Integer.parseInt(newAlumno);
                            if (opciónSalirRegistro == 0) {
                                nameValido = false;
                                System.out.println("Registro cancelado.");
                                System.out.print("Pulse Enter para retornar al menú...");
                                scanner.nextLine();
                            } else {System.out.println("Entrada no válida. Por favor, ingrese el nombre del alumno o '0' para cancelar el registro.");}
                        } catch (NumberFormatException e) {
                            if(newAlumno.trim().isEmpty()){
                                System.out.println("Debe ingresar un nombre. Este campo no puede estar vacío.");
                                System.out.print("Pulse Enter para volver a intentarlo...");
                                scanner.nextLine();
                            } else {
                                nameValido = false;
                                boolean calificaciónValida = true;
                                while (calificaciónValida) {
                                    try {
                                        System.out.print("Ingrese calificación del alumno: ");
                                        double nota = scanner.nextDouble();
                                        scanner.nextLine();
                                        if (nota < 0 || nota > 10) {
                                            System.out.println("Error: el valor ingresado no es válido. Ingrese una calificación entre 0 y 10.");
                                        } else {
                                            alumnos.add(newAlumno);
                                            notas.add(nota);
                                            calificaciónValida = false;
                                            System.out.printf("| %-15s | Calificación: %6.1f |\n", newAlumno, nota);
                                            System.out.println("Alumno registrado con éxito.");
                                            System.out.print("Pulse Enter para continuar...");
                                            scanner.nextLine();
                                        }
                                    } catch (InputMismatchException Exception) {
                                        System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados..");
                                        scanner.nextLine();
                                    }
                                }
                            }
                        }
                    }
                    
                }
                case 2 -> {
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine();
                    } else {
                        System.out.println("Lista de alumnos registrados: ");
                        for(int i = 0; i < alumnos.size(); i++){
                            System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                        }
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine();
                    }
                }
                case 3 -> {
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine();
                    } else {
                        double promedioGeneral = 0.0;
                        for (double nota : notas){
                            promedioGeneral = promedioGeneral + nota;
                        }
                        promedioGeneral = promedioGeneral / notas.size();
                        System.out.println("Promedio general de todos los alumnos registrados: " + promedioGeneral);
                        System.out.print("Pulse Enter para continuar...");
                        scanner.nextLine();
                    }
                }
                case 4 -> {
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine();
                    } else {
                        boolean buscarAlumno = true;
                        while (buscarAlumno) {
                            System.out.print("Ingrese nombre del alumno || '0' para cancelar búsqueda: ");
                            String alumno = scanner.nextLine();
                            try {
                                int opciónSalirBúsqueda = Integer.parseInt(alumno);
                                if (opciónSalirBúsqueda == 0){
                                    buscarAlumno = false;                                System.out.println("Búsqueda cancelada.");
                                    System.out.print("Pulse Enter para retornar al menú...");
                                    scanner.nextLine();
                                } else {
                                    System.out.println("Entrada no válida. Por favor, ingrese el nombre del alumno o '0' para cancelar búsqueda.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine();
                                }
                            } catch (NumberFormatException e) {
                                if(alumno.trim().isEmpty()){
                                    System.out.println("Debe ingresar un nombre. Este campo no puede estar vacío.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine();
                                } else {
                                    int alumnosEncontrados = 0;
                                    for (int i = 0; i < alumnos.size();i++){
                                        if (alumnos.get(i).equals(alumno)) {
                                            alumnosEncontrados++;
                                        } else {
                                            String[] nombres = alumnos.get(i).trim().split("\\s+");
                                            for (String nombre : nombres) {
                                                if (nombre.equals(alumno)) alumnosEncontrados++;
                                            }
                                        }
                                    }
                                    if (alumnosEncontrados > 0) {
                                        System.out.println("Alumnos encontrados: " + alumnosEncontrados);
                                        for (int i = 0; i < alumnos.size();i++){
                                            if (alumnos.get(i).equals(alumno)) {
                                                System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                                            } else {
                                                String[] nombres = alumnos.get(i).trim().split("\\s+");
                                                for (String nombre : nombres) {
                                                    if (nombre.equals(alumno)) {
                                                        System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                                                    }
                                                }
                                            }
                                        }
                                        System.out.print("Pulse Enter para realizar una nueva búsqueda....");
                                        scanner.nextLine();
                                    } 
                                    if (alumnosEncontrados == 0) {
                                        System.err.println("No se ha localizado al alumno solicitado. Asegúrese de ingresar los datos correctos.");
                                        System.out.print("Pulse Enter para volver a intentarlo...");
                                        scanner.nextLine();
                                    }
                                }
                            }
                        }
                    }
                }
                case 5 -> {
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine();
                    } else {
                        System.out.println("Lista de alumnos registrados: ");
                        for(int i = 0; i < alumnos.size(); i++){
                            System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                        }
                        boolean modificarNota = true;
                        while (modificarNota) {
                            System.out.print("Ingrese nombre completo del alumno || '0' para cancelar modificación: ");
                            String alumno = scanner.nextLine();
                            try {
                                int opciónCancelarModificación = Integer.parseInt(alumno);
                                if (opciónCancelarModificación == 0) {
                                    modificarNota = false;
                                    System.out.println("Modificación de nota cancelada.");
                                    System.out.print("Pulse Enter para retornar al menú...");
                                    scanner.nextLine();
                                } else {
                                    System.out.println("Entrada no válida. Por favor, ingrese el nombre completo del alumno o '0' para cancelar la modificación de nota.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine();
                                }
                            } catch (NumberFormatException e) {
                                if(alumno.trim().isEmpty()){
                                    System.out.println("Debe ingresar un nombre. Este campo no puede estar vacío.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine();
                                } else {
                                    boolean alumnoEncontrado = false;
                                    for (int i = 0; i < alumnos.size(); i++){
                                        if (alumno.equals(alumnos.get(i))){
                                            alumnoEncontrado = true;
                                            System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                                            boolean notaCorrecta = true;
                                            while (notaCorrecta) {
                                                try {
                                                    System.out.print("La nueva nota del alumno " + alumnos.get(i) + " sera: ");
                                                    double nuevaNota = scanner.nextDouble();
                                                    scanner.nextLine();
                                                    if (nuevaNota < 0 || nuevaNota > 10){
                                                        System.out.println("Error: el valor ingresado no es válido. Ingrese una calificación entre 0 y 10.");
                                                    } else {
                                                        notas.set(i, nuevaNota);
                                                        modificarNota = false;
                                                        System.out.println("Nota actualizada correctamente: ");
                                                        System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                                                        notaCorrecta = false;
                                                        System.out.print("Pulse Enter para continuar...");
                                                        scanner.nextLine();
                                                    }
                                                } catch (InputMismatchException Exception) {
                                                    System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados..");
                                                    scanner.nextLine();
                                                }
                                            }
                                        }
                                    }
                                    if (!alumnoEncontrado) {
                                        System.err.println("No se ha localizado al alumno solicitado. Asegúrese de ingresar los datos correctos.");
                                        System.out.print("Pulse Enter para volver a intentarlo...");
                                        scanner.nextLine();
                                    }
                                }
                            }
                        }
                    }
                }
                case 6 -> {
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine();
                    } else {
                        boolean eliminarAlumno = true;
                        while (eliminarAlumno) {
                            boolean alumnoEncontrado = false;
                            System.out.println("Lista de alumnos registrados: ");
                            for(int i = 0; i < alumnos.size(); i++){
                                System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                            }
                            System.out.print("Ingrese nombre completo del alumno a eliminar || '0' para cancelar eliminación: ");
                            String alumnoAEliminar = scanner.nextLine();
                            try {
                                int opciónCancelarEliminación = Integer.parseInt(alumnoAEliminar);
                                if (opciónCancelarEliminación == 0) {
                                    eliminarAlumno = false;
                                    System.out.println("Eliminación de nota alumno cancelada.");
                                    System.out.print("Pulse Enter para retornar al menú...");
                                    scanner.nextLine();
                                } else {
                                    System.out.println("Entrada no válida. Por favor, ingrese el nombre completo del alumno o '0' para cancelar la eliminación.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine();
                                }
                            } catch (NumberFormatException e) {
                                if(alumnoAEliminar.trim().isEmpty()){
                                    System.out.println("Debe ingresar un nombre. Este campo no puede estar vacío.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine();
                                } else {
                                    for (int i = 0; i < alumnos.size(); i++){
                                    if(alumnoAEliminar.equals(alumnos.get(i))){
                                        alumnoEncontrado = true;
                                        alumnos.remove(i);
                                        notas.remove(i);
                                        cantidadDeAlumnos = cantidadDeAlumnos - 1;
                                    }
                                }
                                if (alumnoEncontrado) {
                                    System.out.println("Alumno eliminado.");
                                    System.out.print("Pulse Enter para continuar...");
                                    scanner.nextLine();
                                    
                                } else {
                                    System.out.println("No se ha localizado al alumno solicitado. Asegúrese de ingresar los datos correctos.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine();
                                }
                                if (cantidadDeAlumnos == 0){
                                    System.out.println("No hay alumnos registrados.");
                                    System.out.print("Pulse Enter para retornar al menú...");
                                    scanner.nextLine();
                                    eliminarAlumno = false;
                                    }
                                }
                            }
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Programa finalizado.");
                    continuar = false;
                }
            }
        }
        scanner.close();
    }
}