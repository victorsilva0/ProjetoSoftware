package entidades;

public class Eletronico extends Produto {
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int quantidadeEstoque, int garantiaMeses) {
        super(nome, preco, quantidadeEstoque);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }


    @Override
    public String toString() {
        return "GarantiaMeses: " + garantiaMeses +
                '}';
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome do produto: " + getNome());
        System.out.println("Preco: " + getPreco());
        System.out.println("QuantidadeEstoque: " + getQuantidadeEstoque());
        System.out.println("GarantiaMeses: " + getGarantiaMeses());
    };

    @Override
    public double calcularTotal(int quantidade) {
        return getPreco() * getQuantidadeEstoque();
    }

    @Override
    public boolean vender(int quantidade) {
        if (quantidade > 0 && this.quantidadeEstoque >= quantidade) {
            this.quantidadeEstoque -= quantidade;
            return true;
        } else
            return false;
    }
}
