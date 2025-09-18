public class ItemCura extends Item {
    private int quantidadeCura;

    public ItemCura(String nome, String efeito, int quantidadeCura) {
        super(nome, efeito);
        this.quantidadeCura = quantidadeCura;
    }

    @Override
    public void aplicar(Pokemon p) {
        p.setVida(p.getVida() + quantidadeCura);
        System.out.println("Item de cura aplicado! " + p.getNome() + " recuperou " + quantidadeCura + " de vida.");
    }
}