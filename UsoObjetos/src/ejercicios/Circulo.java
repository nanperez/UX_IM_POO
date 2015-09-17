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
public class Circulo {
    
    double radio;
    String color;
    
    double obtRadio(){
        return radio;
    }
    
    
    void asigRadio(int nuevoRadio){
        radio = nuevoRadio;
    }
    
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    
}
