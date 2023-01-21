package br.com.ada.polotech.livraria.modelos;

public class AlbunsDeMusica extends Produto {
    private String musicosBandas, selos, genero;

    private int quantidadeDeAlbuns = 0;

    public int getQuantidadeDeAlbuns() {
        return quantidadeDeAlbuns;
    }

    public void setQuantidadeDeAlbuns(int quantidadeDeAlbuns) {
        this.quantidadeDeAlbuns = quantidadeDeAlbuns;
    }

    public AlbunsDeMusica(String nomeDoProduto, Double precoDoProduto, String musicosBandas, String selos, String genero) {
        super(nomeDoProduto, precoDoProduto);
        this.musicosBandas = musicosBandas;
        this.selos = selos;
        this.genero = genero;
    }

    public String getMusicosBandas() {
        return musicosBandas;
    }

    public void setMusicosBandas(String musicosBandas) {
        this.musicosBandas = musicosBandas;
    }

    public String getSelos() {
        return selos;
    }

    public void setSelos(String selos) {
        this.selos = selos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "AlbunsDeMusica{" +
                super.toString() +
                " musicosBandas: '" + musicosBandas + '\'' +
                ", selos: '" + selos + '\'' +
                ", genero: '" + genero + '\'' +
                '}';
    }
}
