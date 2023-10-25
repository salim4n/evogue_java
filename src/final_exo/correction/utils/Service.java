package final_exo.correction.utils;

import final_exo.correction.bo.Pokemon;
import final_exo.correction.bo.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Service {

     public ArrayList<Pokemon> populateTeam() {
        CSVReader reader = new CSVReader();
        List<Pokemon> allPokemon = new ArrayList<>();
        List<Pokemon> filteredPokemon = new ArrayList<>();
        List<String> data = reader.readCsv("src/final_exo/data/pokemon.csv");
        for (String line : data) {
            String[] rowData = line.split(",");
            //méthode trim obligatoire
            // car sans == " Grass". (espace, il faut suppr l'espace)
            String type = rowData[2].trim();
            // Vérifiez si le type est "Grass," "Fire," ou "Water"
            if ("Grass".equals(type) || "Fire".equals(type) || "Water".equals(type)){
                // Créez un objet Pokemon à partir des données de la ligne et ajoutez-le à la liste filtrée.
                Pokemon pokemon = createPokemonFromData(rowData);
                filteredPokemon.add(pokemon);
            }
        }
        return (ArrayList<Pokemon>) filteredPokemon;
    }

     Pokemon createPokemonFromData( String[] rowData){
        // S'assurez au préalable des bonnes données dans le csv.
        String name = rowData[1].trim();
        String stringtype = rowData[2].trim();
        int lifePool = Integer.parseInt(rowData[4].trim());

        // Convertir la chaîne de caractères du type en enum PokemonType.
        Type type = null;
        try {
            type = Type.valueOf(stringtype.toUpperCase());
        } catch (IllegalArgumentException e) {

            e.toString();
            System.out.println("Allo Houston, on a un problème ...");
        }

        // Créez un objet Pokemon à partir des données.
        Pokemon pokemon = new Pokemon(name, type, lifePool);
        return pokemon;
    }

     public ArrayList<Pokemon> selectRandomPokemons(ArrayList<Pokemon> pokemons, int count) {
        Random random = new Random();
        ArrayList<Pokemon> selectedPokemons = new ArrayList<>();
        int totalPokemons = pokemons.size();

        count = Math.min(count, totalPokemons);

        for (int i = 0; i < count; i++) {
            int randomIndex = random.nextInt(totalPokemons);
            Pokemon selectedPokemon = pokemons.get(randomIndex);
            selectedPokemons.add(selectedPokemon);

            // Supprimer le Pokémon sélectionné de la liste pour éviter les doublons.
            pokemons.remove(randomIndex);
            totalPokemons--;
        }

        return selectedPokemons;
    }
}
