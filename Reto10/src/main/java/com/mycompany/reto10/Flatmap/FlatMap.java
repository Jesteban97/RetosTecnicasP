/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto10.Flatmap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author JoseW
 */
public class FlatMap {

    /*
    La definición de flatMap es la siguiente: es una operación/función en el stream de Java 
    que se utiliza para obtener un nuevo steam después de realizar alguna tarea funcional.
    
    Lo más importante de flatMap es el concepto de aplanamiento, y ¿qué es? es tomar un stream
    dentro de un stream y devolver otro pero con todos los elementos en un mismo nivel.
    
    [["A", "B"], ["C", "D"], ["E", "F"]]
    Si quisieramos aplanarlo tendríamos como resultado --> ["A", "B", "C", "D", "E", "F"]
    
    Ahora, ¿es una función de orden superior? La definición de funcion de orden superior, es que 
    una función reciba como parámetro otra función, y esto es lo que justamente hace flatMap. Por
    lo que sí, flatMap es una función de orden superior.
    
    Ejm:
     */

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Maria");
        Estudiante est2 = new Estudiante("Pedro");

        est1.añadirCursos(new Curso("Fisica de Ondas"));
        est1.añadirCursos(new Curso("Matematicas Discretas II"));
        est1.añadirCursos(new Curso("Ingles III"));
        
        est2.añadirCursos(new Curso("Ecuaciones Diferenciales"));
        est2.añadirCursos(new Curso("Técnicas de Programación"));
        est2.añadirCursos(new Curso("Lógica y Representación III"));
        
        List<Estudiante> listaEstudiantes = new ArrayList();
        
        listaEstudiantes.add(est1);
        listaEstudiantes.add(est2);
        
        // Si quisieramos tener en una lista todos los cursos tendriamos que usar dos for each.
        
        List<String> listaCursoSF = new ArrayList(); // SF --> Sin flatMap
        
        for (Estudiante estudiante : listaEstudiantes) {
            for (Curso curso : estudiante.getCursos()) {
                listaCursoSF.add(curso.getNombreCurso());
            }
        }
        
        System.out.println("Lista de cursos sin flatMap: " + listaCursoSF);
        
        // Ahora con flatMap
        
        List<String> listaCursosCF = listaEstudiantes
                .stream()                           // Convierte la lista en un stream
                .map(Estudiante::getCursos)         // Crea un stream donde hay listas (los cursos)
                .flatMap(List::stream)              // Aplana el stream los vuelve uno solo donde hay solo objetos Curso    
                .map(Curso::getNombreCurso)         // Toma los nombres de cada curso
                .collect(toList());                 // Convierte el stream en una lista
        
        // Estudiante::getCursos == e -> e.getCursos()
        
        System.out.println("Lista de cursos sin flatMap: " + listaCursosCF);
    }
}
