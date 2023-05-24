package items;

public class Sword extends Item{
    private int dmg;
    private float critChange;

    public Sword(String name, int dmg, float critChange) {
        super(name);
        this.dmg = dmg;
        this.critChange = critChange;
    }

    public Sword(String name, int qtd, int dmg, float critChange) {
        super(name, qtd);
        this.dmg = dmg;
        this.critChange = critChange;
    }
}
