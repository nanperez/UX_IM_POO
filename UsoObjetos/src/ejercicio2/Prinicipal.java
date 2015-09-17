/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class Prinicipal {
    public static void main(String[] args) {
        Operaciones obj = new Operaciones();
        
        Scanner nc = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Dame el primer valor");
        num1 = nc.nextInt();
        
        System.out.println("Dame el segundo valor");
        num2 = nc.nextInt();
        
        System.out.println(obj.sumar(num1, num2));
        System.out.println( obj.restar(num1, num2));
        System.out.println(obj.multiplicacion(num1, num2));
        System.out.println(obj.division(num1, num2));
        
        
        
        
    }
    
    
}
