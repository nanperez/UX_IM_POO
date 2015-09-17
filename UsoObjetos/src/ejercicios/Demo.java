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
public class Demo {
    public static void main(String[] args) {
        
        Circulo miObjeto = new Circulo();
        miObjeto.radio = 5;
        
        
        // Forma 1: declarar una variable para asignarle
        // lo  que retorne el método
        double resul;
        resul = miObjeto.area(); // Llamando a mi metodo
        System.out.println("El area es "+resul);
        
        //Forma 2. Poner directamente el llamdo del metodo
        // dentro del system.out.println
        System.out.println(miObjeto.area());
        
        
    }
    
}
