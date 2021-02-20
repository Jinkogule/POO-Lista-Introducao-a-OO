public class Pessoa {
    String nome;
    int idade;

    public void aniversario(){
        idade+=1;
    }
    public String toString(){
        String status_pessoa = "Nome: "+nome+"\nIdade: "+idade;
        return status_pessoa;
    }
}
