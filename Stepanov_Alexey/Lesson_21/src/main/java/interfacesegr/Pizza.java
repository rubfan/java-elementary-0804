package interfacesegr;

public class Pizza {
    private BasicIngredients ingredients;
    private int size;
    private String name;

    public Pizza(BasicIngredients ingredients, int size, String name) {
        this.ingredients = ingredients;
        this.size = size;
        this.name = name;
    }

    public BasicIngredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(BasicIngredients ingredients) {
        this.ingredients = ingredients;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
