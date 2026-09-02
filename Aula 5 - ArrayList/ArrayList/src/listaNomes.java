public class listaNomes {

    public static void main(String[] args) {

        String[] nomes = new String[5];

        nomes[0] = "Juan";
        nomes[1] = "Maria";
        nomes[2] = "Pedro";
        nomes[3] = "Antonio";
        nomes[4] = "Juan";

        // Percorrer Lista

        //for
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //forEach
        for(String nome : nomes){
            System.out.println(nome);
        }


    }
}
