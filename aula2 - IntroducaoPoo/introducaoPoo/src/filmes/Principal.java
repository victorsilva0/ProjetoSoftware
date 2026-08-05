package filmes;

public class Principal {
    public static void main(String[] args) {

        Filme homemAranha = new Filme();

        homemAranha.titulo = "Homem Aranha: Um Novo Dia";
        homemAranha.genero = "Ação/Aventura";
        homemAranha.anoLancamento = 2026;
        homemAranha.duracao = 145;
        homemAranha.valorIngresso = 45;
        homemAranha.qtdIngresso = 5;

        Filme vingadores = new Filme();

        vingadores.titulo = "Vingadores: Doutor Destino";
        vingadores.genero = "Ficçao Científica/Ação";
        vingadores.anoLancamento = 2026;
        vingadores.duracao = 165;
        vingadores.valorIngresso = 45;
        vingadores.qtdIngresso = 5;

        System.out.println(vingadores.toString());
        System.out.println(homemAranha.toString());



    }
}
