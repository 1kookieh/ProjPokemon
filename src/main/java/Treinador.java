import java.util.ArrayList;
import java.util.List;

public class Treinador {
    private String nome;
    private int idade;
    private List<Pokemon> pokemons;

    public Treinador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.pokemons = new ArrayList<>();
    }

    public void capturarPokemon(Pokemon p) {
        pokemons.add(p);
        System.out.println(nome + " capturou " + p.getNome());
    }

    public void listarPokemons() {
        System.out.println("Pokémons de " + nome + ":");
        for (Pokemon p : pokemons) {
            System.out.println("- " + p.getNome() + " (Vida: " + p.getVida() + ")");
        }
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public String getNome() {
        return nome;
    }
}