package entidades;

public class Gerente extends Funcionario implements Bonificacao {
    private String setor;

    public Gerente(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nSetor: " + setor;
    }


    @Override
    public double calcularComissao() {
        return getSalario() * 0.05;
    }
}
