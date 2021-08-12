/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class agenda {
    private int i;
    private int n;
    private String t;
    private Date d;
    
  public agenda (int i, int n, String t, Date d){
        this.i = i;
        this.n = n;
        this.t = t;
        this.d = d;
    }
  public void ag1() {
    

    // [ A ] declarando e instanciando uma agenda de contatos
    ArrayList<String> agenda = new ArrayList();

    // [ B ] usando o método add() para gravar 4 contatos na agenda
    agenda.add("Juca Bala;11 1111-1111");
    agenda.add("Marcos Paqueta;22 2222-2222");
    agenda.add("Maria Antonieta;33 3333-3333");
    agenda.add("Antônio Conselheiro;44 4444-4444");


    // [ C ] mostrando os "n" contatos da agenda (usando o índice)
    // número de elementos da agenda: método size()
    System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
    n = agenda.size();
    for (i=0; i<n; i++) {
      System.out.printf("Posição %d- %s\n", i, agenda.get(i));
    }

    

    try {
      // [ D ] remove o i-ésimo contato da agenda
      agenda.remove(i);
    } catch (IndexOutOfBoundsException e) {
        // exceção lançada para indicar que um índice (i)
        // está fora do intervalo válido (de 0 até agenda.size()-1)
        System.out.printf("\nErro: posição inválida (%s).",
          e.getMessage());
    }

    // [ E ] mostrando os "n" contatos da agenda (usando for-each)
    System.out.printf("\nPercorrendo o ArrayList (usando for-each)\n");
    i = 0;
    for (String contato: agenda) {
      System.out.printf("Posição %d- %s\n", i, contato);
      i++;
    }

    // [ F ] mostrando os "n" contatos da agenda (com iterator)
    System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
    i = 0;
    Iterator<String> iterator = agenda.iterator();
    while (iterator.hasNext()) {
      System.out.printf("Posição %d- %s\n", i, iterator.next());
      i++;
    }
  }

}
