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
public class MainAlumno implements Alumno{
    
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    
    private int calif1;
    private int calif2;
    private int calif3;

    public MainAlumno(String nombre, String apellidoP, String apellidoM, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
    }

    public int getCalif1() {
        return calif1;
    }

    public int getCalif2() {
        return calif2;
    }

    public int getCalif3() {
        return calif3;
    }

    public void setCalif1(int calif1) {
        this.calif1 = calif1;
    }

    public void setCalif2(int calif2) {
        this.calif2 = calif2;
    }

    public void setCalif3(int calif3) {
        this.calif3 = calif3;
    }
    
    
    
    
    
    

    @Override
    public void datosAlumno(String nombre, String apellidoP, String apellidoM, int edad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int calificacion(int a, int b, int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
