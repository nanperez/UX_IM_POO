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
public class Dias {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        byte valor;
        System.out.println("Escribe un número");
        valor = n.nextByte();
        if((valor<1) || (valor > 7)){
            System.out.println("Valor invalido");
        }else if((valor >=1) && (valor<=5)){
            System.out.println("Asistir a clases");
        }else{
            System.out.println("No hay clases");
        }
    }
    
}
