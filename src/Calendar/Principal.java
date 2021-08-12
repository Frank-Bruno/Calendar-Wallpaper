//comente
package Calendar;

// Classe principal do projeto
public class Principal{
    
    public static void main(String args[]) {
       //instancia a classe resolução
       resolucao r = new resolucao();
       //instancia a classe Semana
       Semana Semana = new Semana();
       /* usando o comando getLar é usado a largura da tela que a classe semana calculou 
       menos a largura do jframe da classe semana*/
       int x = r.getLar() - Semana.getWidth();
       int y = 1;
       // seta a localização do jframe da classe semana
       Semana.setLocation(x, y);
       // torna o jframe da classe semana visivel
       Semana.setVisible(true);
 
         


        
        
       

            
      
    
    }
}
