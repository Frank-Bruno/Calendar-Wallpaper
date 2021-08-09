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
    frame.setUndecorated(true);
    frame.setBackground(new Color(0,0,0,0));
    frame.setFocusableWindowState(false);
    frame.setFocusCycleRoot(false);
    frame.setFocusable(false);
    }
}
