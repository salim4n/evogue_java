
**Objectif :** Lire un fichier CSV et afficher son contenu dans la console.

**Instructions :**

- Un fichier CSV nommé "data.csv" avec les données suivantes se situe dans le dossier actuel :

```
integer, firstname, surname
15,Belle,Blakely
22,Perla,Lentz
98,Latoyia,Parish-Cazares
35,Kathie,Lackey
32,Tula,Prado
38,Amparo,Winn
86,Kandy,Shade
8,Kiersten,Alfaro
3,Toby,Cassidy
2,Rubie,Larson
```

- Créez un programme Java qui lit ce fichier CSV et affiche son contenu dans la console.

Voici le code de base pour accomplir cette tâche :

```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReaderExample {
    public static void main(String[] args) {
        String csvFile = "data.csv";
        String line = "";
        String csvDelimiter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvDelimiter);
                System.out.println("Nom : " + data[2] + ", Prénom : " + data[1] );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

**Conseils :**

- Assurez-vous que le fichier "data.csv" soit dans le même répertoire que votre programme Java, ou ajustez le chemin du fichier CSV dans le code en conséquence.
- Le code lit chaque ligne du fichier CSV, la divise en utilisant la virgule comme délimiteur, puis affiche les données dans la console.


