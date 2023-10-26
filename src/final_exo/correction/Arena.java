package final_exo.correction;

import final_exo.correction.bo.Dresseur;
import final_exo.correction.bo.Pokemon;
import final_exo.correction.utils.Service;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;

public class Arena {

    public static void main(String... args) throws FileNotFoundException {

                gameLoop();
    }

    //Peut être ameliorer, refactoring, boucle de gameplay
    static void gameLoop(){

        Service service = new Service();
        ArrayList<Pokemon> filteredPokemon = service.populateTeam();
        ArrayList<Pokemon> equipRed = service.selectRandomPokemons(filteredPokemon, 3);
        ArrayList<Pokemon> equipBlue = service.selectRandomPokemons(filteredPokemon, 3);
        Dresseur Red = new Dresseur("Red", equipRed);
        Dresseur Blue = new Dresseur("Blue", equipBlue);

        System.out.println(Red);
        System.out.println(Red.getEquipe());
        System.out.println("-----------------------------------------------------");
        System.out.println(Blue);
        System.out.println(Blue.getEquipe());

        boolean isAnyPokemonAliveAtBlue = true;
        boolean isAnyPokemonAliveAtRed = true;

        do {
            // On vérifie à chaque tour que les Pokémon sont debout
            isAnyPokemonAliveAtBlue = checkAliveAll(Blue.getEquipe());
            isAnyPokemonAliveAtRed = checkAliveAll(Red.getEquipe());

            // Condition de victoire
            if (!isAnyPokemonAliveAtBlue){
                System.out.println("Red a gagné le combat!");
                System.out.println(equipRed.toString());
            }
            else if (!isAnyPokemonAliveAtRed){
                System.out.println("Blue a gagné le combat");
                System.out.println(equipBlue.toString());
            }
            // Le combat commence ou continue avec un nouveau Pokémon
            else {
                // Sélectionnez aléatoirement un Pokémon de chaque dresseur
                Pokemon redPokemon = Red.getRandomPokemon();
                Pokemon bluePokemon = Blue.getRandomPokemon();
                // Combat entre les Pokémon
                while (checkAliveOne(redPokemon) && checkAliveOne(bluePokemon)) {
                    // Faites combattre les Pokémon et réduisez leurs points de vie
                    int degat = 0;
                    Random random = new Random();
                    int randomIndex = random.nextInt(2);
                    if (randomIndex == 0) {
                        System.out.print(redPokemon.getName() + " attaque !");
                        degat = redPokemon.attaque(bluePokemon);
                        bluePokemon.setHp(bluePokemon.getHp() - degat);
                    } else {
                        System.out.print(bluePokemon.getName() + " attaque !");
                        degat = bluePokemon.attaque(redPokemon);
                        redPokemon.setHp(redPokemon.getHp() - degat);
                    }
                    System.out.println("------------------------------------");
                    System.out.println(redPokemon.toString());
                    System.out.println(bluePokemon.toString());
                    System.out.println("------------------------------------");
                }
            }
        } while (isAnyPokemonAliveAtBlue && isAnyPokemonAliveAtRed);
    }
    static boolean checkAliveAll(ArrayList<Pokemon> equipe) {
        for (Pokemon pokemon : equipe) {
            if (pokemon.getHp() > 0) {
                return true; // Au moins un Pokémon est encore debout.
            }
        }
        System.out.println(equipe.toString());
        return false; // Aucun Pokémon n'est encore debout.
    }

    static boolean checkAliveOne(Pokemon pokemon) {
        if(pokemon.getHp() > 0)
            return true;
        else {
            System.out.println(pokemon.toString());
            return false;
        }
    }







}
