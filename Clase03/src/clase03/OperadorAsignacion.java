/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03;

/**
 *
 * @author nancy
 */
public class OperadorAsignacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 2, var2 = 5;
        // Se asigna la operación a la primera variable
        
        System.out.println("Suma "+(var1+=var2)); // La suma de var1 y var2 se asigna a var1
        System.out.println("Resta "+(var1-=var2)); // La resta de var1 menos var2 se asigna a var1
        System.out.println("Multiplicación "+(var1*=var2)); //La multiplicacion de var1 y var2 se asigna a var1
        System.out.println("División "+(var1/=var2));// La división entre var1 y var 2 se asigna a var1
        System.out.println("Modulo "+(var1%=var2)); // El modulo de var1 y var2 se asigna a var1
    }
    
}
