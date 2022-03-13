/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.reto10;
import java.util.Scanner;

public class Punto1 {
    
    static Scanner datos = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero: ");
        int num = datos.nextInt();
        System.out.println("La sumatoria de los dígitos del número: "+num+" es: "+sumarDigitos(num));
    }
    //funcion recursiva que toma el numero ingresado, si es diferente a 0
    // toma el numero quito el digito de la derecha e igualmente se le suma.
    //en esta misma linea se llama al mismo metodo de manera recursiva pasandole el numero sin el numero de la derecha.
    public static int sumarDigitos(int num){
           if(num==0){
               return 0;
           } else{
               return sumarDigitos(num/10)+num%10;
           }
        }
}
