public class Ex8_main {
    public static void main(String[] args) {

        System.out.println("Samsung:");
        Celular samsung = new Celular();
        samsung.capacidadeDeCarga(500);
        samsung.enviaMensagemDeTexto();
        samsung.enviaMensagemDeTexto();
        samsung.enviaMensagemDeTexto();
        samsung.enviaMensagemDeTexto();
        samsung.enviaMensagemDeTexto();
        samsung.chamada(80);
        samsung.nivelDeCarga();

        System.out.println("\nIphone:");
        Celular iphone = new Celular();
        samsung.capacidadeDeCarga(100);
        samsung.enviaMensagemDeTexto();
        samsung.enviaMensagemDeTexto();
        samsung.chamada(65);
        samsung.nivelDeCarga();
    }
}
