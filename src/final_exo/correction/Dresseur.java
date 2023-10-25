package final_exo.correction;

import java.util.ArrayList;

public class Dresseur {
    private String nom;
    private ArrayList<Pokemon> equipe;

    public Dresseur(String nom, ArrayList<Pokemon> equipe) {
        this.nom = nom;
        this.equipe = equipe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Pokemon> getEquipe() {
        return equipe;
    }

    public void setEquipe(ArrayList<Pokemon> equipe) {
        this.equipe = equipe;
    }


    @Override
    public String toString() {
        return "Dresseur{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
