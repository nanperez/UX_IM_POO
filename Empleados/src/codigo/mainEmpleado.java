/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author nancy
 */
public class mainEmpleado {
    public static void main(String[] args) {
        List<Empleado> lista = new ArrayList<Empleado>();
        
        Empleado empleado1=new Empleado();
        Empleado empleado2=new Empleado();
        Empleado empleado3=new Empleado();
       
        empleado1.setNombre("Ramon");
        empleado1.setEdad(30);
        empleado1.setDomicilio("Galerías 104, Versalles 1era sec.");
 
        empleado2.setNombre("Toño");
        empleado2.setEdad(28);
        empleado2.setDomicilio("Ojo de Agua 101, Ojo Caliente X.");
       
        empleado3.setNombre("Aramíz");
        empleado3.setEdad(30);
        empleado3.setDomicilio("Cosio 203, Zona Centro");
       
        lista.add(empleado1);//los metemos a la lista
        lista.add(empleado2);
        lista.add(empleado3);
        
        
        for (int i = 0; i<lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        
        System.out.println("Lista ordenada por edad");
        Collections.sort(lista);
        
         for (int i = 0; i<lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        
    }
    
}
