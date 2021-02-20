import java.util.ArrayList;

public class Porta {
    boolean status_porta = false;
    ArrayList<String> coresPorta = new ArrayList();
    int largura;
    int altura;

    public void abrePorta(){
        status_porta = true;
    }
    public void fechaPorta(){
        status_porta = false;
    }
    public void pintaPorta(String cor){
        coresPorta.add(cor);
    }

    public boolean estaAberta(){
        if (status_porta == false){
            System.out.println("A porta está fechada.");
            return false;
        }
        else{
            System.out.println("A porta está aberta.");
            return true;
        }
    }
    public void imprimeCoresPorta(){
        System.out.print("Cores da porta: ");
        System.out.println(coresPorta);
    }
    public void imprimeDimensoesPorta(){
        System.out.println("Dimensões da porta:");
        System.out.println("Altura: "+altura+"cm");
        System.out.println("Largura: "+largura+"cm");
        System.out.println("Área: "+altura*largura+"cm²");
    }
}
