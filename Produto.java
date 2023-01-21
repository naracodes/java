package br.com.ada.polotech.livraria.modelos;

import java.util.Scanner;

public abstract class Produto {
    private String nomeDoProduto;
    public static Integer contador = 0;
    private Integer idDoProduto;
    private Double precoDoProduto;

    private Integer quantidade;

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public static int quantidadeDeProdutosEmEstoque = 0;

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

    public Integer getIdDoProduto() {
        return idDoProduto;
    }

    public void setIdDoProduto(Integer idDoProduto) {
        this.idDoProduto = idDoProduto;
    }

    Scanner scanner = new Scanner(System.in);


    public void adicionar(){
        System.out.println("Adicionei");
    }
    public void ver(){
        System.out.println("Vi");
    }
    public void alterar(){
        System.out.println("Alterei");
    }
    public void remover(){
        System.out.println("Removi");
    }

    @Override
    public String toString() {
        return "ID: " + idDoProduto +
                ", Nome: '" + nomeDoProduto + '\'' +
                ", Preço: " + precoDoProduto +
                ", Quantidade: " + quantidade +
                ',';
    }
}
