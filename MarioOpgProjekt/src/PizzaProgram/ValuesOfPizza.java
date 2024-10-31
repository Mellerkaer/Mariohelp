package PizzaProgram;

import java.util.ArrayList;

public class ValuesOfPizza {
    public int pizzaNummer;
    public static int pizzaAntal = -1;
    public String navn;
    public String ingredienser;
    public int pris;
    public String valuta;
    public static ArrayList<ValuesOfPizza> menyPizza= new ArrayList<>();


//Det her er basis værdien for alle pizzaerne


    public ValuesOfPizza (String navn, String ingredienser, int pris){
        this.pizzaAntal++;
        this.pizzaNummer = pizzaAntal + 1;
        this.navn = navn;
        this.ingredienser = ingredienser;
        this.pris = pris;
        valuta ="kr";
        menyPizza.add(this);

    }

    public String pizzaToString (){
        return menyPizza.indexOf(this)+1 + ". " + this.navn + ": " + this.ingredienser + " ............ " + this.pris + " " + valuta;
    }

    public static void visAllePizzaer(){
        System.out.println("______________________________________________________________________________________________________________________________");
        for(ValuesOfPizza pizza : menyPizza){
            System.out.println(pizza.pizzaToString());
        }
        System.out.println("______________________________________________________________________________________________________________________________");

    }




}
