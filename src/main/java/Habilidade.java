public class Habilidade {
    private String nome;
    private int poder;
    private String tipo;

    public Habilidade(String nome, int poder, String tipo) {
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
    }

    public void usar(Pokemon atacante, Pokemon alvo) {
        atacante.atacar(alvo, this);
    }

    public String getNome() {
        return nome;
    }

    public int getPoder() {
        return poder;
    }
}