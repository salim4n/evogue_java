package final_exo.correction.bo;

import final_exo.correction.bo.interface_obj.TypeAttaque;
import final_exo.correction.bo.interface_obj.TypeFeu;

public class TypeFeuImpl implements TypeFeu, TypeAttaque {
    @Override
    public void attaquer() {
        // Implémentez ici le comportement d'attaque pour le type Feu
        System.out.println("Attaque de type Feu !");
        // Ajoutez ici le code spécifique à l'attaque de type Feu
    }
}
