/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author nancy
 */
public class Alumno {
    
    //Atributos
    
    String nombre;
    String apellidoMaterno;
    String apellidoPaterno;
    int edad;
    
    // Metodo constructor
    public Alumno(String nombre, String aP, String aM, int edad){
        this.nombre = nombre;
        apellidoPaterno = aP;
        apellidoMaterno = aM;
        this.edad = edad;
    }
    
}
