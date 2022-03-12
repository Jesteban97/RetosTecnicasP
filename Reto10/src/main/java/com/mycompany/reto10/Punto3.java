/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reto10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;

/**
 *
 * @author JoseW
 */
public class Punto3 {
    
    public static void main(String[] args) {
        List<Double> listaNumeros = new ArrayList<>();
        listaNumeros.add(2.0);
        listaNumeros.add(4.0);
        listaNumeros.add(6.0);
        listaNumeros.add(45.3);
        
        Set<String> cadenas = new HashSet<>();
        cadenas.add("palabra");
        cadenas.add("lola");
        cadenas.add("vaca");
        cadenas.add("one piece");
        
        System.out.println("La lista a raices cuadradas: " + convertirARaizCuadrada(listaNumeros));
        System.out.println("El factorial de 5 es: " + factorial(5));
        System.out.println("Lista de Cadenas con más de cinco caracteres: " + cadenasDeMasDe5Caracteres(cadenas));
        
    }
    
    public static List<Double> convertirARaizCuadrada(List<Double> listaDeNumeros){
        List<Double> numerosRaizCuadrada = listaDeNumeros
                .stream()
                .map(num -> Math.pow(num, 0.5))
                .collect(toList());
        return numerosRaizCuadrada;
    }
    
    public static int factorial(int num) {
        return IntStream
                .rangeClosed(1, num)
                .reduce(1, (int a, int b) -> a * b);
    }
    
    public static List<String> cadenasDeMasDe5Caracteres(Set<String> cadenaCaracteres) {
        return cadenaCaracteres
                .stream()
                .filter(cad -> cad.length() > 5)
                .collect(toList());
    }
}
