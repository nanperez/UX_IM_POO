/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_03;

import java.util.Scanner;

/**
 *
 * @author nancy
 */
public class tipoNumero {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        float valor;
        
        System.out.println("Escribe un valor");
        valor = nc.nextFloat();
        
        if(valor == 0){
            System.out.println("EL valor es igual a cero");
        }else if(valor > 0){
            System.out.println("El valor es positivo");
        }else if(valor < 0){
            System.out.println("El valor es negativo");
        }
        
                
    }
    
}
