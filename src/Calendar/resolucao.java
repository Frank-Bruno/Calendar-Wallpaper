package Calendar;

import java.awt.Dimension;
import java.awt.Toolkit;

public class resolucao {
private int lar;
private int alt;
    public resolucao() {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        lar = (int) tela.getWidth();
        alt = (int) tela.getHeight();
    }  
    public int getLar(){
        return lar;
    }
}