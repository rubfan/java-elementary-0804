package facade;

public class IPhone implements Phone {
    @Override
    public String build() {
        return "Build using iOS 13";
    }

    @Override
    public String getDescription() {
        return "Iphone 11 Pro";
    }
}
