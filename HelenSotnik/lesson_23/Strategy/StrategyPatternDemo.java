package strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {

        Context context = new Context(new OwnerBonus(50000));
        System.out.println("Total Owner Bonus: " + context.executeStrategy(450000, 73));

        context = new Context(new ExecutiveDirectorBonus(10000));
        System.out.println("Total Executive Director Bonus: " + context.executeStrategy(45000, 15));

        context = new Context(new SeniorAssociateBonus(5000, 2000));
        System.out.println("Total Senior associate Bonus: " + context.executeStrategy(450000, 10));

        context = new Context(new JuniorAssociateBonus());
        System.out.println("Total Junior associate Bonus: " + context.executeStrategy(450000, 2));
    }
}
