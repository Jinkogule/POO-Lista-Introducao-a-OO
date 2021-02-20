public class Ex7_main {
    public static void main(String[] args) {

        Produto corote = new Produto();
        corote.definePreço(4.99);
        corote.quantidadeEmEstoque(20);
        System.out.println("Status do corote inicialmente:");
        System.out.println(corote);

        System.out.print("\n");
        Cliente clientebebado = new Cliente();

        clientebebado.addCarteira("cartão", 30);
        clientebebado.addCarteira("dinheiro", 120);

        System.out.println("\nStatus do cliente bebado antes dos pedidos:");
        System.out.println(clientebebado);

        clientebebado.pedido(5, corote, "cartão");
        clientebebado.pedido(2, corote, "cartão");
        clientebebado.pedido(2, corote, "dinheiro");

        System.out.println("\nStatus do cliente bebado depois dos pedidos:");
        System.out.println(clientebebado);

        System.out.println("\nStatus do corote após os pedidos:");
        System.out.println(corote);

        Produto vinho = new Produto();
        vinho.definePreço(10);
        vinho.quantidadeEmEstoque(2);

        System.out.println("\nStatus do vinho inicialmente:");
        System.out.println(vinho);
        clientebebado.pedido(3, vinho, "dinheiro");

        System.out.println("\nStatus do vinho após falha no pedido:");
        System.out.println(vinho);
    }
}
