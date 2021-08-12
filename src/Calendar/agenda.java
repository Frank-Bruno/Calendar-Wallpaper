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
public class agenda {
    java.util.ArrayList<String> agenda = new java.util.ArrayList();
    public agenda(){
    agenda.add("Juca Bala;11 1111-1111");
    agenda.add("Marcos Paqueta;22 2222-2222");
    agenda.add("Maria Antonieta;33 3333-3333");
    agenda.add("Antônio Conselheiro;44 4444-4444");
    }
    public void adicionar(String texto){
        agenda.add(texto);
    }
    public void remover(int i){
        agenda.remove(i);
    }
    public int tamanho(){
        return agenda.size();
    }
    public String texto1(int j){
        return agenda.get(j);
    }
}
