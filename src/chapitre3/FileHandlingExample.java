package chapitre3;

import java.io.*;

public class FileHandlingExample {

    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            while ((line = reader.readLine()) != null) {
                String upperCaseLine = line.toUpperCase();
                writer.write(upperCaseLine + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Opération de conversion en majuscules terminée avec succès.");
        } catch (FileNotFoundException e) {
            System.err.println("Le fichier d'entrée n'a pas été trouvé.");
        } catch (IOException e) {
            System.err.println("Une erreur s'est produite lors de la lecture ou de l'écriture du fichier.");
        }
    }
}
