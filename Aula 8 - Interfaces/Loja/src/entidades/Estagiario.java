package entidades;

public class Estagiario extends Funcionario {
    private String instituicaoEnsino;

    public Estagiario(String nome, double salario, String instituicaoEnsino) {
        super(nome, salario);
        this.instituicaoEnsino = instituicaoEnsino;
    }


    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        this.instituicaoEnsino = instituicaoEnsino;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nInstituicao de Ensino: " + instituicaoEnsino;
    }
}
