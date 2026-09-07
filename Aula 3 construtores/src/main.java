import java.util.Scanner;

public class main {
    public static void  main(String[] args) {

        Filme filme = new Filme("Homem Aranha", "Ação", "Dan Slott", 115, 35, 50);

        System.out.println(filme.toString());

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a quantidade de ingressos desejados: ");
        int ingressos= sc.nextInt();
        sc.nextLine();

        System.out.println("Olá, " + nome + ", a sua compra ficou no valor de R$ " + filme.compraIngresso(ingressos));
        filme.decrementaIngresso(ingressos);

        sc.close();
    }
}
