public class Ex3_main {
    public static void main(String[] args) {

        Porta porta1 = new Porta();

        porta1.abrePorta();
        porta1.fechaPorta();
        porta1.abrePorta();

        porta1.estaAberta();

        porta1.pintaPorta("vermelho");
        porta1.pintaPorta("verde");
        porta1.pintaPorta("amarelo");

        porta1.imprimeCoresPorta();

        porta1.altura = 210;
        porta1.largura = 90;

        porta1.imprimeDimensoesPorta();
    }
}
