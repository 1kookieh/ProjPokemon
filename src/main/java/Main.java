public class Main {
        public static void main(String[] args) {
            // Criar treinadores
            Treinador ash = new Treinador("Ash", 15);
            Treinador misty = new Treinador("Misty", 16);

            // Criar pokémons
            Pokemon pikachu = new Pokemon("Pikachu", "Elétrico", 5, 100);
            Pokemon staryu = new Pokemon("Staryu", "Água", 5, 100);

            // Criar habilidades
            Habilidade choqueDoTrovao = new Habilidade("Choque do Trovão", 20, "Elétrico");
            Habilidade jatoDeAgua = new Habilidade("Jato de Água", 15, "Água");

            pikachu.adicionarHabilidade(choqueDoTrovao);
            staryu.adicionarHabilidade(jatoDeAgua);

            // Capturar Pokémons
            ash.capturarPokemon(pikachu);
            misty.capturarPokemon(staryu);

            // Listar Pokémons
            ash.listarPokemons();
            misty.listarPokemons();

            // Usar itens
            ItemCura pocao = new ItemCura("Poção", "Recupera vida", 30);
            ItemEvolucao pedraTrovão = new ItemEvolucao("Pedra Trovão", "Evolui Pikachu");

            pocao.aplicar(pikachu);
            pedraTrovão.aplicar(pikachu);

            // Simular batalha
            Batalha batalha = new Batalha(ash, misty);
            batalha.iniciar();

            batalha.registrarTurno(pikachu, choqueDoTrovao, staryu);
            batalha.registrarTurno(staryu, jatoDeAgua, pikachu);

            System.out.println("Fim da batalha!");
        }
}
