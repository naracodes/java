package br.com.ada.polotech.livraria.modelos;

import java.util.Scanner;

public abstract class Produto {
    private String nomeDoProduto;
    private Integer idDoProduto, quantidade;
    private Double precoDoProduto;

    public static int quantidadeDeProdutosEmEstoque = 0;

    public static int getQuantidadeDeProdutosEmEstoque() {
        return quantidadeDeProdutosEmEstoque;
    }

    public Produto(String nomeDoProduto, Double precoDoProduto){
        this.nomeDoProduto = nomeDoProduto;
        this.precoDoProduto = precoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public Integer getIdDoProduto() {
        return idDoProduto;
    }

    public void setIdDoProduto(Integer idDoProduto) {
        this.idDoProduto = idDoProduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "ID: " + idDoProduto +
                ", Nome: '" + nomeDoProduto + '\'' +
                ", Preço: " + precoDoProduto +
                ", Quantidade: " + quantidade +
                ',';
    }
}
