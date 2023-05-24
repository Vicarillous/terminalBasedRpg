public class Batalhar {
    private Entidade player;
    private Entidade inimigo;
    private boolean end;

    Batalhar(Entidade player) {
        this.player = player;
        configBatalha();
    }

    void configBatalha() {
        inimigo = new Entidade("Slime",14, 0, 1,6);
        playerTurn();
    }

    void playerTurn() {
        if (end) return;

        mostrarStatus();

        int op = Main.sc.nextInt();

        switch (op) {
            case 1:
                atacar(inimigo, player.getAtk());
                break;
            case 2:
                curar(player, 5);
                break;
        }
        enemyTurn();
    }
    void enemyTurn() {
        if (end) return;

        atacar(player, inimigo.getAtk());
        playerTurn();
    }

    void endBatalha(Entidade alvo) {
        end = true;
        System.out.printf("%s morreu%n", alvo.getNome());
    }

    void atacar(Entidade alvo, int danoPuro) {
        int danoReal = (int) (danoPuro - (alvo.getDef() * 0.5));
        if (danoReal < 1) {
            danoReal = 1;
        }
        boolean isMorto = alvo.tomarDano(danoReal);
        System.out.printf("%s recebeu %d de dano%n", alvo.getNome(), danoReal);

        delay();

        if (isMorto) {
            endBatalha(alvo);
        }
    }

    void curar(Entidade alvo, int cura) {
        alvo.setHp(alvo.getHp() + cura);
        System.out.printf("%s curou %d de vida%n", alvo.getNome(), cura);
        delay();
    }

    void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    void mostrarStatus() {
        System.out.println();
        System.out.println("+-------------+-------------+");
        System.out.printf("| %-11s | %-11s |%n", "Você:", "Monstro:");
        System.out.printf("| %s %-6d | %s %-6d |%n", "Atk:", player.getAtk(), "Atk:", inimigo.getAtk());
        System.out.printf("| %s %-6d | %s %-6d |%n", "Def:", player.getDef(), "Def:", inimigo.getDef());
        System.out.printf("| %s %-7d | %s %-7d |%n", "Hp:", player.getHp(), "Hp:", inimigo.getHp());
        System.out.println("+-------------+-------------+");
        System.out.println("Ações:");
        System.out.println("1 - Atacar");
        System.out.println("2 - Curar");
    }
}
