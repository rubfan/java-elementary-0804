package decorator;

public abstract class CakeDecorator implements BirthdayCake {
    private BirthdayCake cake;

    public CakeDecorator(BirthdayCake cake) {
        this.cake = cake;
    }

    @Override
    public String decorate() {
        return cake.decorate();
    }
}
