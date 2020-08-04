package facade;

public class Samsung implements Phone {
    @Override
    public String build() {
        return "Build using Android 7.0";
    }

    @Override
    public String getDescription() {
        return "Samsung Galaxy S20";
    }
}
