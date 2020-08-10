package Liskov;

import java.sql.SQLOutput;

public class Bar {
    public static void main(String[] args) {
        Mohito mohito = new Mohito();
        mohito.setAlcohol(true);
        mohito.makeDrink();
        Lemonade lemonade = new Lemonade();
        lemonade.setFlavour("berry");
        lemonade.makeDrink();
    }
}

interface Drink {
    void makeDrink();
}

class Mohito implements Drink {
    private boolean alcohol;

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    @Override
    public void makeDrink() {
        if (alcohol == true) {
            System.out.println("Your alcohol mohito!");
        } else {
            System.out.println("Your non-alcohol mohito!");
        }
    }
}

class Lemonade implements Drink {
    private String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public void makeDrink() {
        System.out.println("Your " + flavour + " lemonade!");
    }
}
