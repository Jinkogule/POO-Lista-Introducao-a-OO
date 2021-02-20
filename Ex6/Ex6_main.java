public class Ex6_main {
    public static void main(String[] args) {

        Cartas carta1 = new Cartas(2, "Espadas");
        System.out.println("Exemplo de carta: "+carta1);

        Baralho baralho1 = new Baralho();
        System.out.println("\nExemplo de baralho ainda não embaralhado:\n"+baralho1);

        System.out.println("Primeiras três cartas do topo ordenado");
        System.out.println(baralho1.sacaCarta());
        System.out.println(baralho1.sacaCarta());
        System.out.println(baralho1.sacaCarta());

        baralho1.embaralhaCartas();
        System.out.println("\nExemplo de baralho após ser embaralhado:");
        System.out.println(baralho1);

        System.out.println("Primeiras três cartas do topo embaralhado:");
        System.out.println(baralho1.sacaCarta());
        System.out.println(baralho1.sacaCarta());
        System.out.println(baralho1.sacaCarta());


    }
}
