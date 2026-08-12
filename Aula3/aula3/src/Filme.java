public class Filme {

    String titulo;
    String genero;
    String autor;
    int duracao;
    double valor;
    int qtdIingressos;

    public Filme(String titulo, String genero, String autor, int duracao, double valor, int qtdIngressos) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.duracao = duracao;
        this.valor = valor;
        this.qtdIingressos = qtdIngressos;
    }

    public void decrementaIngresso(int ingressos) {
        if (ingressos > 0 && ingressos <= this.qtdIingressos) {
            this.qtdIingressos -= ingressos;
            System.out.println("Compra realizada com sucesso! ");
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public double compraIngresso(int ingressos) {
        if (ingressos > 0 && ingressos <= this.qtdIingressos) {
            return this.valor * ingressos;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo +
                "\nGenero: " + genero +
                "\nDuracao: " + duracao +
                "\nAutor: " + autor +
                "\nValor do Ingresso: " + valor +
                "\nQuantidade de Ingressos Disponiveis: " + qtdIingressos;
    }
}

