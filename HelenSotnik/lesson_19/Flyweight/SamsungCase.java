package flyweight;

public class SamsungCase implements PhoneCase {
    private String caseColor;

    public SamsungCase(String caseColor) {
        this.caseColor = caseColor;
    }

    @Override
    public void produce() {
        System.out.println("Samsung case to produce. Color: " + caseColor);
    }
}
