package entidades;

public class Filme {
    private String titulo;
    private String genero;
    private int classificacao;
    private int duracao;

    //construtores
    public Filme(String titulo, String genero, int classificacao, int duracao) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.duracao = duracao;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    //Setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return titulo + " | " + genero + " | "  + duracao + " | " + classificacao;
    }
}