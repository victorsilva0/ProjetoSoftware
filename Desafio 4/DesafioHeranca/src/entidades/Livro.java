package entidades;

public class Livro extends ItemBiblioteca implements Emprestavel {
    private String isbn;
    private boolean disponivel = true;


    //Construtor
    public Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        super(titulo, autor, anoPublicacao);
        this.isbn = isbn;
    }


    //Getters e Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    //Métodos
    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Livro");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano da Publicação: " + getAnoPublicacao());
        System.out.println("Isbn: " + isbn);
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
