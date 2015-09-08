package ejercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nancy
 */
import java.util.Arrays;

public class MultiArreglo {
    public static void main(String[] args) {
        
        int arreglo1 [] = new int[20];
        int suma=0;
        double promedio = 0;
        
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i]=i*5;
            suma = suma+arreglo1[i];
        }
        
        promedio = suma/arreglo1.length;
        
        System.out.println(Arrays.toString(arreglo1));
        System.out.println("La suma:"+suma);
    }
    
}
