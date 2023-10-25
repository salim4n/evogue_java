package final_exo.correction;

public class Pokemon  {
    private String name;
    private Enum type;
    private int hp;


    public Pokemon(String name, Enum type, int hp) {
        this.name = name;
        this.type = type;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getType() {
        return type;
    }

    public void setType(Enum type) {
        this.type = type;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", hp=" + hp +
                '}';
    }
}
