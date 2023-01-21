package br.com.ada.polotech.livraria.main;

import br.com.ada.polotech.livraria.modelos.*;

import java.util.*;
import java.util.stream.IntStream;

public class Livraria {
    private Double valorCaixa = 0.00;

    public Double getValorCaixa() {
        return valorCaixa;
    }

    List<Livro> listaLivros = new ArrayList<>();
    List<Jogo> listaJogos = new ArrayList<>();
    List<Filme> listaFilmes = new ArrayList<>();
    List<AlbunsDeMusica> listaAlbuns = new ArrayList<>();
    List<Brinquedo> listaBrinquedos = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    Random numeroAleatorio = new Random();
    Integer opcao, idAleatorio, id;

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

    public void cadastrarProduto(){
        listarTipoProduto();
        opcao = scanner.nextInt();
        System.out.println("Digite o tipo de produto que deseja cadastrar: ");
        scanner.nextLine();

        switch (opcao){
            case 1:
                System.out.println("Nome do Livro: ");
                String nomeLivro = scanner.nextLine();

                System.out.println("Preço: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Por favor, digite um número.");
                    System.out.print("Preço: ");
                    scanner.next();
                }
                Double precoLivro = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Escritor: ");
                String escritorLivro = scanner.nextLine();

                System.out.println("Editora: ");
                String editoraLivro = scanner.nextLine();

                Livro livro = new Livro(nomeLivro, precoLivro, escritorLivro, editoraLivro);
                idAleatorio = numeroAleatorio.nextInt(1000);
                livro.setIdDoProduto(idAleatorio);
                livro.setQuantidade(receberQuantidadeParaAdicionarNoEstoque());
                Integer qtdAdicionar = livro.getQuantidade();
                adicionarQuantidadeNoEstoqueProduto(qtdAdicionar);
                listaLivros.add(livro);
                System.out.println("Livro cadastrado com sucesso!");
                break;
            case 2:
                System.out.println("Nome do Jogo: ");
                String nomeJogo = scanner.nextLine();

                System.out.println("Preco: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Por favor, digite um número.");
                    System.out.print("Preço: ");
                    scanner.next();
                }
                Double precoJogo = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Distribuidora: ");
                String distribuidoraJogo = scanner.nextLine();

                System.out.println("Gênero: ");
                String generoJogo = scanner.nextLine();

                System.out.println("Estúdio: ");
                String estudioJogo = scanner.nextLine();

                Jogo jogo = new Jogo(nomeJogo, precoJogo, distribuidoraJogo, estudioJogo);
                numeroAleatorio = new Random();
                idAleatorio = numeroAleatorio.nextInt(1000);
                jogo.setIdDoProduto(idAleatorio);
                jogo.setQuantidade(receberQuantidadeParaAdicionarNoEstoque());
                qtdAdicionar = jogo.getQuantidade();
                adicionarQuantidadeNoEstoqueProduto(qtdAdicionar);
                listaJogos.add(jogo);
                System.out.println("Jogo cadastrado com sucesso!");
                break;
            case 3:
                System.out.println("Nome do Filme: ");
                String nomeFilme = scanner.nextLine();

