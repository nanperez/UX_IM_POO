/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_04;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class opcionOpera {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        int num1, num2, opcion;
        
        System.out.println("Escribe un numero");
        num1 = nc.nextInt();
        
        System.out.println("Escribe otro valor");
        num2 = nc.nextInt();
        
        System.out.println("Escribe 1)Suma, 2)Resta o 3)Multiplicacion");
        opcion = nc.nextInt();
        
        if(opcion == 1){
            System.out.println("Seleccionaste la suma");
            System.out.println("La suma es :"+(num1+num2));
        }else if(opcion == 2){
            System.out.println("Selecciono la resta");
            System.out.println("La resta es :"+(num1-num2));
        }else if(opcion == 3){
            System.out.println("Seleccionaste la multiplicacion");
            System.out.println("La multiplicación es :"+(num1*num2));
        }
        
        
        
    }
    
}
