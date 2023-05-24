import items.Item;

import java.util.ArrayList;
import java.util.List;

public class Player extends Entidade{

    private List<Item> inventario = new ArrayList<Item>();
    public Player(String nome, int hp, int def, int nivel, int atk, List<Item> inventario) {
        super(nome, hp, def, nivel, atk);
        this.inventario = inventario;
    }

    public List<Item> getInventario() {
        return inventario;
    }
}
