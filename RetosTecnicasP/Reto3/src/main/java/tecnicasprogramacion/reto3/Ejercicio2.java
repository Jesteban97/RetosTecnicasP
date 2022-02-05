package com.mycompany.curso.java.universidad.clase1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        double[] vectorUno;
        double[] vectorDos;

        System.out.println("Por favor digite la dimension de los dos vectores\n"
                + "Por ejemplo: este es un vector de 4 dimensiones.\n"
                + "(x, y, z, w)");

        System.out.println("¿Cuál es la dimensión de sus vectores? [número entero]");
        int dimensionVector = lector.nextInt();
        vectorUno = new double[dimensionVector];
        vectorDos = new double[dimensionVector];

        System.out.println("*****************************");

        int contadorVectorUno = 0;
        while (contadorVectorUno < dimensionVector) {
            System.out.println("Digite el valor del " + (contadorVectorUno + 1)
                    + "° elemento del vector uno:");
            double valorVectorUno = lector.nextDouble();
            vectorUno[contadorVectorUno] = valorVectorUno;
            contadorVectorUno++;
        }

        System.out.println("*****************************");

        int contadorVectorDos = 0;
        while (contadorVectorDos < dimensionVector) {
            System.out.println("Digite el valor del " + (contadorVectorDos + 1)
                    + "° elemento del vector dos:");
            double valorVectorDos = lector.nextDouble();
            vectorDos[contadorVectorDos] = valorVectorDos;
            contadorVectorDos++;
        }

        double resultado = 0;
        for (int i = 0; i < dimensionVector; i++) {
            resultado += (vectorUno[i] * vectorDos[i]);
        }

        System.out.println("*****************************");

        System.out.println("La multiplicacion escalar entre los dos vectores es: " + resultado);
    }

}
