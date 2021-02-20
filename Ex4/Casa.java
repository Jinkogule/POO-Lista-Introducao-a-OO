import java.util.ArrayList;

public class Casa {
    ArrayList<String> coresCasa = new ArrayList();
    ArrayList<Porta> portasCasa = new ArrayList();

    public void addPorta(Porta porta){
        portasCasa.add(porta);
    }

    public void pintaCasa(String cor){
        coresCasa.add(cor);
    }
    public void imprimeCoresCasa(){
        System.out.print("Cores da casa: ");
        System.out.println(coresCasa);
    }

    public void quantasPortasEstaoAbertas(){
        int abertas = 0;
        for (int i=0; i<portasCasa.size(); i++){
            if (portasCasa.get(i).estaAberta()){
                abertas+=1;
            }
        }
        System.out.println("Portas da casa abertas: "+abertas);
    }

}
