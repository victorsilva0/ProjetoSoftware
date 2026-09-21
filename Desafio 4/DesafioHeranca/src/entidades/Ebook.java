package entidades;

public class Ebook extends ItemBiblioteca {
    private double tamanhoArquivo;


    public Ebook(String titulo, String autor, int anoPublicacao, double tamanhoArquivo) {
        super(titulo, autor, anoPublicacao);
        this.tamanhoArquivo = tamanhoArquivo;
    }


    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
}
