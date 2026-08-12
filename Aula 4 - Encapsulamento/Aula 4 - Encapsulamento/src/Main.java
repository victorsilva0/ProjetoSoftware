import entidades.Conta;

public class Main {

    public static void main(String[] args) {
        Conta conta = new Conta("Joao", 0,"1","10");

        System.out.println(conta.getSaldo());
        conta.setNome("100");

        System.out.println(conta.toString());

    }
}
