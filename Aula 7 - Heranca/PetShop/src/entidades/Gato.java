package entidades;

public class Gato extends Animal {
    private String cor;


    public Gato(String nome, double peso, int idade, String cor) {
        super(nome, peso, idade);
        this.cor = cor;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nCor: " + cor;
    }
}
