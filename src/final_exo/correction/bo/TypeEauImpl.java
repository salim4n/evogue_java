package final_exo.correction.bo;

import final_exo.correction.bo.interface_obj.TypeAttaque;
import final_exo.correction.bo.interface_obj.TypeEau;

public class TypeEauImpl implements TypeEau, TypeAttaque {
    @Override
    public void attaquer() {
        // Implémentez ici le comportement d'attaque pour le type Eau
        System.out.println("attaqye de type Eau !");


    }
}
