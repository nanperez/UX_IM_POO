/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_02;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class hipotenusa {
    
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int a,b;
        double h, hipotenusa;
        
        System.out.println("Valor de a");
        a = nc.nextInt();
        
        System.out.println("Valor de b");
        b = nc.nextInt();
        
        h = ((Math.pow(a,2))+(Math.pow(b,2)));
        
        hipotenusa = Math.pow(h, 2);
        
        System.out.println("La hipotenusa es: "+hipotenusa);
        
    }
    
}
