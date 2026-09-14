import entidades.Cachorro;
import entidades.Gato;
import entidades.Peixe;

public class Main {
    public static void main(String[] args) {

        //Cachorro
        Cachorro marley = new Cachorro("Marley", 30, 5, "Labrador");

        //Gato
        Gato garfield = new Gato("Garfield", 5, 5, "Laranja");

        //Peixe
        Peixe nemo = new Peixe("Nemo", 5, 10, "Peixe-Palhaço");

        System.out.println("Cachorro " + marley);
        System.out.println("Gato " + garfield);
        System.out.println("Peixe " + nemo);
    }
}
