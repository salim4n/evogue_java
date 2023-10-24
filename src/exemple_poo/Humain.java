package exemple_poo;

public abstract class Humain {

    protected String name;

    public Humain(String name) {
        this.name = name;
    }

    public Humain() {

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Humains [name=" + name + "]";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void combattre(Guerrier adversaire) {

    }

}