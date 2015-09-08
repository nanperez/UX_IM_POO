/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Arrays;

/**
 *
 * @author nancy
 */
public class ArregloSuma {
    public static void main(String[] args) {
        int valores [];
        valores = new int[5];
        valores[0]=2;
        int suma = 0;
        
        System.out.println("El arreglo contiene "+Arrays.toString(valores));
        for (int i = 0; i < valores.length; i++) {
            valores[i]=i;
            suma +=valores[i];
            
        }
        
        System.out.println(valores.length);
                
        
        
        
        System.out.println("El nuevo arreglo es "+Arrays.toString(valores));
        System.out.println("La suma del arreglo es "+suma);
        Arrays.sort(valores);
        System.out.println("EL arreglo ordenado es"+Arrays.toString(valores));
       
    }
    
}
