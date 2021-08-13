
package Calendar;

public class agenda {
    java.util.ArrayList<String> agenda = new java.util.ArrayList();
    public agenda(){
    
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
