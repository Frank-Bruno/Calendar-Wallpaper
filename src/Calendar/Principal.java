//comente
package Calendar;

import DatabaseConnection.Conexao;
// Classe principal do projeto
public class Principal{
    public static Semana semana;
    public static void main(String args[]) {
       //instanciando a conexao
       Conexao Conexao = new Conexao();
       //conctando ao banco de dados
       Conexao.Conectar();
       //instancia a classe resolução
       resolucao r = new resolucao();
       //instacia a classe Mes
       Mes Mes = new Mes();
       //instacia a classe Dia_principal
       Dia_principal Dia_principal = new Dia_principal();
       //instancia a classe Semana
       semana = new Semana();
       Ano Ano = new Ano();
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
