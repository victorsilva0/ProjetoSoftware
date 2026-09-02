import java.util.ArrayList;

public class ArrayListaNomes {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();

        //Adicionando Valores
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Antonio");

        //Adicionar Valores em posições especificas
        nomes.add(2,"Paulo");
        nomes.add(4,"Vitor");

        //Verificar tamanho da lista
        System.out.println("O tamanho da lista é " + nomes.size());

        //Acessar o segundo nome da lista
        System.out.println("Segundo nome da lista é " + nomes.get(1));

        //Alterar um valor
        nomes.set(1, "Ricardo");
        System.out.println("Segundo nome da lista é " + nomes.get(1));

        //Encontrar uma posição a partir do seu valor
        System.out.println(nomes.indexOf("João"));

        //Remover valores de uma lista
        nomes.remove(1); //Posição
        nomes.remove("Pedro"); //Valor

        //ForEach
        for(String nome : nomes){
            System.out.println(nome);
        }

        //Função Anonima
        nomes.removeIf(nome -> nome.toLowerCase().contains("a"));

        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
