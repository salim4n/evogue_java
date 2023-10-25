package final_exo.correction;

public enum Type {
    WATER(new TypeEauImpl()),
    FIRE(new TypeFeuImpl()),
    GRASS(new TypePlanteImpl()),
    ;

    private final TypeAttaque typeAttaque;

    Type(TypeAttaque typeAttaque) {
        this.typeAttaque = typeAttaque;
    }

    public TypeAttaque getTypeAttaque() {
        return typeAttaque;
    }
}









