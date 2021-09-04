//comente
package Calendar;

import DatabaseConnection.Conexao;
// Classe principal do projeto
public class Principal{
    public static Mes mes;
    public static Semana semana;
    public static Dia_principal Dia_principal;
    public static agenda agenda;
    //public static dia_hoje dia_hoje;
    
    public static void main(String args[]) {
       
       //instacia a classe Mes
       mes = new Mes();
       //cria a agenda
       agenda = new agenda();
       //instancia a classe resolução
       resolucao r = new resolucao();
       //criar o dia de hoje
       //dia_hoje = new dia_hoje(); 
       //instacia a classe Dia_principal
       Dia_principal = new Dia_principal();
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
