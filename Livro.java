package br.com.ada.polotech.livraria.modelos;

public class Livro extends Produto {
    private String escritor, editora;

    public static int quantidadeDeLivros = 0;

    public Livro(String nomeDoProduto, Double precoDoProduto, String escritor, String editora) {
        super(nomeDoProduto, precoDoProduto);
        this.escritor = escritor;
        this.editora = editora;package br.com.ada.polotech.livraria.modelos;

public class Livro extends Produto {
    private String escritor, editora;

    private int quantidadeDeLivros = 0;

    public int getQuantidadeDeLivros() {
        return quantidadeDeLivros;
    }

    public void setQuantidadeDeLivros(int quantidadeDeLivros) {
        this.quantidadeDeLivros = quantidadeDeLivros;
    }

    public Livro(String nomeDoProduto, Double precoDoProduto, String escritor, String editora) {
        super(nomeDoProduto, precoDoProduto);
        this.escritor = escritor;
        this.editora = editora;
    }
    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                super.toString() +
                " escritor: '" + escritor + '\'' +
                ", editora: '" + editora + '\'' +
                '}';
    }
}

    }
    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                super.toString() +
                " escritor: '" + escritor + '\'' +
                ", editora: '" + editora + '\'' +
                '}';
    }
}
