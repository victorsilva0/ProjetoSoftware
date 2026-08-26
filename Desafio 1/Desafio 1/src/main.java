import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a marca da roupa: ");
        String marca = input.nextLine();
        System.out.println("Digite o tipo de roupa :");
        String tipo = input.nextLine();
        System.out.println("Digite o tamanho da roupa: ");
        String tamanho = input.nextLine();
        System.out.println("Digite a quantidade inicial: ");
        int quantidade = Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor da roupa: ");
        double valor = Double.parseDouble(input.nextLine());
        Roupa roupa = new Roupa(tipo, marca, tamanho, quantidade, valor);
        System.out.println("\n====== ROUPA CADASTRADA ====== ");
        System.out.println(roupa);
        System.out.println("\nDeseja adicionar ou remover peças?");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Não fazer nada");

        int opcao = Integer.parseInt(input.nextLine());

        if (opcao == 1) {
            System.out.println("Digite a quantidade para adicionar: ");
            int quantidadeAdicionar = Integer.parseInt(input.nextLine());

            roupa.incrementaQuantidade(quantidadeAdicionar);

        } else if (opcao == 2) {
            System.out.println("Digite a quantidade para remover: ");
            int quantidadeRemover = Integer.parseInt(input.nextLine());

            roupa.decrementaQuantidade(quantidadeRemover);
        }

        System.out.println("\n===== ESTOQUE ATUALIZADO ====== ");
        System.out.println(roupa);

        input.close();
    }
}

