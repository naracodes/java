package br.com.ada.polotech.livraria.modelos;

public class Brinquedo extends Produto {
    private String tipo;

    private int quantidadeDeBrinquedos = 0;

    public int getQuantidadeDeBrinquedos() {
        return quantidadeDeBrinquedos;
    }

    public void setQuantidadeDeBrinquedos(int quantidadeDeBrinquedos) {
        this.quantidadeDeBrinquedos = quantidadeDeBrinquedos;
    }

    public Brinquedo(String nomeDoProduto, Double precoDoProduto, String tipo) {
        super(nomeDoProduto, precoDoProduto);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Brinquedo{" +
                super.toString() +
                " tipo: '" + tipo + '\'' +
                '}';
    }
}
