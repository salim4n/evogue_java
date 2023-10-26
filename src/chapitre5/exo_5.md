
**Objectif :** Utiliser des annotations en Java pour documenter et gérer le comportement des méthodes.

**Instructions :**

1. Créez une annotation personnalisée appelée "MethodInfo." Cette annotation doit avoir les éléments suivants :
    - "author" : une chaîne de caractères représentant l'auteur de la méthode.
    - "date" : une chaîne de caractères représentant la date de création de la méthode.
    - "version" : un double représentant la version de la méthode.

2. Créez une classe appelée "MyClass" avec plusieurs méthodes. Ajoutez l'annotation "MethodInfo" à certaines de ces méthodes pour documenter les informations de l'auteur, la date et la version de la méthode.

3. Écrivez une méthode qui utilise la réflexion pour analyser la classe "MyClass" et afficher les informations des méthodes annotées, y compris l'auteur, la date et la version.

4. Créez une instance de "MyClass" et appelez la méthode de réflexion pour afficher les informations des méthodes annotées.

5. Compilez et exécutez le programme pour vérifier que les informations des méthodes annotées sont correctement affichées.

**Conseils :**

- Pour créer une annotation personnalisée, utilisez l'annotation `@interface` suivi du nom de l'annotation, par exemple, `@interface MethodInfo`.
- Pour accéder aux annotations d'une classe ou d'une méthode, utilisez la réflexion en Java en utilisant les classes `Class` et `Method`.
