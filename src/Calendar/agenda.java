
package Calendar;

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
