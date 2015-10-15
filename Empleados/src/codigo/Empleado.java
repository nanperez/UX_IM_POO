/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author nancy
 */
public class Empleado implements Comparable<Empleado>{
    
    private String nombre;
    private int edad;
    private String domicilio;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", domicilio=" + domicilio + '}';
    }
    
    

    @Override
    public int compareTo(Empleado o) {
        if(this.edad < o.getEdad()){
            return -1;
        }else{
            return 1;
        }
        
    }
    
   
    
    
}
