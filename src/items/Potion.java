package items;

public class Potion extends Item {
    private int heal;

    public Potion(String name, int heal) {
        super(name);
        this.heal = heal;
    }

    public Potion(String name, int qtd, int heal) {
        super(name, qtd);
        this.heal = heal;
    }
}
