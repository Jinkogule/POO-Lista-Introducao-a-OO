public class Produto {
    int estoque;
    double preço;

    public void definePreço(double reais){
        preço = reais;
    }
    public void quantidadeEmEstoque(int quantidade){
        estoque = quantidade;
    }

    public String toString(){
        String status_produto = "Quantidade em estoque: "+estoque+".\nPreço do produto: "+preço+".";
        return status_produto;
    }
}
