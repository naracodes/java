package br.com.ada.polotech.livraria.modelos;

public class Filme extends Produto {
    private String estudio, diretores, produtores, generos;

    public static int quantidadeDeFilmes = 0;

    public Filme(String nomeDoProduto, Double precoDoProduto, String estudio, String diretores, String generos, String produtores) {
        super(nomeDoProduto, precoDoProduto);
        this.estudio = estudio;
        this.diretores = diretores;
        this.generos = generos;
        this.produtores = produtores;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getDiretores() {
        return diretores;
    }

    public void setDiretores(String diretores) {
        this.diretores = diretores;
    }

    public String getProdutores() {
        return produtores;
    }

    public void setProdutores(String produtores) {
        this.produtores = produtores;
    }

    public String getGeneros() {
        return generos;
    }

    public void setGeneros(String generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return "Filme{" +
                super.toString() +
                " estudio: '" + estudio + '\'' +
                ", diretores: '" + diretores + '\'' +
                ", produtores: '" + produtores + '\'' +
                ", generos: '" + generos + '\'' +
                '}';
    }
}
