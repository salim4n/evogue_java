# Exercice : Création d'un Jeu Pokémon en Java

## Objectif
Créez un jeu Pokémon en utilisant Java. Le jeu doit permettre à deux dresseurs de s'affronter avec leurs Pokémon.

## Instructions (A suivre ou non c'est votre choix personnel)

1. Créez les classes nécessaires pour représenter les éléments suivants :

    - `Pokemon` : Une classe de base pour tous les Pokémon. Elle doit avoir des propriétés telles que le nom, le type, les points de vie, l'attaque, la défense, etc. Chaque type de Pokémon (par exemple, Pikachu, Charmander) hérite de cette classe et implémente ses propres méthodes d'attaque spécifiques.

    - Interfaces de types (`TypeFeu`, `TypeEau`, `TypePlante`) : Chaque interface définit les méthodes d'attaque spécifiques à un type de Pokémon. Chaque classe de Pokémon (par exemple, `Pikachu`, `Charmander`) peut implémenter les interfaces correspondant à son type.

    - `Dresseur` : Une classe qui représente un dresseur. Elle doit contenir une liste de Pokémon (maximum 3) et avoir un nom.

    - `Arene` : Une classe qui gère les combats entre deux dresseurs. Elle doit contrôler le déroulement du combat, y compris les tours, les actions, etc.

2. Implémentez la logique du combat entre les Pokémon des dresseurs. Les Pokémon se battent en utilisant leurs méthodes d'attaque spécifiques en fonction de leur type.

3. Créez une interface utilisateur en console qui permet aux joueurs de choisir leurs actions, de sélectionner des Pokémon, et de suivre le déroulement du combat.

4. Suivez le nombre de victoires et de pertes pour chaque dresseur et annoncez le vainqueur à la fin de chaque combat.

5. Créez une boucle principale qui gère le déroulement du jeu, y compris la création de dresseurs, la configuration des Pokémon, le combat et l'affichage des résultats.

## Note

- Assurez-vous d'utiliser les principes de la programmation orientée objet, tels que l'héritage, les interfaces, les collections, etc., pour organiser votre code de manière efficace.

- Ce projet est complexe et demande une planification soignée. Prenez le temps de concevoir votre structure de classe et votre logique de jeu avant de commencer à coder.

- Vous avez un csv à disposition dans le package data, ceci est optionnel mais vous pouvez faire une liste de pokemon via ce csv.

Amusez-vous bien et bon codage !
