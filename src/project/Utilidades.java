/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author joaod
 */
public class Utilidades{
    public void utilidade(JFrame frame){
    //Tira as bordas da janela
    frame.setUndecorated(true);
    //defini o fundo como transparente, mas esse metodo só é possivel sem as bordas da janela
    frame.setBackground(new Color(0,0,0,0));
    //tira o foco da janela
    frame.setFocusableWindowState(false);
    frame.setFocusCycleRoot(false);
    //tira o foco principal
    frame.setFocusable(false);
    }
}
