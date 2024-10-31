package PizzaProgram;

import java.util.Scanner;

public class RedigerOrdre1 {

    private OpretOrdre ordre;

    // Constructor modtager eksisterende ordre
    public RedigerOrdre1(OpretOrdre ordre) {
        this.ordre = ordre;
    }

    // Metode til at redigere en ordre
    public void redigerOrdre() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vælg en ordre at redigere:");
        ordre.visOrdrelinje(); // Viser eksisterende ordrer

        int valgtOrdreIndex = scanner.nextInt() - 1;  // Få ordre valgt af brugeren

        // Tjekker om indekset er gyldigt
        if (valgtOrdreIndex < 0 || valgtOrdreIndex >= OpretOrdre.ordreLinje1.size()) {
            System.out.println("Ugyldigt ordrenummer, prøv igen.");
            return;
        }

        // Viser menu for redigering af ordren
        System.out.println("Hvad vil du redigere i ordren?" +
                "\n1. Ændre antal af en pizza" +
                "\n2. Tilføj en ny pizza til ordren" +
                "\n3. Fjern en pizza fra ordren");

        int valg = scanner.nextInt();

        switch (valg) {
            case 1:  // Ændre antal af en pizza
                redigerPizzaAntal(valgtOrdreIndex);
                break;

            case 2:  // Tilføj ny pizza til ordren
                ordre.tilføjPizza();  // Genbruger tilføjPizza metoden
                break;

            case 3:  // Fjern en pizza fra ordren
                fjernPizza(valgtOrdreIndex);
                break;

            default:
                System.out.println("Ugyldigt valg, prøv igen.");
                break;
        }
    }

    private void redigerPizzaAntal(int ordreIndex) {
        Scanner scanner = new Scanner(System.in);

        // Viser de pizzaer i ordren, som kan redigeres
        System.out.println("Pizzaer i ordren: " + OpretOrdre.pizzaOrdreNavne);

        System.out.println("Indtast nummeret på pizzaen du vil ændre antallet af:");
        int pizzaIndex = scanner.nextInt() - 1;

        if (pizzaIndex < 0 || pizzaIndex >= OpretOrdre.pizzaOrdreAntalArr.size()) {
            System.out.println("Ugyldigt valg, prøv igen.");
            return;
        }

        System.out.println("Indtast det nye antal for " + OpretOrdre.pizzaOrdreNavne.get(pizzaIndex) + ":");
        int nytAntal = scanner.nextInt();
        OpretOrdre.pizzaOrdreAntalArr.set(pizzaIndex, nytAntal);
        System.out.println("Antallet er nu opdateret.");
    }

    private void fjernPizza(int ordreIndex) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vælg pizzaen, der skal fjernes fra ordren:");
        for (int i = 0; i < OpretOrdre.pizzaOrdreNavne.size(); i++) {
            System.out.println((i + 1) + ": " + OpretOrdre.pizzaOrdreNavne.get(i));
        }

        int pizzaIndex = scanner.nextInt() - 1;

        if (pizzaIndex < 0 || pizzaIndex >= OpretOrdre.pizzaOrdreNavne.size()) {
            System.out.println("Ugyldigt valg, prøv igen.");
            return;
        }

        // Fjerner pizza og dens tilhørende pris og antal fra listerne
        OpretOrdre.pizzaOrdreNavne.remove(pizzaIndex);
        OpretOrdre.pizzaOrdrePris.remove(pizzaIndex);
        OpretOrdre.pizzaOrdreAntalArr.remove(pizzaIndex);

        System.out.println("Pizzaen er blevet fjernet fra ordren.");
    }
}