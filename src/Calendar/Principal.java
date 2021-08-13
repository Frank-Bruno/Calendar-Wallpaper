//comente
package Calendar;

// Classe principal do projeto
public class Principal{
    public static Semana semana;
    public static void main(String args[]) {
       
       //instancia a classe resolução
       resolucao r = new resolucao();
       //instancia a classe Semana
       semana = new Semana();
       /* usando o comando getLar é usado a largura da tela que a classe semana calculou 
       menos a largura do jframe da classe semana*/
       int x = r.getLar() - semana.getWidth();
       int y = 1;
       // seta a localização do jframe da classe semana
       semana.setLocation(x, y);
       // torna o jframe da classe semana visivel
       semana.setVisible(true);
 
         


        
        
       

            
      
    
    }

   

    
}
