import java.util.ArrayList;

public class Agenda{
    ArrayList<String> contatos = new ArrayList();

    public void addContato(Contato cont){
        String contatotelef = cont.nome+": "+cont.telefone;
        contatos.add(contatotelef);
    }
    public void imprimeAgenda(){
        System.out.println(contatos);
    }
}