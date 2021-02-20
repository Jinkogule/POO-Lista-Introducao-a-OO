public class Celular {
    int capacidadeBateria;
    int nivelBateria;

    public void capacidadeDeCarga(int u){
        capacidadeBateria = u;
        nivelBateria = u;
    }

    public void enviaMensagemDeTexto(){
        nivelBateria-=1;
    }

    public void chamada(int segundos){
        nivelBateria-=segundos/5;
    }

    public void nivelDeCarga(){
        System.out.println("Nível de carga: "+(float)nivelBateria/capacidadeBateria*100+"%.");
    }
}
