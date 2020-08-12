package interfacesegr;

public class BasicIngredients {
    private int flour;
    private int egg;
    private int water;
    private int tomato;
    private int chicken;

    public BasicIngredients(int flour, int egg, int water, int tomato, int chicken) {
        this.flour = flour;
        this.egg = egg;
        this.water = water;
        this.tomato = tomato;
        this.chicken = chicken;
    }

    public int getFlour() {
        return flour;
    }

    public void setFlour(int flour) {
        this.flour = flour;
    }

    public int getEgg() {
        return egg;
    }

    public void setEgg(int egg) {
        this.egg = egg;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getTomato() {
        return tomato;
    }

    public void setTomato(int tomato) {
        this.tomato = tomato;
    }

    public int getChicken() {
        return chicken;
    }

    public void setChicken(int chicken) {
        this.chicken = chicken;
    }
}
