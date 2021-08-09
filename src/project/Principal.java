/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;



/**
 *
 * @author joaod
 */
public class Principal{
    
    public static void main(String args[]) {
       resolucao r = new resolucao();
       Semana Semana = new Semana();
       int x = r.getLar() - Semana.getWidth();
       int y = 1;
       Semana.setLocation(x, y);
       Semana.setVisible(true);
 
         


        
        
       

            
      
    
    }
}
