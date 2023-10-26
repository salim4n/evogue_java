
**Objectif :** Créer des classes internes, abstraites et anonymes en Java.

**Instructions :**

1. Créez une classe principale appelée "OuterClass" contenant une variable de classe nommée "outerVariable" initialisée à 10.

2. À l'intérieur de "OuterClass", créez une classe interne statique nommée "StaticInnerClass" avec une variable de classe "staticInnerVariable" initialisée à 20. Cette classe doit avoir une méthode statique appelée "displayStaticInner," qui affiche la valeur de "outerVariable" et "staticInnerVariable."

3. À l'intérieur de "OuterClass," créez une classe interne non statique (classe interne standard) appelée "InnerClass" avec une variable de classe "innerVariable" initialisée à 30. Cette classe doit avoir une méthode "displayInner" qui affiche la valeur de "outerVariable" et "innerVariable."

4. Créez une classe abstraite appelée "AbstractClass" avec une variable de classe "abstractVariable" initialisée à 40. Cette classe abstraite doit avoir une méthode abstraite appelée "displayAbstract."

5. Dans "OuterClass," créez une instance de "StaticInnerClass," "InnerClass," et une classe anonyme basée sur "AbstractClass."

6. Appelez les méthodes "displayStaticInner," "displayInner," et "displayAbstract" des instances créées dans l'étape précédente pour afficher les valeurs des variables de classe.

7. Compilez et exécutez le programme pour vérifier que les valeurs sont correctement affichées.

**Conseils :**

- Les classes internes peuvent être statiques (classes internes statiques) ou non statiques (classes internes standard). Les classes internes non statiques ont un accès aux membres de la classe externe.
- Les classes abstraites sont des classes qui ne peuvent pas être instanciées directement et peuvent contenir des méthodes abstraites.
- Les classes anonymes sont des classes sans nom qui sont déclarées et instanciées en même temps.

