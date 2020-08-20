package decorator;

public class ChocolateCream extends CakeDecorator {

    public ChocolateCream(BirthdayCake cake) {
        super(cake);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithChocolateCream();
    }

    private String decorateWithChocolateCream() {
        return " with Chocolate cream ";
    }
}
