package com.mycompany.curso.java.universidad.clase1;

import java.util.Scanner;

public class Ejercicio3Reto3 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double matriz[][];
        // Matriz --> Mnxm
        // N --> filas
        // M --> columnas
        System.out.println("Por favor ingrese el número de filas que desea: ");
        int entradaFilas = lector.nextInt();
        System.out.println("Por favor ingrese el número de columnas que desea: ");
        int entradaColumnas = lector.nextInt();

        System.out.println("\n----------------------");
        System.out.println("Su matriz sera de orden: " + "M" + entradaFilas + "x" + entradaColumnas
                + "\nFilas: " + entradaFilas
                + "\nColumnas: " + entradaColumnas);
        System.out.println("----------------------\n");

        matriz = new double[entradaColumnas][entradaColumnas];

        for (int i = 0; i < entradaFilas; i++) {
            for (int j = 0; j < entradaColumnas; j++) {
                System.out.println("Por favor ingrese el número de la posición P" + (i + 1) + "-" + (j + 1) + ":");
                double entradaNumeros = lector.nextDouble();
                matriz[i][j] = entradaNumeros;
            }
        }

        System.out.println("\n*****************************\n");
        String numerosMatriz = new String();
        numerosMatriz = "";
        for (int i = 0; i < entradaFilas; i++) {
            for (int j = 0; j < entradaColumnas; j++) {
                numerosMatriz += String.valueOf(matriz[i][j]) + " | ";
            }
            System.out.println(numerosMatriz);
            System.out.println("");
            numerosMatriz = "";
        }
        System.out.println("*****************************");

    }

}
