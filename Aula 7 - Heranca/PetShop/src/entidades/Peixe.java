package entidades;

public class Peixe extends Animal {
    private String especie;


    public Peixe(String nome, double peso, int idade, String especie) {
        super(nome, peso, idade);
        this.especie = especie;
    }


    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nEspecie: " + especie;
    }
}
