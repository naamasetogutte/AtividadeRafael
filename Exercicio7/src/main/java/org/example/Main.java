package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, org.example.Produto> produtos = new HashMap<>();
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - SAIR");
            System.out.print("Escolha uma OPÇÃO: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o preço do produto: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(codigo, nome, preco);
                    produtos.put(codigo, produto);
                    System.out.println("Produto cadastrado com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite o código do produto para buscar: ");
                    int codigoBusca = scanner.nextInt();
                    Produto produtoBusca = produtos.get(codigoBusca);
                    if (produtoBusca != null) {
                        System.out.println("Produto encontrado: " + produtoBusca);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
