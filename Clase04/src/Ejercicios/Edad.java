/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class Edad {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int edad;
        System.out.println("Introduce una edad");
        edad = n.nextInt();
        
        if (edad>=18){
            System.out.println("La persona es mayor de edad");
        }else{
            
            System.out.println("La persona es menor de edad");
        }
        if(!(edad==18)){
            System.out.println("La perona no puede votar");
        }
    }
    
}
