import entidades.*;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Star Wars: Luz dos Jedis", "Charles Soule", 2021, "978-6556090870");
        Livro livro2 = new Livro("Sussuros na Escuridão", "H.P. Lovecraft", 2018, "978-8584422838");
        Revista revista = new Revista("Alguma Coisa Está Matando as Crianças", "James Tynion IV", 2021, 1);
        Ebook ebook = new Ebook("Neuromancer", "Willian Gibson", 2016, 268.93);


        System.out.println("=== ITENS DA BIBLIOTECA ===");

        ItemBiblioteca item1 = livro;
        ItemBiblioteca item2 = revista;
        ItemBiblioteca item3 = ebook;

        item1.exibirInformacoes();

        System.out.println();

        item2.exibirInformacoes();

        System.out.println();

        item3.exibirInformacoes();

        System.out.println();

        System.out.println("=== TESTE DE EMPRÉSTIMO ===");

        Emprestavel emprestavel1 = livro;
        Emprestavel emprestavel2 = revista;

        System.out.println("Livro disponível: " + emprestavel1.estaDisponivel());

        emprestavel1.emprestar();

        System.out.println("Livro disponível: " + emprestavel1.estaDisponivel());

        emprestavel1.emprestar();

        emprestavel1.devolver();

        System.out.println(
                "Livro disponível: " + emprestavel1.estaDisponivel()
        );

        System.out.println();

        System.out.println(
                "Revista disponível: " + emprestavel2.estaDisponivel()
        );
    }
}
