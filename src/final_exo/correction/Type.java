package final_exo.correction;

public enum Type {
    EAU(new TypeEauImpl()),
    FEU(new TypeFeuImpl()),
    PLANTE(new TypePlanteImpl());

    private final TypeAttaque typeAttaque;

    Type(TypeAttaque typeAttaque) {
        this.typeAttaque = typeAttaque;
    }

    public TypeAttaque getTypeAttaque() {
        return typeAttaque;
    }
}









