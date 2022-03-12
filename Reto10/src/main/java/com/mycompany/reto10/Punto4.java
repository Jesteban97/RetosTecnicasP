/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.toList;
import java.util.stream.DoubleStream;

/**
 *
 * @author JoseW
 */


public class Punto4 {
    
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Gloria", "Gonzales", 3.9);
        Estudiante estudiante2 = new Estudiante("Maria", "Francesca", 2.6);
        Estudiante estudiante3 = new Estudiante("Roberto", "Perez", 4.0);
        Estudiante estudiante4 = new Estudiante("Luis", "Rojas", 2.1);
        Estudiante estudiante5 = new Estudiante("Monica", "Mango", 4.7);
        
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);
        estudiantes.add(estudiante4);
        estudiantes.add(estudiante5);
        estudiantes.add(new Estudiante("Vanderlein", "Tamayo", 4.7));
        
        System.out.println("El promedio de todos los estudiantes es: " + promedioEstudiantes(estudiantes));
        System.out.println("El menor promedio de los estudiantes es: " + menorPromedio(estudiantes));
        System.out.println("Estudiante(s) con mayor promedio:");
        mayorPromedio(estudiantes);
        System.out.println("-----------------------------------");
    }
    
    public static double promedioEstudiantes(List<Estudiante> estudiantes){
        return estudiantes
                .stream()
                .collect(averagingDouble(est -> est.getPromedio()));
    }
    
    public static double menorPromedio(List<Estudiante> estudiantes) {
        return estudiantes
                .stream()
                .map(Estudiante::getPromedio)
                .min(Comparator.naturalOrder())
                .get();
    }
    
    // Puede que existan más estudiantes con la misma nota, por lo que es necesario tener en cuenta a más de uno.
    public static void mayorPromedio(List<Estudiante> estudiantes) {
        double mayorPromedio = estudiantes
                .stream()
                .map(Estudiante::getPromedio)
                .max(Comparator.naturalOrder())
                .get();
        
        estudiantes
                .stream()
                .filter(est -> est.getPromedio() == mayorPromedio)
                .forEach(e -> System.out.println("Nombre: " + e.getNombre() + " " + e.getApellido()));
    }
 
}
