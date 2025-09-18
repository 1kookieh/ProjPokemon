public class ItemEvolucao extends Item {

    public ItemEvolucao(String nome, String efeito) {
        super(nome, efeito);
    }

    @Override
    public void aplicar(Pokemon p) {
        p.evoluir();
        System.out.println("Item de evolução aplicado! " + p.getNome() + " evoluiu.");
    }
}