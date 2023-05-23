import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Entidade player = new Entidade("Herói",100,1, 10);

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
                    batalhar(player);
            }

        } while (op != 0);


    }

    private static void batalhar(Entidade player) {
        Entidade inimigo = new Entidade("Cleber",100, 1,5);

        do {
            System.out.println("+--------+------+");
            System.out.printf("| %-6s | %-4s |%n", "Nome", "Vida");
            System.out.println("+--------+------+");
            System.out.printf("| %-6s | %-4d |%n", player.getNome(), player.getHp());
            System.out.printf("| %-6s | %-4d |%n", inimigo.getNome(), inimigo.getHp());
            System.out.println("+--------+------+");
            System.out.println();
            System.out.println("+--------+------+");
            System.out.printf("| %-6s | %-20s |%n", "");

            int op = sc.nextInt();
        } while (inimigo.getHp() > 0 || player.getHp() > 0);
    }
}