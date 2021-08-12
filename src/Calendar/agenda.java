package Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Date;

public class agenda {
    //Variavel de controle
    private int i;
    //Variavel para saber quantos adicionar
    private final int n;
    //Variavel para adicionar a tarefa
    private final String t;
    //Variavel para definir a posição da lista de saida
    private int s;
    //Variavel de saída
    private String sa;
    //setando as variaveis
  public agenda (int n, String t){
        
        this.n = n;
        this.t = t;
    }
  //retorno das variaveis
  public String ag2(int s){
      return sa;
  }
  //função sem retorno
  public void ag1() {
   
    ArrayList<String> agenda = new ArrayList();

    for (i=0; i<n; i++) {
        agenda.add(t);
    }
    sa = agenda.get(s);
  }
  
}
