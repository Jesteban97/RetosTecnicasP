/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicasprogramacion.reto3;
import java.util.Scanner;
import java.util.Arrays;
import java.math.*;
     
/**
 *
 * @author USUARIO
 */
public class ejercicio1 {
    public static void main(String[] args){
        //dfinicion de variables
        String notas1 [];
        double mayor = 0;
        double menor = 5;
        double prom;
        double sumatoria=0;
        double varianza=0;
        double desviacion;
        //asignación de valores al vector por medio de string
        System.out.println("Ingrese las notas de 0 a 5 en valor decimal con . separadas por una coma\nPor ejemplo: 1.0,2.0,3.0");
    Scanner nota = new Scanner(System.in);
    String notas = nota.nextLine();
    notas1 = notas.split(",");
    double notasd []= new double[notas1.length];
    //casteo de los valores a double
    for(int i=0;i<notas1.length;i++ ){
        double n = Double.parseDouble(notas1[i]);
        notasd[i] = n;
    }
    //obtener la mayor nota
    for(int j=0;j<notasd.length;j++){
        
        if(mayor<notasd[j]){
            mayor = notasd[j];
        }
        else{
        mayor = mayor;
        }
    }
    //obtener la menor nota
    for(int k=0;k<notasd.length;k++){
        
        if(menor>notasd[k]){
            menor = notasd[k];
        }
        else{
       menor = menor;
        }
    }
    //obtener la nota promedio
    for(int l=0;l<notasd.length;l++){
        sumatoria += notasd[l];
    }
    prom = sumatoria/notasd.length;
    //obtener la varianza
    for(int n=0;n<notasd.length;n++){
        double aux;
       aux = Math.pow(notasd[n] - prom, 2);
       varianza+=aux;
    }
    varianza=varianza/notasd.length;
    // desviación
    desviacion=Math.sqrt(varianza);
    //salida de datos
        System.out.println("las notas ingresadas son: ");
    for(int m=0;m>notasd.length;m++){
        System.out.print(" "+notasd[m]+" ");
    }
        System.out.println("la mayor nota es de: "+mayor);
        System.out.println("la menor nota es de: "+menor);
        System.out.println("el promedio de las notas es de "+prom);
        System.out.println(" la varianza del conjunto de notas es de"+varianza);
        System.out.println("la desviación estandar del conjunto de notas es de: "+desviacion);
}
}
