package facade;

public class MicroSoftPhone implements Phone {
    @Override
    public String build() {
        return "Build using Microsoft OS";
    }

    @Override
    public String getDescription() {
        return "Goggle Pixel XL";
    }
}
