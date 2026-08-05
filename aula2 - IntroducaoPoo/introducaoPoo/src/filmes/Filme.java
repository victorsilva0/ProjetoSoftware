package filmes;

public class Filme {
    //Atributos
    String titulo;
    String genero;
    int anoLancamento;
    int duracao;

    //Ingressos
    int qtdIngresso;
    double valorIngresso;

    @Override
    public String toString() {
        return
                "\nTitulo:" + titulo +
                "\nGenero:" + genero +
                "\nAno de Lancamento:" + anoLancamento +
                "\nDuracao:" + duracao +
                "\nQuantidade de Ingressos:" + qtdIngresso +
                "\nValor do Ingresso:" + valorIngresso;
    }
}
