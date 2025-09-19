import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // Criar treinadores
        Treinador ash = new Treinador("Ash", 15);
        Treinador misty = new Treinador("Misty", 16);

        // Criar pokémons
        Pokemon pikachu = new Pokemon("Pikachu", "Elétrico", 5, 100);
        Pokemon staryu = new Pokemon("Staryu", "Água", 5, 100);

        // Criar habilidades
        Habilidade choqueDoTrovao = new Habilidade("Choque do Trovão", 20, "Elétrico");
        Habilidade ataqueRapido = new Habilidade("Ataque Rápido", 10, "Normal");

        Habilidade jatoDeAgua = new Habilidade("Jato de Água", 15, "Água");
        Habilidade chicoteDeBolhas = new Habilidade("Chicote de Bolhas", 12, "Água");

        // Adicionar habilidades
        pikachu.adicionarHabilidade(choqueDoTrovao);
        pikachu.adicionarHabilidade(ataqueRapido);

        staryu.adicionarHabilidade(jatoDeAgua);
        staryu.adicionarHabilidade(chicoteDeBolhas);

        // Capturar Pokémons
        ash.capturarPokemon(pikachu);
        misty.capturarPokemon(staryu);

        // Listar Pokémons
        ash.listarPokemons();
        misty.listarPokemons();

        // Usar itens antes da batalha
        ItemCura pocao = new ItemCura("Poção", "Recupera vida", 30);
        ItemEvolucao pedraTrovão = new ItemEvolucao("Pedra Trovão", "Evolui Pikachu");

        pocao.aplicar(pikachu);
        pedraTrovão.aplicar(pikachu);

        // Iniciar batalha
        Batalha batalha = new Batalha(ash, misty);
        batalha.iniciar();

        Pokemon p1 = ash.getPokemons().get(0);
        Pokemon p2 = misty.getPokemons().get(0);

        // Loop da batalha até um Pokémon ser derrotado
        int turno = 1;
        while (p1.getVida() > 0 && p2.getVida() > 0) {
            System.out.println("\n--- Turno " + turno + " ---");

            // Pikachu ataca
            Habilidade habP1 = p1.getHabilidades()
                    .get(random.nextInt(p1.getHabilidades().size()));
            batalha.registrarTurno(p1, habP1, p2);
            if (p2.getVida() <= 0) {
                System.out.println(p2.getNome() + " foi derrotado!");
                System.out.println("Vitória de " + ash.getNome() + "!");
                break;
            }

            // Staryu ataca
            Habilidade habP2 = p2.getHabilidades()
                    .get(random.nextInt(p2.getHabilidades().size()));
            batalha.registrarTurno(p2, habP2, p1);
            if (p1.getVida() <= 0) {
                System.out.println(p1.getNome() + " foi derrotado!");
                System.out.println("Vitória de " + misty.getNome() + "!");
                break;
            }

            turno++;
        }

        System.out.println("\nFim da batalha!");
    }
}
