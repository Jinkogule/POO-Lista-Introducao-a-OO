public class Cliente {
    String modoDePagamento;
    float orçamentoEmDinheiro;
    float orçamentoEmCartão;
    float orçamentoEmCheque;

    public void pedido(int quantidade, Produto produto, String modo_de_pagamento){
        if (quantidade>produto.estoque){
            System.out.println("Não há quantidade do produto em estoque suficiente para realizar esse pedido.");
        }
        else{
            produto.estoque-=quantidade;
            modoDePagamento = modo_de_pagamento;
            if (modoDePagamento == "dinheiro"){
                if (produto.preço*quantidade>orçamentoEmDinheiro){
                    System.out.println("Não há valor suficiente para pagar esse pedido em dinheiro.");
                }
                else{
                    orçamentoEmDinheiro -= produto.preço*quantidade;
                    System.out.println("Pedido realizado e pago com sucesso.");
                    System.out.println("Valor em dinheiro restante: "+orçamentoEmDinheiro+" reais.");
                }
            }
            else if (modoDePagamento == "cartão"){
                if (produto.preço*quantidade>orçamentoEmCartão){
                    System.out.println("Não há valor suficiente para pagar esse pedido em cartão.");
                }
                else{
                    orçamentoEmCartão -= produto.preço*quantidade;
                    System.out.println("Pedido realizado e pago com sucesso.");
                    System.out.println("Valor em cartão restante: "+orçamentoEmCartão+" reais.");
                }
            }
            else if (modoDePagamento == "cheque") {
                if (produto.preço * quantidade > orçamentoEmDinheiro) {
                    System.out.println("Não há valor suficiente para pagar esse pedido em cheque.");
                } else {
                    orçamentoEmCheque -= produto.preço * quantidade;
                    System.out.println("Pedido realizado e pago com sucesso.");
                    System.out.println("Valor em cheque restante: " + orçamentoEmCheque + " reais.");
                }
            }
            else{
                System.out.println("Modo de pagamento inválido.");
            }
        }
    }

    public void addCarteira(String tipo, float valor){
        modoDePagamento = tipo;
        if (modoDePagamento == "dinheiro"){
            orçamentoEmDinheiro = valor;
        }
        else if (modoDePagamento == "cartão"){
            orçamentoEmCartão = valor;
        }
        else if (modoDePagamento == "cheque"){
            orçamentoEmCheque = valor;
        }
        else{
            System.out.println("Opção de carteira inválida.");
        }
    }
    public String toString(){
        String status_cliente = "Orçamento em dinheiro: "+orçamentoEmDinheiro+".\nOrçamento em cartão: "+orçamentoEmCartão+".\nOrçamento em cheque: "+orçamentoEmCheque+".";
        return status_cliente;
    }
}
