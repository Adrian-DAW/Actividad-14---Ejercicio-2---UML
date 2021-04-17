/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2proyectojava;

/**
 *
 * @author Adrian Santana
 */
public class Actividad2ProyectoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float x = (float)(Math.random() * 10) + 1;
        float y = (float)(Math.random() * 10) + 1;
        float Altura = (float)(Math.random() * 10) + 1;
        float radio = (float)(Math.random() * 10) + 1;
        String Color = "Azul";
        
        
        Cono cono1 = new Cono(Altura,Color,radio,x,y);
        
        cono1.imprimir();
        
        
   
        
        
        
        
        
    }
    
}
