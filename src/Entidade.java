public class Entidade {
    private String nome;
    private int hp;
    private int def;
    private int nivel;
    private int atk;

    public Entidade(String nome, int hp, int def, int nivel, int atk) {
        this.nome = nome;
        this.hp = hp;
        this.def = def;
        this.nivel = nivel;
        this.atk = atk;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public boolean tomarDano(int dmg) {
        this.hp -= dmg;

        if (hp <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
