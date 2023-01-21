package br.com.ada.polotech.livraria.modelos;

public class Caixa extends Produto {
    private String dinheiroCaixa;

    public String getDinheiroCaixa() {
        return dinheiroCaixa;
    }

    public Caixa(String nomeDoProduto, Double precoDoProduto, String dinheiroCaixa) {
        super(nomeDoProduto, precoDoProduto);
        this.dinheiroCaixa = dinheiroCaixa;
    }

    public void setDinheiroCaixa(String dinheiroCaixa) {
        this.dinheiroCaixa = dinheiroCaixa;
    }
}
