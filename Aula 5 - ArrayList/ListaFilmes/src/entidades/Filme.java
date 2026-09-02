package entidades;

public class Filme {

    private String titulo;
    private String genero;
    private int duracao;
    private double valor;
    private int qtdIngressos;

    public Filme(String titulo, String genero, int duracao, double valor, int qtdIngressos) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.valor = valor;
        this.qtdIngressos = qtdIngressos;
    }
}
