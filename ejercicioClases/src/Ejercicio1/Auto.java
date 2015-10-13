package Ejercicio1;

public class Auto {

	private String modelo;
	private int año;
	private String color;
        
       public Auto(int año,String modelo, String color){
           this.modelo = modelo;
           this.año = año;
           this.color = color;
       } 

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }
    
    

    @Override
    public String toString() {
        return "Auto{" + "modelo=" + this.modelo + ", a\u00f1o=" + año + ", color=" + color + '}';
    }
       
       
    

	

}