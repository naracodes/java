package br.com.ada.polotech.livraria.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Livraria livraria = new Livraria();

        int opcao;

        do {
            System.out.println("------------------------------");
            System.out.println("| Bem Vindo a Livraria!      |");
            System.out.println("------------------------------");
            System.out.println("Caixa = R$ " + livraria.getValorCaixa());
            System.out.println("------------------------------");
            System.out.println("| 1- Cadastrar Produto ok    |");
            System.out.println("| 2- Alterar Produto ok      |");
            System.out.println("| 3- Comprar Produto ok      |");
            System.out.println("| 4- Estoque ok              |");
            System.out.println("| 5- Ver Caixa ok            |");
            System.out.println("| 6- Sair ok                 |");
            System.out.println("------------------------------");
            System.out.print("Digite uma das opções: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, digite um número inteiro.");
                System.out.print("Digite uma das opções: ");
                scanner.next();
            }
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Cadastro de Produtos");
                    livraria.cadastrarProduto();
                    break;
                case 2:
                    System.out.println("Alterar Produto");
                    livraria.alterarProduto();
                    break;
                case 3:
                    System.out.println("Comprar Produto");
                    livraria.comprarProduto();
                    break;
                case 4:
                    livraria.movimentarEstoque();
                    break;
                case 5:
                    livraria.verCaixa();
                    break;
                case 6:
                    System.out.println("Até a próxima!");
                    break;
                default:
                    System.out.println("Opcao inválida.");
            }
        }while (opcao!=6);
    }
}
