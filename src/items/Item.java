package items;

public class Item {
    private String name;
    private int qtd;

    public Item(String name) {
        this.name = name;
        this.qtd = 1;
    }

    public Item(String name, int qtd) {
        this.name = name;
        this.qtd = qtd;
    }

    public String getName() {
        return name;
    }

    public int getQtd() {
        return qtd;
    }
}
