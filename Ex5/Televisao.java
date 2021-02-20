public class Televisao {
    boolean estado = false;
    boolean silenciar = false;
    int num_volume = 0;
    int num_canal = 0;

    public void ligaTelevisao(){
        estado = true;
        System.out.println("TV ligada.");
        num_volume = 5;
        num_canal = 1;
        System.out.println("Canal inicial padrão: "+num_canal+".");
        System.out.println("Volume inicial padrão: "+num_volume+".");
    }
    public void desligaTelevisao(){
        estado = false;
        System.out.println("TV desligada.");
        num_volume = 0;
        num_canal = 0;
    }

    public void ativaSilenciar(){
        silenciar = true;
        System.out.println("Modo silencioso ativado.");
        num_volume = -1;
    }
    public void desativaSilenciar(){
        silenciar = false;
        System.out.println("Modo silencioso desativado.");
        num_volume = 5;
    }

    public void mudaCanal(int canal){
        if (num_canal == 0){
            System.out.println("Não há como mudar o canal com a TV desligada.");
        }
        else{
            if (canal>0 && canal<99){
                num_canal = canal;
                System.out.println("Televisionando canal "+num_canal+".");
            }
            else{
                System.out.println("Canal inexistente.");
            }
        }
    }
    public void proximoCanal(){
        if (num_canal == 0){
            System.out.println("Não há como mudar o canal com a TV desligada.");
        }
        else{
            if (num_canal != 98){
                num_canal+=1;
                System.out.println("Televisionando canal "+num_canal+".");
            }
            else{
                System.out.println("Canal inexistente.");
            }
        }
    }
    public void anteriorCanal(){
        if (num_canal == 0){
            System.out.println("Não há como mudar o canal com a TV desligada.");
        }
        else{
            if (num_canal != 1){
                num_canal-=1;
                System.out.println("Televisionando canal "+num_canal+".");
            }
            else{
                System.out.println("Canal inexistente.");
            }
        }
    }

    public void aumentaVolume(){
        if (silenciar == true){
            System.out.println("Não é possível alterar o volume pois a televisão está em modo silencioso.");
        }
        else{
            if (num_volume == 0){
                System.out.println("Não há como alterar o volume com a TV desligada.");
            }
            else{
                if (num_volume != 9){
                    num_volume+=1;
                    System.out.println("Volume: "+num_volume+".");
                }
                else{
                    System.out.println("Não foi possível aumentar o volume pois ele já está no máximo.");
                }
            }
        }
    }
    public void diminuiVolume(){
        if (silenciar == true){
            System.out.println("Não é possível alterar o volume pois a televisão está em modo silencioso.");
        }
        else{
            if (num_volume == 0){
                System.out.println("Não há como alterar o volume com a TV desligada.");
            }
            else{
                if (num_volume != 1){
                    num_volume-=1;
                    System.out.println("Volume: "+num_volume+".");
                }
                else{
                    System.out.println("Não foi possível diminuir o volume pois ele já está no mínimo.");
                }
            }
        }
    }
    public void estadoTV(){
        if (estado == false){
            System.out.println("Estado da TV: desligada.");
        }
        else{
            System.out.println("Estado da TV: ligada.");
        }
    }
}
