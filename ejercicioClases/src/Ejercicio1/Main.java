package Ejercicio1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nancy
 */
public class Main {
    public static void main(String[] args) throws IOException {
        
         BufferedReader bf = new BufferedReader(new InputStreamReader(System.in) );
         Scanner nc = new Scanner(System.in); 
         int numObjetos, año;
         String modelo,color;
         
         List<Auto> a1 = new ArrayList<Auto>();
         //List<Termostato> t = new ArrayList<Termostato>();
         
         System.out.println("Número de objetos a crear");
         numObjetos = nc.nextInt();
                
             
             
             System.out.println("Año :");
             año = nc.nextInt();
             
             System.out.println("Modelo :");
             modelo = bf.readLine();
           
             System.out.print("Color :");
             color = bf.readLine();
             
             a1.add(new Auto(año,modelo,color));
            
        
        
         
         //Imprimir elementos Opcion 1
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        
        // Imprimir elementos Opcion 2
        // for each
         for(Object o: a1){
            System.out.println(o);
        }
         
         // DEvuelve el tamaño de la lista
         System.out.println("Tamaño"+a1.size());
         
         
         //Sustituye un elemento de la lista por otro
         a1.set(0, new Auto(2011,"chevy","azul"));
         
         //Elimina un elemento de la lista
         a1.remove(0);
         
         // Elimina todos los elementos
         a1.clear();
       
            
    }
    
    
    
}
