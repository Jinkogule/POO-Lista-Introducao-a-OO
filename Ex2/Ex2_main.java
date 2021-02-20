public class Ex2_main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Martinelli";
        pessoa1.idade = 19;
        System.out.println("Inicialmente:\n"+pessoa1);

        pessoa1.aniversario();
        pessoa1.aniversario();
        pessoa1.aniversario();
        pessoa1.aniversario();
        pessoa1.aniversario();
        pessoa1.aniversario();

        System.out.println("\nApós aniversários:\n"+pessoa1);

    }
}
