package PizzaProgram;

import java.util.Scanner;

public class Pizza {

Ændremenykort change = new Ændremenykort();
MakeOrder alexander = new MakeOrder("");

//herinde bliver de instanceret,

    public Pizza (){


    }
    ValuesOfPizza margaritha = new ValuesOfPizza("Margaritha", "Tomatsauce og ost", 65);
    ValuesOfPizza pepperoni = new ValuesOfPizza("Pepperoni", "Tomatsauce, ost og pepperoni", 75);
    ValuesOfPizza hawaii = new ValuesOfPizza("Hawaii", "Tomatsauce, ost, skinke og ananas", 70);
    ValuesOfPizza capriccioa = new ValuesOfPizza("Capriccioa", "Tomatsauce, mozzarella, skinke, champignon", 85);
    ValuesOfPizza quattroStagioni= new ValuesOfPizza("Quattro Stagioni", "Tomatsauce, mozzarella, skinke, champignon, artiskok, oliven", 90 );
    ValuesOfPizza vesuvio = new ValuesOfPizza("Vesuvio", "Tomatsauce, mozzarella, skinke", 80 );
    ValuesOfPizza diavola = new ValuesOfPizza("Diavola", "Tomatsauce, mozzarella, spicy salami, chili", 90 );
    ValuesOfPizza prosciuttoEFunghi = new ValuesOfPizza("Prosciutto e Funghi", " Tomatsauce, mozzarella, skinke, svampe", 85 );
    ValuesOfPizza marinara = new ValuesOfPizza("Marinara", "Tomatsauce, hvidløg, oregano", 65);
    ValuesOfPizza vegetariana = new ValuesOfPizza("Vegetariana", "Tomatsauce, mozzarella, peberfrugt, løg, zucchini, aubergine", 85);
    ValuesOfPizza quattroFormaggi= new ValuesOfPizza("Quattro Formaggi", "Tomatsauce, mozzarella, gorgonzola, parmesan, ricotta", 95);
    ValuesOfPizza tonnoECipolla= new ValuesOfPizza("Tonno e Cipolla", "Tomatsauce, mozzarella, tun, løg", 90);
    ValuesOfPizza bBQChicken= new ValuesOfPizza("BBQ Chicken", " BBQ sauce, kylling, mozzarella, løg", 90);
    ValuesOfPizza bianca = new ValuesOfPizza("Bianca", "Creme fraiche, mozzarella, kartoffel, rosmarin", 85);
    ValuesOfPizza parma = new ValuesOfPizza("Parma", "Tomatsauce, mozzarella, parmaskinke, rucola, parmesan", 95);
    ValuesOfPizza calzone = new ValuesOfPizza("Calzone", "Tomatsauce, mozzarella, skinke (indbagt)", 90);
    ValuesOfPizza meatLovers = new ValuesOfPizza("Meat Lovers", "Tomatsauce, mozzarella, pepperoni, skinke, bacon, oksekød", 95);
    ValuesOfPizza salami = new ValuesOfPizza("Salami", "Tomatsauce, mozzarella, salami", 85);
    ValuesOfPizza bolognese= new ValuesOfPizza("Bolognese", "Tomatsauce, mozzarella, bolognese-kød", 85);
    ValuesOfPizza tartufo = new ValuesOfPizza("Tartufo", "Tomatsauce, mozzarella, trøffelsauce, svampe", 100);
    ValuesOfPizza funghi = new ValuesOfPizza("Funghi", "Tomatsauce, mozzarella, svampe", 80);
    ValuesOfPizza gorgonzolaENoci = new ValuesOfPizza("Gorgonzola e Noci", "Tomatsauce, mozzarella, gorgonzola, valnødder", 90);
    ValuesOfPizza fruttiDiMare = new ValuesOfPizza("Frutti di Mare", "Tomatsauce, mozzarella, skaldyr, hvidløg", 100);
    ValuesOfPizza salsiccia = new ValuesOfPizza("Salsiccia", "Tomatsauce, mozzarella, italiensk pølse, peber", 90);
    ValuesOfPizza carbonara = new ValuesOfPizza("Carbonara", "Creme fraiche, mozzarella, bacon, æg, parmesan", 95);
    ValuesOfPizza pesto = new ValuesOfPizza("Pesto", "Pesto, mozzarella, tomater, pinjekerner", 85);
    ValuesOfPizza polloEPesto = new ValuesOfPizza("Pollo e Pesto", "Tomatsauce, mozzarella, kylling, pesto", 90);
    ValuesOfPizza gamberetti = new ValuesOfPizza("Gamberetti", "Tomatsauce, mozzarella, rejer, hvidløg", 95);
    ValuesOfPizza speckEBrie= new ValuesOfPizza("Speck E Brie", "Tomatsauce, mozzarella, speck (røget skinke), brie", 100);
    ValuesOfPizza napolitana = new ValuesOfPizza("Napolitana", "Tomatsauce, mozzarella, ansjoser, oliven, kapers", 90);






//her foregår menuen, altså kommandoerne fra 1-7
    OpretOrdre ordre = new OpretOrdre();

    public void kommandoer(){
        boolean kmOn = true;
        while(kmOn) {
            System.out.println("\nSkriv et tal fra 1-7 ud fra den kommando du vil udføre.");
            menyMuligheder();
            Scanner sc = new Scanner(System.in);
            int scInput = sc.nextInt();
            if (scInput == 1) {
                ValuesOfPizza.visAllePizzaer();
            } else if (scInput == 2) {
                ordre.tilføjPizza();
            } else if (scInput == 3) {
                ordre.visOrdrelinje();
            } else if (scInput == 4) {
                RedigerOrdre rediger = new RedigerOrdre(ordre);
                rediger.redigerOrdre();
            } else if (scInput == 5) {
                ordre.finishOrder();
            } else if (scInput == 6) {
                System.out.println("Du har valgt adminstrativt arbejde:" +
                        " \nTast 1 for dagens omsætning, \nTast 2 for dagens tab, \nTast 3 for at ændre dagens menykort");
                Scanner scAdmin = new Scanner(System.in);
                int scAdminInput = scAdmin.nextInt();
                if(scAdminInput == 1){
                    ordre.omsætning();
                } else if (scAdminInput == 2){
                    ordre.dagensTab();
                } else if (scAdminInput == 3){
                    change.ændreMenukort();
                } else {
                    System.out.println("Det forstod jeg ikke, skriv et tal mellem 1-3");
                }


            } else if (scInput == 7){
                System.out.println("Du har valgt at slukke for programmet");
                kmOn = false;
            }else {
                System.out.println("Jeg forstod ikke hvad du ville, prøve at indtaste et nyt nummer mellem 1-8.");
            }
        }
    }
    public void menyMuligheder(){
        System.out.println( "" +
                "\n1. Vis liste over pizza" +
                "\n2. Opret ny order" +
                "\n3. Se nuværende ordrer" +
                "\n4. Rediger ordre" +
                "\n5. Færdiggør ordre" +
                "\n6. Adminastrativt arbejde" +
                "\n6A.Se dagens omsætning" +
                "\n6B.Se dagens tab" +
                "\n6C.Ændre menyKortet" +
                "\n7. Sluk for programmet");
    }
}
