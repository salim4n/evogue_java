# java_2

**Théorie**

1. **Liste** : Une liste est une interface qui étend Collection. Il contient des méthodes pour insérer et accéder aux éléments. Les éléments peuvent être insérés ou accessibles à l’aide de l’index. Les listes peuvent contenir des éléments en double. Par exemple, ArrayList, LinkedList, etc.
2. **Set** : Set est une interface qui étend Collection. Il est une collection non ordonnée et ne contient pas d’éléments en double. Par exemple, HashSet, TreeSet, etc.
3. **Map** : Map est une interface qui ne fait pas partie de la collection. Il stocke les valeurs sous forme de paires clé/valeur. Par exemple, HashMap, TreeMap, etc.
4. **Queue** : Queue est une interface qui étend Collection. Il est utilisé pour les opérations de type file d’attente, où les éléments sont ajoutés à la fin et supprimés du début. Par exemple, PriorityQueue, Deque, etc.

**Exercice pratique**

Voici un exemple de programme qui utilise différents types de collections pour stocker et manipuler des données :

```java
import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // Liste
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("List: " + list);

        // Manipulation de la liste
        list.remove("Banana");
        System.out.println("List après suppression : " + list);

        // Set
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Horse");
        System.out.println("Set: " + set);

        // Manipulation de l'ensemble
        set.remove("Cat");
        System.out.println("Set après suppression : " + set);

        // Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Paris");
        map.put(2, "London");
        map.put(3, "New York");
        System.out.println("Map: " + map);

        // Manipulation de la carte
        map.put(4, "Berlin");
        System.out.println("Map après ajout : " + map);

        // Queue
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        System.out.println("Queue: " + queue);

        // Manipulation de la file d'attente
        String nextTask = queue.poll();
        System.out.println("Prochaine tâche : " + nextTask);
    }
}
```

Ce programme crée une liste de fruits, un ensemble d’animaux, une carte de villes et une file d’attente de tâches. Chaque collection est ensuite imprimée à l’écran.