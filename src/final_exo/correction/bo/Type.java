package final_exo.correction.bo;

import final_exo.correction.bo.interface_obj.TypeAttaque;

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









