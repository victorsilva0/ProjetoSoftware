import entidades.Estagiario;
import entidades.Gerente;
import entidades.Vendedor;

public class Main {
    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("João", 2500, 10000);
        Gerente gerente = new Gerente("Maria", 2500, "Vendas");
        Estagiario estagiario = new Estagiario("Maria", 2500, "UMC");

        System.out.println(vendedor.toString());
        System.out.println(gerente.toString());
        System.out.println(estagiario.toString());
        
    }
}
