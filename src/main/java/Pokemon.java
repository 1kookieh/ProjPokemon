import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;
    private int vida;
    private List<Habilidade> habilidades;

    public Pokemon(String nome, String tipo, int nivel, int vida) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
        this.habilidades = new ArrayList<>();
    }

    public List<Habilidade> getHabilidades() {
        return habilidades;
    }

    public void atacar(Pokemon inimigo, Habilidade habilidade) {
        System.out.println(nome + " usou " + habilidade.getNome() + " em " + inimigo.getNome());
        inimigo.receberDano(habilidade.getPoder());
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
        System.out.println(nome + " recebeu " + dano + " de dano. Vida restante: " + vida);
    }

    public void evoluir() {
        nivel++;
        System.out.println(nome + " evoluiu para o nível " + nivel + "!");
    }

    public void adicionarHabilidade(Habilidade habilidade) {
        habilidades.add(habilidade);
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
