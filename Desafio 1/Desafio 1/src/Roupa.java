public class Roupa {
    String marca;
    String tipo;
    String tamanho;
    int quantidade;
    double valor;


    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double valorTotalEstoque(){
        return this.quantidade * this.valor;
    }

    public void decrementaQuantidade(int quantidade) {
        if(quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
            System.out.println("Quantidade atualizada com sucesso!");
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public void incrementaQuantidade(int quantidade) {
        if(quantidade > 0) {
            this.quantidade += quantidade;
            System.out.println("Quantidade atualizada com sucesso!");
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    //Getter
    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValor() {
        return valor;
    }


    //Setter
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    @Override
    public String toString() {
        return "Marca: " + marca +
                "\nTipo: " + tipo +
                "\nTamanho: " + tamanho +
                "\nquantidade: " + quantidade +
                "\nValor: " + valor +
                "\nValor total do Estoque: R$" + valorTotalEstoque();
    }
}
