package entidades;

public class Ebook extends ItemBiblioteca {
    private double tamanhoArquivoMb;


    //Construtor
    public Ebook(String titulo, String autor, int anoPublicacao, double tamanhoArquivoMb) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivoMb = tamanhoArquivoMb;
    }


    //Getters e Setters
    public double getTamanhoArquivoMb() {
        return tamanhoArquivoMb;
    }

    public void setTamanhoArquivoMb(double tamanhoArquivoMb) {
        this.tamanhoArquivoMb = tamanhoArquivoMb;
    }


    //Métodos
    @Override
    public void exibirInformacoes() {
        System.out.println("Tipo: Ebook");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano da Publicação: " + getAnoPublicacao());
        System.out.println("Tamanho do arquivo: " + tamanhoArquivoMb + "MB");
    }
}
