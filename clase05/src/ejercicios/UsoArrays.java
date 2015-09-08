/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author nancy
 */
import java.util.Arrays;
import java.util.Scanner;


public class UsoArrays{
	public static void main(String[] args) {
                Scanner nc = new Scanner(System.in);
            
		int[] arregloEnteros = { 2, 4, 3, 7, 21, 9, 98, 76, 74 };
		System.out.printf("Tamaño del arreglo: %d\n", arregloEnteros.length);
		System.out.printf("Elementos del arreglo: %s\n", Arrays.toString(arregloEnteros));
                
                // Búsqueda de un elemento en el arreglo
                System.out.println("Escribe un valor para buscar en el arreglo");
                int val = nc.nextInt();
                System.out.println(Arrays.binarySearch(arregloEnteros, val));  // COn esta linea imprimen la posicion que retorna la busqueda
                
                
                // Búsqueda en un segmento del arreglo
                // Se requiere una posicion inicial (inferior) y una posición final (superior)
                System.out.println("Escribe un valor para buscar en el arreglo");
                int val2 = nc.nextInt();
                System.out.println("Escribe un indice inferior");
                int idx_inferior = nc.nextInt();
                System.out.println("Escribe un indice superior");
                int idx_superior = nc.nextInt();
                System.out.println(Arrays.binarySearch(arregloEnteros, idx_inferior, idx_superior, val));
                
                // Ordenar un arreglo
                Arrays.sort(arregloEnteros);
                System.out.println("El arreglo ordenado es");
                System.out.println(Arrays.toString(arregloEnteros));
                

		

		
	}
}

