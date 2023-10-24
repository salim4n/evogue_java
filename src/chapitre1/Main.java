package chapitre1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une chaîne de caractères :");
        String input = scanner.nextLine();

        // Manipulation de la chaîne
        String upperCase = input.toUpperCase();
        int length = input.length();
        String reversed = new StringBuilder(input).reverse().toString();

        // Affichage des résultats
        System.out.println("La chaîne en majuscules : " + upperCase);
        System.out.println("La longueur de la chaîne : " + length);
        System.out.println("La chaîne inversée : " + reversed);

        scanner.close();
    }
}
