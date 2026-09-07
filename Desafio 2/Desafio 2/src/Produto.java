public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    //Construtores
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Getters
    public String getNome() {
        return nome;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorEstoque() {
        return this.preco * quantidade;
    }

    @Override
    public String toString() {
        return nome + " | " + preco + " | " + quantidade + " | R$ " + calcularValorEstoque();
    }
}
