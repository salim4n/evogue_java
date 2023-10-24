package chapitre2;

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
