/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calendar;

/**
 *
 * @author joaod
 */
public class atualizar_Jframe {
    public void atualizar(){
        Principal.semana.dispose();
        Principal.semana = new Semana();
        Principal.semana.setVisible(true);
        Principal.Dia_principal.dispose();
        Principal.Dia_principal = new Dia_principal();
    }
    
}
