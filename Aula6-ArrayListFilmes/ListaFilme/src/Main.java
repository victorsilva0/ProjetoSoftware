import entidades.Filme;

import java.lang.classfile.instruction.SwitchCase;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Filme> filmes = new ArrayList<>();

        while (true) {
            System.out.println("1 - CADASTRAR FILME");
            System.out.println("2 - LISTAR FILMES");
            System.out.println("3 - ATUALIZAR FILME");
            System.out.println("4 - EXCLUIR FILME");
            System.out.println("5 - SALIR DO PROGRAMA");
            System.out.print("DIGITE UMA OPÇÃO: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("DIGITE O TITULO DO FILME: ");
                    String titulo = sc.nextLine();

                    System.out.print("DIGITE O GÊNERO DO FILME: ");
                    String genero = sc.nextLine();

                    System.out.print("DIGITE O DURAÇÃO DO FILME: ");
                    int duracao = sc.nextInt();
                    sc.nextLine();

                    System.out.println("DIGITE A INFORMAÇÃO DA CLASSIFICAÇÃO: ");
                    int classificacao = sc.nextInt();
                    sc.nextLine();

                    Filme filme = new Filme(titulo, genero, duracao, classificacao);
                    filmes.add(filme);
                    System.out.println("Filme cadastrado com sucesso!");
                    break;

                case "2":

                    if (filmes.isEmpty()) {
                        System.out.println("NENHUM FILME CADASTRADO!");
                    } else {

                        System.out.println("| ID | TITULO | GENERO | DURACAO | CLASSIFICACAO |");

                        for (int i = 0; i < filmes.size(); i++) {
                            System.out.println("| " + i + "|" + filmes.get(i).toString() + "|");
                        }
                    }
                    break;

                case "3":
                    System.out.println("INFORME O ID DO FILME");
                    int idFilme = sc.nextInt();
                    sc.nextLine();

                    System.out.print("DIGITE O TITULO DO FILME: ");
                    String alteraTitulo = sc.nextLine();

                    System.out.print("DIGITE O GÊNERO DO FILME: ");
                    String alteraGenero = sc.nextLine();

                    System.out.print("DIGITE O DURAÇÃO DO FILME: ");
                    int alteraDuracao = sc.nextInt();
                    sc.nextLine();

                    System.out.println("DIGITE A INFORMAÇÃO DA CLASSIFICAÇÃO: ");
                    int alteraClassificacao = sc.nextInt();
                    sc.nextLine();


                    var alteraFilme = filmes.get(idFilme);

                    alteraFilme.setTitulo(alteraTitulo);
                    alteraFilme.setGenero(alteraGenero);
                    alteraFilme.setDuracao(alteraDuracao);
                    alteraFilme.setClassificacao(alteraClassificacao);

                    System.out.println("Filme alterado com sucesso!");
                    break;

                case "4":
                    System.out.println("INFORME O ID DO FILME: ");
                    int idFilme2 = sc.nextInt();
                    sc.nextLine();

                    filmes.remove(idFilme2);
                    break;

                case "5":
                    return;
            }
        }
    }
}
