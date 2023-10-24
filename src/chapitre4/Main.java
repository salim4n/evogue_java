package chapitre4;


public class Main {
    // La classe interne
    class InnerClass {
        public void print() {
            System.out.println("Ceci est une classe interne");
        }
    }

    // La classe abstraite
    abstract static class AbstractClass {
        abstract void display();
    }

    public static void main(String[] args) {
        // Créer une instance de la classe interne
        Main main = new Main();
        Main.InnerClass inner = main.new InnerClass();
        inner.print();

        // Utiliser la classe anonyme pour la classe abstraite
        AbstractClass ac = new AbstractClass() {
            void display() {
                System.out.println("Ceci est une classe anonyme");
            }
        };
        ac.display();
    }
}