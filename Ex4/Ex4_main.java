public class Ex4_main {
    public static void main(String[] args) {

        Casa minhacasa = new Casa();
        minhacasa.pintaCasa("laranja");
        minhacasa.pintaCasa("branco");

        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        porta1.abrePorta();
        porta2.abrePorta();
        porta3.fechaPorta();

        minhacasa.addPorta(porta1);
        minhacasa.addPorta(porta2);
        minhacasa.addPorta(porta3);

        minhacasa.imprimeCoresCasa();
        minhacasa.quantasPortasEstaoAbertas();
    }
}
