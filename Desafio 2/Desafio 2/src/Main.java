import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GerenciarProdutos gerenciador = new GerenciarProdutos();
        int opcao;

        while (true) {
            System.out.println("==== MENU DE OPÇÕES ====");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Remover Produto");
            System.out.println("5 - Sair");
            System.out.print("DIGITE UMA OPÇÃO: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Preço: ");
                    double preco = sc.nextDouble();
                    System.out.println("Quantidade: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();
                    Produto produto = new Produto(nome, preco, quantidade);
                    gerenciador.cadastrarProduto(produto);
                    break;

                case "2":
                    gerenciador.listarProdutos()
                    break;

                case "3":
                    gerenciador.listarProdutos()
                    System.out.println();
                    }
            }
        }
    }
}
