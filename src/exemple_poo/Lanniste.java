package exemple_poo;

import java.util.ArrayList;
import java.util.List;

public class Lanniste extends Humain {

    protected int monnaie;
    protected List<Guerrier>ludus;

    public Lanniste() {

    }

    public Lanniste(String name, int monnaie, List<Guerrier>ludus) {
        super();
        this.monnaie = monnaie;
        ludus = new ArrayList<>();

    }

    public Lanniste(String name) {
        super();
    }

    public int getMonnaie() {
        return monnaie;
    }

    public void setMonnaie(int monnaie) {
        this.monnaie = monnaie;
    }

    public List<Guerrier> getLudus() {
        return ludus;
    }

    public void setLudus(List<Guerrier> ludus) {
        this.ludus = ludus;
    }

    @Override
    public String toString() {
        return "Lanniste [monnaie=" + monnaie + ", ludus=" + ludus + "]";
    }





}
