public class Batalha {
    private Treinador treinador1;
    private Treinador treinador2;

    public Batalha(Treinador t1, Treinador t2) {
        this.treinador1 = t1;
        this.treinador2 = t2;
    }

    public void iniciar() {
        System.out.println("A batalha começou entre " + treinador1.getNome() + " e " + treinador2.getNome());
    }

    public void registrarTurno(Pokemon atacante, Habilidade habilidade, Pokemon alvo) {
        habilidade.usar(atacante, alvo);
    }
}