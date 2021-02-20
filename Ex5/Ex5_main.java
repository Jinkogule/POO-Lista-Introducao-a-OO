public class Ex5_main {
    public static void main(String[] args) {
        Televisao tvtrambolho = new Televisao();

        tvtrambolho.ligaTelevisao();
        tvtrambolho.mudaCanal(96);
        tvtrambolho.proximoCanal();
        tvtrambolho.proximoCanal();
        tvtrambolho.proximoCanal();

        tvtrambolho.mudaCanal(3);
        tvtrambolho.anteriorCanal();
        tvtrambolho.anteriorCanal();
        tvtrambolho.anteriorCanal();

        tvtrambolho.aumentaVolume();
        tvtrambolho.aumentaVolume();
        tvtrambolho.aumentaVolume();
        tvtrambolho.aumentaVolume();
        tvtrambolho.aumentaVolume();
        tvtrambolho.ativaSilenciar();
        tvtrambolho.diminuiVolume();
        tvtrambolho.desativaSilenciar();
        tvtrambolho.desligaTelevisao();

        tvtrambolho.estadoTV();
    }
}
