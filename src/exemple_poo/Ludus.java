package exemple_poo;

import java.util.ArrayList;
import java.util.List;

public class Ludus<T> extends Guerrier {

    public List<T> ludus = new ArrayList<T>();

    public void ajouterGlad(T l) {
        this.ludus.add(l);
    }
}
