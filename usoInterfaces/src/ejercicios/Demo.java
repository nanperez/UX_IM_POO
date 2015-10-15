/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nancy
 */
public class Demo {
    public static void main(String[] args) {
        
        List<MainAlumno> listaAlumnos = new ArrayList<MainAlumno>();
        List<Integer> calificaciones = new ArrayList<Integer>();
        MainAlumno alumno1=new MainAlumno("Maria","Lopez","Alvarez",24);
        int a= 9;
        int b= 10;
        int c= 7;
        
        alumno1.setCalif1(a);
        alumno1.setCalif2(b);
        alumno1.setCalif3(c);
        
        //listaAlumnos.add(new MainAlumno("Maria","Lopez","Alvarez",24));
        
        
        
        
    }
    
}
