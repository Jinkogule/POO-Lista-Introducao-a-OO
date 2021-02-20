public class Ex1_main {
    public static void main(String[] args) {

        Contato contato1 = new Contato();
        contato1.nome = "Lucas";
        contato1.telefone = "97777-8765";

        Contato contato2 = new Contato();
        contato2.nome = "Laura";
        contato2.telefone = "99999-8888";

        Contato contato3 = new Contato();
        contato3.nome = "Lagarto";
        contato3.telefone = "92333-4433";

        Agenda agendaL = new Agenda();
        agendaL.addContato(contato1);
        agendaL.addContato(contato2);
        agendaL.addContato(contato3);

        System.out.println("Contatos com a inicial L:");
        agendaL.imprimeAgenda();
    }
}
