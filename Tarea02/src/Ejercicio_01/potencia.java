/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_01;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class potencia {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int val1, val2;
        long resultado;
        System.out.println("Escribe un numero");
        val1 = nc.nextInt();
        
        System.out.println("Escribe el valor de la potencia");
        val2 = nc.nextInt();
        
        resultado = (long) Math.pow(val1, val2);
        System.out.println("El resultado es: "+resultado);
                
         
    }
    
}
