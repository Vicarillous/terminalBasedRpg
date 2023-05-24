package items;

public class Armor extends Item{

    private int def;
    private int hp;
    public Armor(String name, int def, int hp) {
        super(name);
        this.def = def;
        this.hp = hp;
    }

    public Armor(String name, int qtd, int def, int hp) {
        super(name, qtd);
        this.def = def;
        this.hp = hp;
    }
}
