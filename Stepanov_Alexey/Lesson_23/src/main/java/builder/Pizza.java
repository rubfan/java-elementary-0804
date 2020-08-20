package builder;

public class Pizza {
    private String base;
    private String sauce;
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean pineapple;
    private boolean chicken;

    public Pizza(String base, String sauce, int size, boolean cheese, boolean pepperoni, boolean pineapple, boolean chicken) {
        this.base = base;
        this.sauce = sauce;
        this.size = size;
        this.cheese = cheese;
        this.pepperoni = pepperoni;
        this.pineapple = pineapple;
        this.chicken = chicken;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public void setPineapple(boolean pineapple) {
        this.pineapple = pineapple;
    }

    public boolean isChicken() {
        return chicken;
    }

    public void setChicken(boolean chicken) {
        this.chicken = chicken;
    }
}
