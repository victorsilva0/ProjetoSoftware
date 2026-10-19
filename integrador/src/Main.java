import entidades.Eletronico;
import entidades.Produto;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Eletronico> listaEletronico = new ArrayList<Eletronico>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("====LISTA DE OPÇÕES====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Cadastrar Eletrônico");
            System.out.println("3 - listar Produtos");
            System.out.println("4 - Alterar Preço");
            System.out.println("5 - Excluir Produto");
            System.out.println("6 - Realizar venda");
            System.out.println("0 - Sair");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do produto: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    double preco = sc.nextDouble();
                    System.out.println("Digite o quantidade do produto: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    Produto produto = new Produto(nome, preco, quantidade);
                    System.out.println("produto cadastrado");
                    break;

                    case 2:
                        System.out.println("Digite o nome do Eletrônico: ");
                        String nome = sc.nextLine();
                        System.out.println("Digite o Preço do Eletrônico: ");
                        double preco = sc.nextLine();
                        System.out.println("Digite a Quantidade do Estoque: ");
                        int quantidadeEstoque = sc.nextInt();
                        System.out.println("Garantia do Eletrônico: ");
                        int garantia = sc.nextInt();
                        sc.nextLine();
                        Eletronico eletronico = new Eletronico(nome, preco, quantidadeEstoque, garantia);
                        System.out.println("Eletronico cadastrado");
                        break;

                    case 3:
                        if (produtos.isEmpty()){
                            System.out.println("Nenhum produto cadastrado");
                        } else {
                            for ((int i = 0; i < produtos.size();
                        }
            }
        }


    }
}
