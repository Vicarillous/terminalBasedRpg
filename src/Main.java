import items.Armor;
import items.Item;
import items.Potion;
import items.Sword;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        List<Item> inventario = new ArrayList<Item>();
        inventario.add(new Sword("Espada de cobre", 2, 7, 0.04f));
        inventario.add(new Armor("Armadura de couro", 2, 5));
        inventario.add(new Potion("Poção simples", 5));

        Player player = new Player("Você",20, 0,1, 7, inventario);

        int op;
        do {
            System.out.println("" +
                    "--------------------------------\n" +
                    "1 - Batalhar\n" +
                    "2 - Abrir inventário\n" +
                    "0 - Sair\n" +
                    "--------------------------------\n");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    new Batalhar(player);
                    break;
                case 2:
                    for(Item item: player.getInventario()) {
                        System.out.printf("%d x %s%n", item.getQtd(), item.getName());
                    }
                    break;
            }

        } while (op != 0);
    }
}