public class Porta {
    boolean status_porta = false;

    public void abrePorta(){
        status_porta = true;
    }
    public void fechaPorta(){
        status_porta = false;
    }
    public boolean estaAberta(){
        if (status_porta == false){
            return false;
        }
        else{
            return true;
        }
    }
}
