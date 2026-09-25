package entidades;

public class Revista extends ItemBiblioteca implements Emprestavel{
    private int edicao;
    private boolean disponivel = true;


    //Construtor
    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }


    //Gettrs e Setters
    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }


    //Métodos
    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Revista");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano da Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
        System.out.println("Disponível: " + (disponivel ? "sim" : "Não"));
    }

    @Override
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Item emprestado com sucesso");
        } else {
            System.out.println("Item indisponível para empréstimo");
        }
    }

    @Override
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Item devolvido com sucesso");
        } else {
            System.out.println("Item já está disponível");
        }
    }

    @Override
    public boolean estaDisponivel() {
        return disponivel;
    }
}
