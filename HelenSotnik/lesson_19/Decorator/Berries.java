package decorator;

public class Berries extends CakeDecorator {
    public Berries(BirthdayCake cake) {
        super(cake);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBerries();
    }

    private String decorateWithBerries() {
        return " with Chocolate cream ";
    }
}
