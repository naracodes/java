package br.com.ada.polotech.livraria.main;

import br.com.ada.polotech.livraria.modelos.*;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Livraria {
    private Double valorCaixa = 0.00;

    List<Livro> listaLivros = new ArrayList<>();
    List<Jogo> listaJogos = new ArrayList<>();
    List<Filme> listaFilmes = new ArrayList<>();
    List<AlbunsDeMusica> listaAlbuns = new ArrayList<>();
    List<Brinquedo> listaBrinquedos = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    Integer opcao;

    public Double getValorCaixa() {
        return valorCaixa;
    }

    public void listarTipoProduto(){
        System.out.println("------------------------------------------");
        System.out.println("| Tipos de Produtos:                     |");
        System.out.println("------------------------------------------");
        System.out.println("| 1- Livros                              |");
        System.out.println("| 2- Jogos                               |");
        System.out.println("| 3- Filmes                              |");
        System.out.println("| 4- Albuns de musicas                   |");
        System.out.println("| 5- Brinquedos                          |");
        System.out.println("------------------------------------------");
    }

    public void listarOpcoesDeMovimentacoesDoEstoque(){
        System.out.println("------------------------------------------");
        System.out.println("| Estoque de Produtos |");
        System.out.println("------------------------------------------");
        System.out.println("| 1- Remover Produto ok                   |");
        System.out.println("| 2- Ver Produtos por Categoria ok        |");
        System.out.println("| 3- Ver Todos os Produtos ok             |");
        System.out.println("------------------------------------------");
    }
    public void cadastrar(){
        listarTipoProduto();
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();
        System.out.println("Digite o tipo de produto que deseja cadastrar: ");
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Nome do Livro: ");
                String nomeLivro = scanner.nextLine();

                System.out.println("Preço: ");
                Double precoLivro = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Escritor: ");
                String escritorLivro = scanner.nextLine();

                System.out.println("Editora: ");
                String editoraLivro = scanner.nextLine();

                Livro livro = new Livro(nomeLivro, precoLivro, escritorLivro, editoraLivro);
                Random numeroAleatorio = new Random();
                Integer idAleatorio = numeroAleatorio.nextInt(1000);
                livro.setIdDoProduto(idAleatorio);
                livro.setQuantidade(receberQuantidadeParaAdicionarNoEstoque());
                Integer qtdAdicionar = livro.getQuantidade();
                adicionarQuantidadeNoEstoqueProduto(qtdAdicionar);
                listaLivros.add(livro);
                break;
            case 2:
                System.out.println("Nome do Jogo: ");
                String nomeJogo = scanner.nextLine();

                System.out.println("Preco: ");
                Double precoJogo = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Distribuidora: ");
                String distribuidoraJogo = scanner.nextLine();

                System.out.println("Gênero: ");
                String generoJogo = scanner.nextLine();

                System.out.println("Estúdio: ");
                String estudioJogo = scanner.nextLine();

                Jogo jogo = new Jogo(nomeJogo, precoJogo, distribuidoraJogo, estudioJogo);
                Random numeroAleatorio2 = new Random();
                Integer idAleatorio2 = numeroAleatorio2.nextInt(1000);
                jogo.setIdDoProduto(idAleatorio2);
                jogo.setQuantidade(receberQuantidadeParaAdicionarNoEstoque());
                qtdAdicionar = jogo.getQuantidade();
                adicionarQuantidadeNoEstoqueProduto(qtdAdicionar);
                listaJogos.add(jogo);
                break;
            case 3:
                System.out.println("Nome do Filme: ");
                String nomeFilme = scanner.nextLine();

                System.out.println("Preço: ");
                Double precoFilme = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Estúdio: ");
                String estudioFilme = scanner.nextLine();

                System.out.println("Diretores: ");
                String diretoresFilme = scanner.nextLine();

                System.out.println("Gênero: ");
                String generoFilme = scanner.nextLine();

                System.out.println("Produtores: ");
                String produtoresFilme = scanner.nextLine();

                Filme filme = new Filme(nomeFilme, precoFilme, estudioFilme, diretoresFilme, generoFilme, produtoresFilme);
                Random numeroAleatorio3 = new Random();
                Integer idAleatorio3 = numeroAleatorio3.nextInt(1000);
                filme.setIdDoProduto(idAleatorio3);
                listaFilmes.add(filme);
                break;
            case 4:
                System.out.println("Nome do Albúm de Música: ");
                String nomeAlbum = scanner.nextLine();

                System.out.println("Preço: ");
                Double precoAlbum = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Musicos: ");
                String musicosAlbum = scanner.nextLine();

                System.out.println("Gênero: ");
                String generoAlbum = scanner.nextLine();

                System.out.println("Selos: ");
                String selosAlbum = scanner.nextLine();

                AlbunsDeMusica album = new AlbunsDeMusica(nomeAlbum, precoAlbum, musicosAlbum, generoAlbum, selosAlbum);
                Random numeroAleatorio4 = new Random();
                Integer idAleatorio4 = numeroAleatorio4.nextInt(1000);
                album.setIdDoProduto(idAleatorio4);
                listaAlbuns.add(album);
                break;
            case 5:
                System.out.println("Nome do Brinquedo: ");
                String nomeBrinquedo = scanner.nextLine();

                System.out.println("Preço: ");
                Double precoBrinquedo = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Tipo: ");
                String tipoBrinquedo = scanner.nextLine();

                Brinquedo brinquedo = new Brinquedo(nomeBrinquedo, precoBrinquedo, tipoBrinquedo);
                Random numeroAleatorio5 = new Random();
                Integer idAleatorio5 = numeroAleatorio5.nextInt(1000);
                brinquedo.setIdDoProduto(idAleatorio5);
                listaBrinquedos.add(brinquedo);
                break;
            default:
                System.out.println("Opção inválida");
        }

    }

    public void remover(){
        listarTipoProduto();
        System.out.println("Digite uma das opções: ");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Remover Livro");
                listarLivros();
                System.out.println("Digite o id do Livro que deseja remover: ");
                Integer id = scanner.nextInt();
                removerLivroId(listaLivros, id);
                break;
            case 2:
                System.out.println("Remover Jogo");
                listarJogos();
                System.out.println("Digite o id do Jogo que deseja remover: ");
                Integer id2 = scanner.nextInt();
                removerJogoId(listaJogos, id2);
                break;
            case 3:
                System.out.println("Remover Filme");
                listarFilmes();
                System.out.println("Digite o id do Filme que deseja remover: ");
                Integer id3 = scanner.nextInt();
                removerFilmeId(listaFilmes, id3);
                break;
            case 4:
                System.out.println("Remover Albun");
                listarAlbuns();
                System.out.println("Digite o id do Album que deseja remover: ");
                Integer id4 = scanner.nextInt();
                removerAlbumId(listaAlbuns, id4);
                break;
            case 5:
                System.out.println("Remover Brinquedo");
                listarBrinquedos();
                System.out.println("Digite o id do Brinquedo que deseja remover: ");
                Integer id5 = scanner.nextInt();
                removerBrinquedoId(listaBrinquedos, id5);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void alterar(){
        listarTipoProduto();
        System.out.println("Digite uma das opções: ");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Alterar Livro");
                listarLivros();
                System.out.println("Digite o id do Livro que deseja alterar: ");
                Integer id = scanner.nextInt();
                scanner.nextLine();
                alterarLivroId(listaLivros, id);
                break;
            case 2:
                System.out.println("Alterar Jogo");
                listarJogos();
                System.out.println("Digite o id do Jogo que deseja alterar: ");
                Integer id2 = scanner.nextInt();
                scanner.nextLine();
                alterarJogoId(listaJogos, id2);
                break;
            case 3:
                System.out.println("Alterar Filme");
                listarFilmes();
                System.out.println("Digite o id do Filme que deseja alterar: ");
                Integer id3 = scanner.nextInt();
                scanner.nextLine();
                alterarFilmeId(listaFilmes, id3);
                break;
            case 4:
                System.out.println("Alterar Album");
                listarAlbuns();
                System.out.println("Digite o id do Album que deseja alterar: ");
                Integer id4 = scanner.nextInt();
                scanner.nextLine();
                alterarAlbunsId(listaAlbuns, id4);
                break;
            case 5:
                System.out.println("Alterar Brinquedo");
                listarBrinquedos();
                System.out.println("Digite o id do Brinquedo que deseja alterar: ");
                Integer id5 = scanner.nextInt();
                scanner.nextLine();
                alterarBrinquedoId(listaBrinquedos, id5);
                break;
        }
    }

    public void movimentarEstoque (){
        Scanner scanner = new Scanner(System.in);
        Integer qtdAdicionar = 0;
        Integer quantidadeTotal = 0;

        listarOpcoesDeMovimentacoesDoEstoque();
        System.out.println("Digite uma das opções: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Remover Produto");
                remover();
                break;
            case 2:
                System.out.println("Ver Produtos por Categoria");
                listarTipoProduto();
                System.out.println("Digite uma das opções: ");
                opcao = scanner.nextInt();

                switch (opcao){
                    case 1:
                        listarLivros();
                        quantidadeTotal = listarQuantidadeDeProdutosLivro(listaLivros);
                        System.out.println("Quantidade de Livros = " + quantidadeTotal);
                        break;
                    case 2:
                        listarJogos();
                        quantidadeTotal = listarQuantidadeDeProdutosJogo(listaJogos);
                        System.out.println("Quantidade de Jogos = " + quantidadeTotal);
                        break;
                    case 3:
                        listarFilmes();
                        quantidadeTotal = listarQuantidadeDeProdutosFilme(listaFilmes);
                        System.out.println("Quantidade de Filmes = " + Filme.quantidadeDeFilmes);
                        break;
                    case 4:
                        listarAlbuns();
                        quantidadeTotal = listarQuantidadeDeProdutosAlbum(listaAlbuns);
                        System.out.println("Quantidade de Albuns = " + AlbunsDeMusica.quantidadeDeAlbuns);
                        break;
                    case 5:
                        listarBrinquedos();
                        quantidadeTotal = listarQuantidadeDeProdutosBrinquedo(listaBrinquedos);
                        System.out.println("Quantidade de Brinquedos = " + Brinquedo.quantidadeDeBrinquedos);
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                break;
            case 3:
                System.out.println("Lista de Todos os Produtos");
                listarLivros();
                listarJogos();
                listarAlbuns();
                listarFilmes();
                listarBrinquedos();
                System.out.println();
                System.out.println("Quantidade Total de Produtos: " + Produto.quantidadeDeProdutosEmEstoque);
                break;
            default:
                System.out.println("");
        }
    }
    public void listarProdutos(List<Produto> lista){
        listaLivros.stream().forEach(System.out::println);
    }

    public void listarLivros() {
        listaLivros.forEach(System.out::println);
    }

    public void listarJogos() {
        listaJogos.forEach(System.out::println);
    }

    public void listarFilmes() {
        listaFilmes.forEach((System.out::println));
    }

    public void listarBrinquedos() {
        listaBrinquedos.forEach(System.out::println);
    }

    public void listarAlbuns(){
        listaAlbuns.forEach(System.out::println);
    }

    public void adicionarQuantidadeNoEstoqueProduto(Integer quantidadeProdutos){
        Produto.quantidadeDeProdutosEmEstoque += quantidadeProdutos;
    }

    public void removerQuantidadeNoEstoqueProduto(Integer qtdRemover){
        Produto.quantidadeDeProdutosEmEstoque -= qtdRemover;
    }

    public Integer receberQuantidadeParaAdicionarNoEstoque(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite o id: ");
        //Integer idDigitado = scanner.nextInt();
        System.out.println("Quantidade: ");
        Integer qtdAdicionar = scanner.nextInt();
        return qtdAdicionar;
    }

    public Integer listarQuantidadeDeProdutosLivro(List<Livro> lista){
        Integer quantidadeProdutos = lista.stream().mapToInt(Produto::getQuantidade).sum();
        return quantidadeProdutos;
    }

    public Integer listarQuantidadeDeProdutosJogo(List<Jogo> lista){
        Integer quantidadeProdutos = lista.stream().mapToInt(Produto::getQuantidade).sum();
        return quantidadeProdutos;
    }

    public Integer listarQuantidadeDeProdutosFilme(List<Filme> lista){
        Integer quantidadeProdutos = lista.stream().mapToInt(Produto::getQuantidade).sum();
        return quantidadeProdutos;
    }

    public Integer listarQuantidadeDeProdutosBrinquedo(List<Brinquedo> lista){
        Integer quantidadeProdutos = lista.stream().mapToInt(Produto::getQuantidade).sum();
        return quantidadeProdutos;
    }

    public Integer listarQuantidadeDeProdutosAlbum(List<AlbunsDeMusica> lista){
        Integer quantidadeProdutos = lista.stream().mapToInt(Produto::getQuantidade).sum();
        return quantidadeProdutos;
    }

    public void removerLivroId(List<Livro> lista, Integer id){
        lista.removeIf(produto -> Objects.equals(produto.getIdDoProduto(), id));
        System.out.println("Produto removido com sucesso!");
    }

    public void removerJogoId(List<Jogo> lista, Integer id){
        lista.removeIf(produto -> Objects.equals(produto.getIdDoProduto(), id));
        System.out.println("Produto removido com sucesso!");
    }

    public void removerFilmeId(List<Filme> lista, Integer id){
        lista.removeIf(produto -> Objects.equals(produto.getIdDoProduto(), id));
        System.out.println("Produto removido com sucesso!");
    }

    public void removerBrinquedoId(List<Brinquedo> lista, Integer id){
        lista.removeIf(produto -> Objects.equals(produto.getIdDoProduto(), id));
        System.out.println("Produto removido com sucesso!");
    }

    public void removerAlbumId(List<AlbunsDeMusica> lista, Integer id){
        lista.removeIf(produto -> Objects.equals(produto.getIdDoProduto(), id));
        System.out.println("Produto removido com sucesso!");
    }

    public Livro alterarLivroId(List<Livro> lista, Integer id){
        for (Livro livro:lista)
            if (Objects.equals(livro.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Livro: ");
                livro.setPrecoDoProduto(scanner.nextInt());
                return livro;
            }
        return null;
    }

    public Jogo alterarJogoId(List<Jogo> lista, Integer id){
        for (Jogo jogo:lista)
            if (Objects.equals(jogo.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Jogo: ");
                jogo.setPrecoDoProduto(scanner.nextInt());
                return jogo;
            }
        return null;
    }

    public Filme alterarFilmeId(List<Filme> lista, Integer id){
        for (Filme filme:lista)
            if (Objects.equals(filme.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Filme: ");
                filme.setPrecoDoProduto(scanner.nextInt());
                return filme;
            }
        return null;
    }

    public Brinquedo alterarBrinquedoId(List<Brinquedo> lista, Integer id){
        for (Brinquedo brinquedo:lista)
            if (Objects.equals(brinquedo.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Brinquedo: ");
                brinquedo.setPrecoDoProduto(scanner.nextInt());
                return brinquedo;
            }
        return null;
    }

    public AlbunsDeMusica alterarAlbunsId(List<AlbunsDeMusica> lista, Integer id){
        for (AlbunsDeMusica album:lista)
            if (Objects.equals(album.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Album: ");
                album.setPrecoDoProduto(scanner.nextInt());
                return album;
            }
        return null;
    }
}
