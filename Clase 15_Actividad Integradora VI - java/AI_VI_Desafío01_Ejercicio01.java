// Actividad: Registro de alumnos
// Escribe un programa en Java que permita al usuario llevar un registro de alumnos.
// El programa debe cumplir con los siguientes requisitos:
// 1. Muestra un menú de opciones al usuario donde podrá:
// 1.1 Registrar alumno: Permitir al usuario registrar un nuevo alumno ingresando su nombre y nota. 
// Para lograr esto, te recomendamos utilizar un array de tipo String para almacenar los nombres de los alumnos y un array de tipo Double para guardar las notas correspondientes. De esta manera, podrás asociar los nombres con las notas utilizando los índices de los arrays.
// 1.2 Mostrar todos los alumnos: Mostrar en pantalla el nombre y la nota de todos los alumnos registrados hasta el momento.
// 1.3 Mostrar promedio de notas: Calcular y mostrar en pantalla el promedio de las notas de todos los alumnos registrados hasta el momento.
// 1.4 Buscar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y mostrar en pantalla su nota si el alumno existe.
// 1.5 Modificar nota por nombre: Solicitar al usuario ingresar el nombre de un alumno y permitir modificar su nota si el alumno existe.
// 1.6 Eliminar alumno por nombre: Solicitar al usuario ingresar el nombre de un alumno y eliminar al alumno si existe.
// 1.7 Salir: Terminar el programa.
// 2. El programa debe validar que el nombre no esté vacío y que la nota sea un número válido entre 0.00 y 10.00.
// 3. El programa debe utilizar las estructuras de control adecuadas (if, switch, for, while, do-while) según corresponda para implementar las diferentes opciones del menú.
// 4. El programa debe manejar excepciones utilizando bloques try-catch para manejar posibles excepciones al leer datos de entrada del usuario.
// 5. Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción hasta que elija la opción "Salir".
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AI_VI_Desafío01_Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // listas para almacenar nombres de alumnos y sus calificaciones
        ArrayList<String> alumnos = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {
            // mostrar el menú de opciones
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
                // Leer la opción del usuario
                opción = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner
                // Validar la opción seleccionada
                if (opción < 1 || opción > 7) {
                    System.out.println("Entrada no válida. Seleccione una opción del 1 al 7.");
                    System.out.print("Pulse Enter para volver a intentarlo...");
                    scanner.nextLine();
                }
            } catch (InputMismatchException e) {
                // Manejar la excepción si el usuario ingresa un valor no numérico
                System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados.");
                scanner.nextLine(); // Limpiar el buffer del scanner
            }

            int cantidadDeAlumnos = alumnos.size();

            switch (opción){
                // caso para registrar un nuevo alumno
                case 1 -> {
                    boolean nameValido = true;
                    while (nameValido) {
                        System.out.print("Ingrese nombre del alumno || '0' para cancelar el registro: ");
                        String newAlumno = scanner.nextLine();
                        try {
                            // verificar si el usuario ingresa '0' para cancelar el registro
                            int opciónSalirRegistro = Integer.parseInt(newAlumno);
                            if (opciónSalirRegistro == 0) {
                                nameValido = false;
                                System.out.println("Registro cancelado.");
                                System.out.print("Pulse Enter para retornar al menú...");
                                scanner.nextLine();
                            } else {System.out.println("Entrada no válida. Por favor, ingrese el nombre del alumno o '0' para cancelar el registro.");}
                        } catch (NumberFormatException e) {
                            // validar que el nombre no esté vacío
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
                                        scanner.nextLine(); // limpiar el buffer del scanner
                                        // validar que la calificación esté en el rango adecuado
                                        if (nota < 0 || nota > 10) {
                                            System.out.println("Error: el valor ingresado no es válido. Ingrese una calificación entre 0 y 10.");
                                        } else {
                                            // registrar el alumno y su calificación
                                            alumnos.add(newAlumno);
                                            notas.add(nota);
                                            calificaciónValida = false;
                                            System.out.printf("| %-15s | Calificación: %6.1f |\n", newAlumno, nota);
                                            System.out.println("Alumno registrado con éxito.");
                                            System.out.print("Pulse Enter para continuar...");
                                            scanner.nextLine();
                                        }
                                    } catch (InputMismatchException Exception) {
                                        // manejar la excepción si el usuario ingresa un valor no numérico para la calificación
                                        System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados..");
                                        scanner.nextLine(); // limpiar el buffer del scanner
                                    }
                                }
                            }
                        }
                    }
                    
                }
                case 2 -> {
                    // verificar si no hay alumnos registrados
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine(); // Esperar a que el usuario presione Enter para volver al menú
                    } else {
                        // mostrar la lista de alumnos registrados
                        System.out.println("Lista de alumnos registrados: ");
                        // iterar sobre la lista de alumnos
                        for (int i = 0; i < alumnos.size(); i++) {
                            // imprimir el nombre del alumno y su calificación
                            System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                        }
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine(); // esperar a que el usuario presione Enter para volver al menú
                    }
                }
                case 3 -> {
                    // verificar si no hay alumnos registrados
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine(); // esperar a que el usuario presione Enter para volver al menú
                    } else {
                        // calcular el promedio de las calificaciones
                        double promedioGeneral = 0.0;
                        // sumar todas las calificaciones
                        for (double nota : notas) {
                            promedioGeneral = promedioGeneral + nota;
                        }
                        // dividir la suma por el número total de calificaciones para obtener el promedio
                        promedioGeneral = promedioGeneral / notas.size();
                        // mostrar el promedio general de las calificaciones
                        System.out.println("Promedio general de todos los alumnos registrados: " + promedioGeneral);
                        System.out.print("Pulse Enter para continuar...");
                        scanner.nextLine(); // esperar a que el usuario presione Enter para continuar
                    }
                }                
                case 4 -> {
                    // verificar si no hay alumnos registrados
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine(); // esperar a que el usuario presione Enter para volver al menú
                    } else {
                        // variable para controlar el bucle de búsqueda
                        boolean buscarAlumno = true;
                        while (buscarAlumno) {
                            // solicitar al usuario el nombre del alumno o '0' para cancelar
                            System.out.print("Ingrese nombre del alumno || '0' para cancelar búsqueda: ");
                            String alumno = scanner.nextLine();
                            try {
                                // verificar si el usuario ingresa '0' para cancelar la búsqueda
                                int opciónSalirBúsqueda = Integer.parseInt(alumno);
                                if (opciónSalirBúsqueda == 0) {
                                    buscarAlumno = false;
                                    System.out.println("Búsqueda cancelada.");
                                    System.out.print("Pulse Enter para retornar al menú...");
                                    scanner.nextLine(); // esperar a que el usuario presione Enter para volver al menú
                                } else {
                                    System.out.println("Entrada no válida. Por favor, ingrese el nombre del alumno o '0' para cancelar búsqueda.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine(); // esperar a que el usuario presione Enter para volver a intentar
                                }
                            } catch (NumberFormatException e) {
                                // verificar que el nombre ingresado no esté vacío
                                if (alumno.trim().isEmpty()) {
                                    System.out.println("Debe ingresar un nombre. Este campo no puede estar vacío.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine(); // esperar a que el usuario presione Enter para volver a intentar
                                } else {
                                    // contar cuántos alumnos coinciden con el nombre ingresado
                                    int alumnosEncontrados = 0;
                                    for (int i = 0; i < alumnos.size(); i++) {
                                        // comparar el nombre del alumno ingresado con los registrados
                                        if (alumnos.get(i).equals(alumno)) {
                                            alumnosEncontrados++;
                                        } else {
                                            // dividir el nombre registrado en partes y buscar coincidencias
                                            String[] nombres = alumnos.get(i).trim().split("\\s+");
                                            for (String nombre : nombres) {
                                                if (nombre.equals(alumno)) alumnosEncontrados++;
                                            }
                                        }
                                    }
                                    // mostrar el número de alumnos encontrados
                                    if (alumnosEncontrados > 0) {
                                        System.out.println("Alumnos encontrados: " + alumnosEncontrados);
                                        // imprimir los detalles de los alumnos encontrados
                                        for (int i = 0; i < alumnos.size(); i++) {
                                            if (alumnos.get(i).equals(alumno)) {
                                                System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                                            } else {
                                                // dividir el nombre registrado en partes y mostrar detalles si hay coincidencias
                                                String[] nombres = alumnos.get(i).trim().split("\\s+");
                                                for (String nombre : nombres) {
                                                    if (nombre.equals(alumno)) {
                                                        System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                                                    }
                                                }
                                            }
                                        }
                                        System.out.print("Pulse Enter para realizar una nueva búsqueda...");
                                        scanner.nextLine(); // esperar a que el usuario presione Enter para continuar
                                    } 
                                    // si no se encuentra ningún alumno, mostrar un mensaje de error
                                    if (alumnosEncontrados == 0) {
                                        System.err.println("No se ha localizado al alumno solicitado. Asegúrese de ingresar los datos correctos.");
                                        System.out.print("Pulse Enter para volver a intentarlo...");
                                        scanner.nextLine(); // esperar a que el usuario presione Enter para volver a intentar
                                    }
                                }
                            }
                        }
                    }
                }                
                case 5 -> {
                    // verificar si no hay alumnos registrados
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine(); // esperar a que el usuario presione Enter para volver al menú
                    } else {
                        // mostrar la lista de alumnos registrados y sus calificaciones
                        System.out.println("Lista de alumnos registrados: ");
                        for (int i = 0; i < alumnos.size(); i++) {
                            System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                        }
                        // variable para controlar el bucle de modificación de nota
                        boolean modificarNota = true;
                        while (modificarNota) {
                            // solicitar al usuario el nombre completo del alumno o '0' para cancelar
                            System.out.print("Ingrese nombre completo del alumno || '0' para cancelar modificación: ");
                            String alumno = scanner.nextLine();
                            try {
                                // verificar si el usuario ingresa '0' para cancelar la modificación
                                int opciónCancelarModificación = Integer.parseInt(alumno);
                                if (opciónCancelarModificación == 0) {
                                    modificarNota = false;
                                    System.out.println("Modificación de nota cancelada.");
                                    System.out.print("Pulse Enter para retornar al menú...");
                                    scanner.nextLine(); // esperar a que el usuario presione Enter para volver al menú
                                } else {
                                    System.out.println("Entrada no válida. Por favor, ingrese el nombre completo del alumno o '0' para cancelar la modificación de nota.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine(); // esperar a que el usuario presione Enter para volver a intentar
                                }
                            } catch (NumberFormatException e) {
                                // verificar que el nombre ingresado no esté vacío
                                if (alumno.trim().isEmpty()) {
                                    System.out.println("Debe ingresar un nombre. Este campo no puede estar vacío.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine(); // Esperar a que el usuario presione Enter para volver a intentar
                                } else {
                                    // variable para verificar si se encontró al alumno
                                    boolean alumnoEncontrado = false;
                                    for (int i = 0; i < alumnos.size(); i++) {
                                        // comparar el nombre del alumno ingresado con los registrados
                                        if (alumno.equals(alumnos.get(i))) {
                                            alumnoEncontrado = true;
                                            System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                                            // variable para controlar el bucle de entrada de nueva nota
                                            boolean notaCorrecta = true;
                                            while (notaCorrecta) {
                                                try {
                                                    // solicitar al usuario la nueva calificación
                                                    System.out.print("La nueva nota del alumno " + alumnos.get(i) + " será: ");
                                                    double nuevaNota = scanner.nextDouble();
                                                    scanner.nextLine(); // Limpiar el buffer
                                                    if (nuevaNota < 0 || nuevaNota > 10) {
                                                        System.out.println("Error: el valor ingresado no es válido. Ingrese una calificación entre 0 y 10.");
                                                    } else {
                                                        // actualizar la nota del alumno
                                                        notas.set(i, nuevaNota);
                                                        modificarNota = false;
                                                        System.out.println("Nota actualizada correctamente: ");
                                                        System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                                                        notaCorrecta = false;
                                                        System.out.print("Pulse Enter para continuar...");
                                                        scanner.nextLine(); // esperar a que el usuario presione Enter para continuar
                                                    }
                                                } catch (InputMismatchException Exception) {
                                                    System.out.println("Error: Por favor, ingrese un número válido. Los caracteres no son aceptados.");
                                                    scanner.nextLine(); // limpiar el buffer en caso de excepción
                                                }
                                            }
                                        }
                                    }
                                    // mostrar mensaje de error si no se encuentra el alumno
                                    if (!alumnoEncontrado) {
                                        System.err.println("No se ha localizado al alumno solicitado. Asegúrese de ingresar los datos correctos.");
                                        System.out.print("Pulse Enter para volver a intentarlo...");
                                        scanner.nextLine(); // esperar a que el usuario presione Enter para volver a intentar
                                    }
                                }
                            }
                        }
                    }
                }                
                case 6 -> {
                    // verificar si no hay alumnos registrados
                    if (cantidadDeAlumnos == 0) {
                        System.out.println("No hay alumnos registrados.");
                        System.out.print("Pulse Enter para retornar al menú...");
                        scanner.nextLine(); // esperar a que el usuario presione Enter para volver al menú
                    } else {
                        // variable para controlar el bucle de eliminación de alumno
                        boolean eliminarAlumno = true;
                        while (eliminarAlumno) {
                            // variable para verificar si se encontró el alumno a eliminar
                            boolean alumnoEncontrado = false;
                            // mostrar la lista de alumnos registrados y sus calificaciones
                            System.out.println("Lista de alumnos registrados: ");
                            for (int i = 0; i < alumnos.size(); i++) {
                                System.out.printf("| %-15s | Calificación: %6.1f |\n", alumnos.get(i), notas.get(i));
                            }
                            // solicitar al usuario el nombre completo del alumno a eliminar o '0' para cancelar
                            System.out.print("Ingrese nombre completo del alumno a eliminar || '0' para cancelar eliminación: ");
                            String alumnoAEliminar = scanner.nextLine();
                            try {
                                // verificar si el usuario ingresa '0' para cancelar la eliminación
                                int opciónCancelarEliminación = Integer.parseInt(alumnoAEliminar);
                                if (opciónCancelarEliminación == 0) {
                                    eliminarAlumno = false;
                                    System.out.println("Eliminación de nota alumno cancelada.");
                                    System.out.print("Pulse Enter para retornar al menú...");
                                    scanner.nextLine(); // esperar a que el usuario presione Enter para volver al menú
                                } else {
                                    System.out.println("Entrada no válida. Por favor, ingrese el nombre completo del alumno o '0' para cancelar la eliminación.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine(); // esperar a que el usuario presione Enter para volver a intentar
                                }
                            } catch (NumberFormatException e) {
                                // verificar que el nombre ingresado no esté vacío
                                if (alumnoAEliminar.trim().isEmpty()) {
                                    System.out.println("Debe ingresar un nombre. Este campo no puede estar vacío.");
                                    System.out.print("Pulse Enter para volver a intentarlo...");
                                    scanner.nextLine(); // esperar a que el usuario presione Enter para volver a intentar
                                } else {
                                    // buscar y eliminar al alumno si se encuentra en la lista
                                    for (int i = 0; i < alumnos.size(); i++) {
                                        if (alumnoAEliminar.equals(alumnos.get(i))) {
                                            alumnoEncontrado = true;
                                            alumnos.remove(i); // eliminar el alumno de la lista
                                            notas.remove(i); // eliminar la calificación correspondiente
                                            cantidadDeAlumnos = cantidadDeAlumnos - 1; // reducir el contador de alumnos
                                        }
                                    }
                                    // mensaje de éxito si el alumno fue eliminado
                                    if (alumnoEncontrado) {
                                        System.out.println("Alumno eliminado.");
                                        System.out.print("Pulse Enter para continuar...");
                                        scanner.nextLine(); // esperar a que el usuario presione Enter para continuar
                                    } else {
                                        // mensaje de error si no se encontró al alumno
                                        System.out.println("No se ha localizado al alumno solicitado. Asegúrese de ingresar los datos correctos.");
                                        System.out.print("Pulse Enter para volver a intentarlo...");
                                        scanner.nextLine(); // esperar a que el usuario presione Enter para volver a intentar
                                    }
                                    // verificar si la lista de alumnos está vacía después de la eliminación
                                    if (cantidadDeAlumnos == 0) {
                                        System.out.println("No hay alumnos registrados.");
                                        System.out.print("Pulse Enter para retornar al menú...");
                                        scanner.nextLine(); // esperar a que el usuario presione Enter para volver al menú
                                        eliminarAlumno = false; // salir del bucle de eliminación
                                    }
                                }
                            }
                        }
                    }
                }                
                case 7 -> {
                    // Imprimir mensaje de cierre del programa
                    System.out.println("Programa finalizado.");
                    // Cambiar la variable de control para salir del bucle principal
                    continuar = false;
                }                
            }
        }
        scanner.close(); // cierre del objeto scanner
    }
}