package Ejercicio4Completo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Carlos", "Perez", "Lopez", new Date(2005 - 1900, 6, 15), 123456, null, "SIS001"));
        estudiantes.add(new Estudiante("Ana", "Garcia", "Martinez", new Date(2004 - 1900, 3, 22), 654321, null, "SIS002"));
        estudiantes.add(new Estudiante("Juan", "Rodriguez", "Gonzalez", new Date(2003 - 1900, 12, 5), 789123, null, "SIS003"));
        estudiantes.add(new Estudiante("Laura", "Hernandez", "Garcia", new Date(2006 - 1900, 1, 18), 123987, null, "SIS004"));
        estudiantes.add(new Estudiante("Fernando", "Torrez", "Lopez", new Date(2005 - 1900, 11, 30), 345678, null, "SIS005"));
        estudiantes.add(new Estudiante("Lucia", "Montes", "Fernandez", new Date(2004 - 1900, 5, 7), 987654, null, "SIS006"));
        estudiantes.add(new Estudiante("Diego", "Vargas", "Guzman", new Date(2007 - 1900, 9, 14), 678912, null, "SIS007"));
        estudiantes.add(new Estudiante("Sofia", "Castro", "Mendoza", new Date(2003 - 1900, 4, 20), 112233, null, "SIS008"));
        estudiantes.add(new Estudiante("Jorge", "Medina", "Pacheco", new Date(2005 - 1900, 2, 25), 445566, null, "SIS009"));
        estudiantes.add(new Estudiante("Valeria", "Flores", "Quinteros", new Date(2006 - 1900, 6, 10), 778899, null, "SIS010"));
        estudiantes.add(new Estudiante("Mateo", "Rivera", "Ortiz", new Date(2004 - 1900, 7, 1), 998877, null, "SIS011"));
        estudiantes.add(new Estudiante("Isabela", "Perez", "Sosa", new Date(2003 - 1900, 10, 8), 334455, null, "SIS012"));
        estudiantes.add(new Estudiante("Andres", "Lozano", "Cruz", new Date(2006 - 1900, 8, 13), 223344, null, "SIS013"));
        estudiantes.add(new Estudiante("Mariana", "Romero", "Escobar", new Date(2005 - 1900, 3, 5), 556677, null, "SIS014"));
        estudiantes.add(new Estudiante("Sebastian", "Campos", "Villalobos", new Date(2007 - 1900, 0, 25), 887766, null, "SIS015"));
        estudiantes.add(new Estudiante("Camila", "Silva", "Navarro", new Date(2004 - 1900, 11, 3), 112244, null, "SIS016"));
        estudiantes.add(new Estudiante("Nicolas", "Gomez", "Carvajal", new Date(2003 - 1900, 9, 9), 889977, null, "SIS017"));
        estudiantes.add(new Estudiante("Carla", "Espinoza", "Chavez", new Date(2006 - 1900, 2, 17), 334466, null, "SIS018"));



        ordenarPorEdad(estudiantes);

        System.out.println("Estudiantes ordenados por edad:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + " " + estudiante.getPrimerApellido() + " - Edad: " + estudiante.calcularEdad());
        }
    }

    // Método burbuja
    public static void ordenarPorEdad(List<Estudiante> estudiantes) {
        for (int i = 0; i < estudiantes.size() - 1; i++) {
            for (int j = 0; j < estudiantes.size() - i - 1; j++) {
                if (estudiantes.get(j).calcularEdad() > estudiantes.get(j + 1).calcularEdad()) {
                    // Intercambiar estudiantes
                    Estudiante temp = estudiantes.get(j);
                    estudiantes.set(j, estudiantes.get(j + 1));
                    estudiantes.set(j + 1, temp);
                }
            }
        }
    }
}


