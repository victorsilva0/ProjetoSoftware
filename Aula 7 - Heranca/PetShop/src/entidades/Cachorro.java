package entidades;

public class Cachorro extends Animal {
    private String raca;


    public Cachorro(String nome, double peso, int idade, String raca) {
        super(nome, peso, idade);
        this.raca = raca;
    }


    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nRaca: " + raca;
    }
}
