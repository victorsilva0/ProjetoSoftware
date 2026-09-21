package entidades;

public class Vendedor extends Funcionario implements Bonificacao {
    private double metaVendas;

    public Vendedor(String nome, double salario, double metaVendas) {
        super(nome, salario);
        this.metaVendas = metaVendas;
    }


    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nMeta de Vendas: " + metaVendas;
    }


    @Override
    public double calcularComissao() {
        return getSalario() * 0.02;
    }
}