                System.out.println("Preço: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Por favor, digite um número.");
                    System.out.print("Preço: ");
                    scanner.next();
                }
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
                filme.setQuantidade(receberQuantidadeParaAdicionarNoEstoque());
                qtdAdicionar = filme.getQuantidade();
                adicionarQuantidadeNoEstoqueProduto(qtdAdicionar);
                listaFilmes.add(filme);
                System.out.println("Filme cadastrado com sucesso!");
                break;
            case 4:
                System.out.println("Nome do Albúm de Música: ");
                String nomeAlbum = scanner.nextLine();

                System.out.println("Preço: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Por favor, digite um número.");
                    System.out.print("Preço: ");
                    scanner.next();
                }
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
                album.setQuantidade(receberQuantidadeParaAdicionarNoEstoque());
                qtdAdicionar = album.getQuantidade();
                adicionarQuantidadeNoEstoqueProduto(qtdAdicionar);
                listaAlbuns.add(album);
                System.out.println("Albúm cadastrado com sucesso!");
                break;
            case 5:
                System.out.println("Nome do Brinquedo: ");
                String nomeBrinquedo = scanner.nextLine();

                System.out.println("Preço: ");
                while (!scanner.hasNextDouble()) {
                    System.out.println("Por favor, digite um número.");
                    System.out.print("Preço: ");
                    scanner.next();
                }
                Double precoBrinquedo = scanner.nextDouble();
                scanner.nextLine();

                System.out.println("Tipo: ");
                String tipoBrinquedo = scanner.nextLine();

                Brinquedo brinquedo = new Brinquedo(nomeBrinquedo, precoBrinquedo, tipoBrinquedo);
                Random numeroAleatorio5 = new Random();
                Integer idAleatorio5 = numeroAleatorio5.nextInt(1000);
                brinquedo.setIdDoProduto(idAleatorio5);
                brinquedo.setQuantidade(receberQuantidadeParaAdicionarNoEstoque());
                qtdAdicionar = brinquedo.getQuantidade();
                adicionarQuantidadeNoEstoqueProduto(qtdAdicionar);
                listaBrinquedos.add(brinquedo);
                System.out.println("Brinquedo cadastrado com sucesso!");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
    public void removerProduto(){
        listarTipoProduto();
        System.out.println("Digite uma das opções: ");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                listarProdutos(listaLivros);
                System.out.println("Digite o id do Livro que deseja remover: ");
                id = scanner.nextInt();
                removerLivroId(listaLivros, id);
                break;
            case 2:
                listarProdutos(listaJogos);
                System.out.println("Digite o id do Jogo que deseja remover: ");
                id = scanner.nextInt();
                removerJogoId(listaJogos, id);
                break;
            case 3:
                listarProdutos(listaFilmes);
                System.out.println("Digite o id do Filme que deseja remover: ");
                id = scanner.nextInt();
                removerFilmeId(listaFilmes, id);
                break;
            case 4:
                listarProdutos(listaAlbuns);
                System.out.println("Digite o id do Album que deseja remover: ");
                id = scanner.nextInt();
                removerAlbumId(listaAlbuns, id);
                break;
            case 5:
                listarProdutos(listaBrinquedos);
                System.out.println("Digite o id do Brinquedo que deseja remover: ");
                id = scanner.nextInt();
                removerBrinquedoId(listaBrinquedos, id);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    public void alterarProduto(){
        listarTipoProduto();
        System.out.println("Digite uma das opções: ");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Alterar Livro");
                listarProdutos(listaLivros);
                System.out.println("Digite o id do Livro que deseja alterar: ");
                Integer id = scanner.nextInt();
                scanner.nextLine();
                alterarLivroId(listaLivros, id);
                break;
            case 2:
                System.out.println("Alterar Jogo");
                listarProdutos(listaJogos);
                System.out.println("Digite o id do Jogo que deseja alterar: ");
                Integer id2 = scanner.nextInt();
                scanner.nextLine();
                alterarJogoId(listaJogos, id2);
                break;
            case 3:
                System.out.println("Alterar Filme");
                listarProdutos(listaFilmes);
                System.out.println("Digite o id do Filme que deseja alterar: ");
                Integer id3 = scanner.nextInt();
                scanner.nextLine();
                alterarFilmeId(listaFilmes, id3);
                break;
            case 4:
                System.out.println("Alterar Album");
                listarProdutos(listaAlbuns);
                System.out.println("Digite o id do Album que deseja alterar: ");
                Integer id4 = scanner.nextInt();
                scanner.nextLine();
                alterarAlbunsId(listaAlbuns, id4);
                break;
            case 5:
                System.out.println("Alterar Brinquedo");
                listarProdutos(listaBrinquedos);
                System.out.println("Digite o id do Brinquedo que deseja alterar: ");
                Integer id5 = scanner.nextInt();
                scanner.nextLine();
                alterarBrinquedoId(listaBrinquedos, id5);
                break;
        }
    }

    public void comprarProduto(){
        listarTipoProduto();
        System.out.println("Digite uma das opções: ");
        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                listarProdutos(listaLivros);
                System.out.println("Digite o id do Livro que deseja comprar: ");
                id = scanner.nextInt();
                System.out.println("Digite a quantidade que deseja comprar");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, digite um número inteiro.");
                    System.out.print("Digite a quantidade que deseja comprar: ");
                    scanner.next();
                }
                Integer quantidade = scanner.nextInt();
                comprarLivroId(listaLivros, id, quantidade);
                break;
            case 2:
                listarProdutos(listaJogos);
                System.out.println("Digite o id do Jogo que deseja comprar: ");
                id = scanner.nextInt();
                System.out.println("Digite a quantidade que deseja comprar");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, digite um número inteiro.");
                    System.out.print("Digite a quantidade que deseja comprar: ");
                    scanner.next();
                }
                quantidade = scanner.nextInt();
                comprarJogoId(listaJogos, id, quantidade);
                break;
            case 3:
                listarProdutos(listaFilmes);
                System.out.println("Digite o id do Filme que deseja comprar: ");
                id = scanner.nextInt();
                System.out.println("Digite a quantidade que deseja comprar");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, digite um número inteiro.");
                    System.out.print("Digite a quantidade que deseja comprar: ");
                    scanner.next();
                }
                quantidade = scanner.nextInt();
                comprarFilmeId(listaFilmes, id, quantidade);
                break;
            case 4:
                listarProdutos(listaAlbuns);
                System.out.println("Digite o id do Album que deseja comprar: ");
                id = scanner.nextInt();
                System.out.println("Digite a quantidade que deseja comprar");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, digite um número inteiro.");
                    System.out.print("Digite a quantidade que deseja comprar: ");
                    scanner.next();
                }
                quantidade = scanner.nextInt();
                comprarAlbumId(listaAlbuns, id, quantidade);
                break;
            case 5:
                listarProdutos(listaBrinquedos);
                System.out.println("Digite o id do Brinquedo que deseja comprar: ");
                id = scanner.nextInt();
                System.out.println("Digite a quantidade que deseja comprar");
                while (!scanner.hasNextInt()) {
                    System.out.println("Por favor, digite um número inteiro.");
                    System.out.print("Digite a quantidade que deseja comprar: ");
                    scanner.next();
                }
                quantidade = scanner.nextInt();
                comprarBrinquedoId(listaBrinquedos, id, quantidade);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public Filme comprarFilmeId(List<Filme> lista, Integer id, Integer quantidade){
        for (Filme filme:lista)
            if (Objects.equals(filme.getIdDoProduto(), id)) {
                int valorDaCompra = (int) (filme.getPrecoDoProduto() * quantidade);
                valorCaixa += valorDaCompra;

                int subtrairQuantidade = filme.getQuantidade() - quantidade;
                filme.setQuantidade(subtrairQuantidade);
                subtrairQuantidade = filme.getQuantidadeDeFilmes() - quantidade;
                filme.setQuantidadeDeFilmes(subtrairQuantidade);
                removerQuantidadeNoEstoqueProduto(quantidade);
                System.out.println("Compra realizada com sucesso! Obrigado!");
                return filme;
            }
        return null;
    }
    public Brinquedo comprarBrinquedoId(List<Brinquedo> lista, Integer id, Integer quantidade){
        for (Brinquedo brinquedo:lista)
            if (Objects.equals(brinquedo.getIdDoProduto(), id)) {
                int valorDaCompra = (int) (brinquedo.getPrecoDoProduto() * quantidade);
                valorCaixa += valorDaCompra;

                int subtrairQuantidade = brinquedo.getQuantidade() - quantidade;
                brinquedo.setQuantidade(subtrairQuantidade);
                subtrairQuantidade = brinquedo.getQuantidadeDeBrinquedos() - quantidade;
                brinquedo.setQuantidadeDeBrinquedos(subtrairQuantidade);
                removerQuantidadeNoEstoqueProduto(quantidade);
                System.out.println("Compra realizada com sucesso! Obrigado!");
                return brinquedo;
            }
        return null;
    }
    public AlbunsDeMusica comprarAlbumId(List<AlbunsDeMusica> lista, Integer id, Integer quantidade){
        for (AlbunsDeMusica album:lista)
            if (Objects.equals(album.getIdDoProduto(), id)) {
                int valorDaCompra = (int) (album.getPrecoDoProduto() * quantidade);
                valorCaixa += valorDaCompra;

                int subtrairQuantidade = album.getQuantidade() - quantidade;
                album.setQuantidade(subtrairQuantidade);
                subtrairQuantidade = album.getQuantidadeDeAlbuns() - quantidade;
                album.setQuantidadeDeAlbuns(subtrairQuantidade);
                removerQuantidadeNoEstoqueProduto(quantidade);
                System.out.println("Compra realizada com sucesso! Obrigado!");
                return album;
            }
        return null;
    }
    public Jogo comprarJogoId(List<Jogo> lista, Integer id, Integer quantidade){
        for (Jogo jogo:lista)
            if (Objects.equals(jogo.getIdDoProduto(), id)) {
                int valorDaCompra = (int) (jogo.getPrecoDoProduto() * quantidade);
                valorCaixa += valorDaCompra;

                int subtrairQuantidade = jogo.getQuantidade() - quantidade;
                jogo.setQuantidade(subtrairQuantidade);
                subtrairQuantidade = jogo.getQuantidadeDeJogos() - quantidade;
                jogo.setQuantidadeDeJogos(subtrairQuantidade);
                removerQuantidadeNoEstoqueProduto(quantidade);
                System.out.println("Compra realizada com sucesso! Obrigado!");
                return jogo;
            }
        return null;
    }
    public Livro comprarLivroId(List<Livro> lista, Integer id, Integer quantidade){
        for (Livro livro:lista)
            if (Objects.equals(livro.getIdDoProduto(), id)) {
                int valorDaCompra = (int) (livro.getPrecoDoProduto() * quantidade);
                valorCaixa += valorDaCompra;

                int subtrairQuantidade = livro.getQuantidade() - quantidade;
                livro.setQuantidade(subtrairQuantidade);
                subtrairQuantidade = livro.getQuantidadeDeLivros() - quantidade;
                livro.setQuantidadeDeLivros(subtrairQuantidade);
                removerQuantidadeNoEstoqueProduto(quantidade);
                System.out.println("Compra realizada com sucesso! Obrigado!");
                return livro;
            }
        return null;
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
                removerProduto();
                break;
            case 2:
                System.out.println("Ver Produtos por Categoria");
                listarTipoProduto();
                System.out.println("Digite uma das opções: ");
                opcao = scanner.nextInt();

                switch (opcao){
                    case 1:
                        listarProdutos(listaLivros);
                        quantidadeTotal = listarQuantidadeDeProdutosLivro(listaLivros);
                        System.out.println("Quantidade de Livros = " + quantidadeTotal);
                        break;
                    case 2:
                        listarProdutos(listaJogos);
                        quantidadeTotal = listarQuantidadeDeProdutosJogo(listaJogos);
                        System.out.println("Quantidade de Jogos = " + quantidadeTotal);
                        break;
                    case 3:
                        listarProdutos(listaFilmes);
                        quantidadeTotal = listarQuantidadeDeProdutosFilme(listaFilmes);
                        System.out.println("Quantidade de Filmes = " + quantidadeTotal);
                        break;
                    case 4:
                        listarProdutos(listaAlbuns);
                        quantidadeTotal = listarQuantidadeDeProdutosAlbum(listaAlbuns);
                        System.out.println("Quantidade de Albuns = " + quantidadeTotal);
                        break;
                    case 5:
                        listarProdutos(listaBrinquedos);
                        quantidadeTotal = listarQuantidadeDeProdutosBrinquedo(listaBrinquedos);
                        System.out.println("Quantidade de Brinquedos = " + quantidadeTotal);
                        break;
                    default:
                        System.out.println("Opção inválida");
                }
                break;
            case 3:
                System.out.println("Lista de Todos os Produtos");
                if(listaLivros.size() != 0) {
                    listarProdutos(listaLivros);
                }
                if(listaJogos.size() != 0){
                    listarProdutos(listaJogos);
                }
                if(listaAlbuns.size() != 0){
                    listarProdutos(listaAlbuns);
                }
                if(listaFilmes.size() != 0){
                    listarProdutos(listaFilmes);
                }
                if(listaBrinquedos.size() != 0){
                    listarProdutos(listaBrinquedos);
                }
                System.out.println("Quantidade Total de Produtos: " + Produto.getQuantidadeDeProdutosEmEstoque());
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    public void adicionarQuantidadeNoEstoqueProduto(Integer quantidadeProdutos){
        Produto.quantidadeDeProdutosEmEstoque += quantidadeProdutos;
    }
    public Integer receberQuantidadeParaAdicionarNoEstoque(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite o id: ");
        //Integer idDigitado = scanner.nextInt();
        System.out.println("Quantidade: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, digite um número inteiro.");
            System.out.print("Quantidade: ");
            scanner.next();
        }
        int qtdAdicionar = scanner.nextInt();
        return qtdAdicionar;
    }
    public void removerQuantidadeNoEstoqueProduto(Integer qtdRemover){
        Produto.quantidadeDeProdutosEmEstoque -= qtdRemover;
    }

    public void listarProdutos(List lista){
        lista.stream().forEach(System.out::println);
        System.out.println();
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
        System.out.println("Livro removido com sucesso!");
    }

    public void removerJogoId(List<Jogo> lista, Integer id){
        lista.removeIf(produto -> Objects.equals(produto.getIdDoProduto(), id));
        System.out.println("Jogo removido com sucesso!");
    }
    public void removerFilmeId(List<Filme> lista, Integer id){
        lista.removeIf(produto -> Objects.equals(produto.getIdDoProduto(), id));
        System.out.println("Filme removido com sucesso!");
    }
    public void removerBrinquedoId(List<Brinquedo> lista, Integer id){
        lista.removeIf(produto -> Objects.equals(produto.getIdDoProduto(), id));
        System.out.println("Brinquedo removido com sucesso!");
    }
    public void removerAlbumId(List<AlbunsDeMusica> lista, Integer id){
        lista.removeIf(produto -> Objects.equals(produto.getIdDoProduto(), id));
        System.out.println("Albúm removido com sucesso!");
    }
    public Livro alterarLivroId(List<Livro> lista, Integer id){
        for (Livro livro:lista)
            if (Objects.equals(livro.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Livro: ");
                livro.setPrecoDoProduto(scanner.nextInt());
                System.out.println("Livro alterado com sucesso!");
                return livro;
            }else{
                System.out.println("O ID não é válido!");
            }
        return null;
    }
    public Jogo alterarJogoId(List<Jogo> lista, Integer id){
        for (Jogo jogo:lista)
            if (Objects.equals(jogo.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Jogo: ");
                jogo.setPrecoDoProduto(scanner.nextInt());
                System.out.println("Jogo alterado com sucesso!");
                return jogo;
            }else{
                System.out.println("O ID não é válido!");
            }
        return null;
    }
    public Filme alterarFilmeId(List<Filme> lista, Integer id){
        for (Filme filme:lista)
            if (Objects.equals(filme.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Filme: ");
                filme.setPrecoDoProduto(scanner.nextInt());
                System.out.println("Filme alterado com sucesso!");
                return filme;
            }else{
                System.out.println("O ID não é válido!");
            }
        return null;
    }
    public Brinquedo alterarBrinquedoId(List<Brinquedo> lista, Integer id){
        for (Brinquedo brinquedo:lista)
            if (Objects.equals(brinquedo.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Brinquedo: ");
                brinquedo.setPrecoDoProduto(scanner.nextInt());
                System.out.println("Brinquedo alterado com sucesso!");
                return brinquedo;
            }else{
                System.out.println("O ID não é válido!");
            }
        return null;
    }
    public AlbunsDeMusica alterarAlbunsId(List<AlbunsDeMusica> lista, Integer id){
        for (AlbunsDeMusica album:lista)
            if (Objects.equals(album.getIdDoProduto(), id)) {
                System.out.println("Digite o novo valor do Album: ");
                album.setPrecoDoProduto(scanner.nextInt());
                System.out.println("Albúm alterado com sucesso!");
                return album;
            }else{
                System.out.println("O ID não é válido!");
            }
        return null;
    }

    public void verCaixa(){
        System.out.println("R$ " + valorCaixa);
    }
}
