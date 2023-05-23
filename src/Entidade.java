public class Entidade {
    private String nome;
    private int hp;
    private int nivel;
    private int atkDmg;

    public Entidade(String nome, int hp, int nivel, int atkDmg) {
        this.nome = nome;
        this.hp = hp;
        this.nivel = nivel;
        this.atkDmg = atkDmg;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public void atacar(Entidade alvo) {
        alvo.setHp(alvo.getHp() - this.atkDmg);
    }
}
