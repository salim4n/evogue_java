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

    // Petit jeu sympa, nous avons ici une grosse conditionnel, gérable actuellement car seulement trois type.
    // Objectif : Nous comptons ajouter plusieurs autres type au Pokemon, donc :
    // Trouver un moyen d'éviter un gros embouteillage de condition imbriquées pour
    // Implementer notre solutions de gestion de degat selon le type du pokemon et son adversaire
    // Indice : TypeEauImpl, TypeFeuImpl, TypePlanteImpl ...
    public int attaque(Pokemon pokemonAdverse) {

        int degat = 0;
        if (this.getType().equals(Type.WATER)) {
            System.out.println("Attaque Pistolet à O !!!");
            if (pokemonAdverse.getType().equals(Type.WATER))
                degat = 10;
            if (pokemonAdverse.getType().equals(Type.GRASS))
                System.out.println("Ce n'est pas très efficace...");
                degat = 5;
            if (pokemonAdverse.getType().equals(Type.FIRE))
                System.out.println("C'est très efficace !");
                degat = 15;
        }
        if (this.getType().equals(Type.GRASS)) {
            System.out.println("Attaque Fouet Liane !!!");
            if (pokemonAdverse.getType().equals(Type.GRASS))
                degat = 10;
            if (pokemonAdverse.getType().equals(Type.FIRE))
                System.out.println("Ce n'est pas très efficace...");
                degat = 5;
            if (pokemonAdverse.getType().equals(Type.WATER))
                System.out.println("C'est très efficace !");
                degat = 15;
        }
        if (this.getType().equals(Type.FIRE)) {
            System.out.println("Attaque Lance Flammes !!!");
            if (pokemonAdverse.getType().equals(Type.FIRE))
                degat = 10;
            if (pokemonAdverse.getType().equals(Type.FIRE))
                System.out.println("Ce n'est pas très efficace...");
                degat = 5;
            if (pokemonAdverse.getType().equals(Type.GRASS))
                System.out.println("C'est très efficace !");
                degat = 15;
        }
        System.out.println("nb degats :" + degat);
        return degat;
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
