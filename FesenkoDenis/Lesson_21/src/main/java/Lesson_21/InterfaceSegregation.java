package Lesson_21;

interface McDonalds {
    int priceFrie = 1;
    int priceHam = 2;

    boolean frenchFries();

    boolean hamburger();

    String cost();
}

interface McDonaldsWithWater extends McDonalds {
    int priceFanta = 1;

    boolean frenchFries();

    boolean hamburger();

    boolean fanta();

    String cost();
}

public class InterfaceSegregation {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.cost());

        OrderNoWater o2 = new OrderNoWater();
        System.out.println(o2.cost());
    }
}

class Order implements McDonaldsWithWater {
    @Override
    public boolean frenchFries() {
        return true;
    }

    @Override
    public boolean hamburger() {
        return true;
    }

    @Override
    public boolean fanta() {
        return true;
    }

    public int sum() {
        return priceFanta + priceHam + priceFrie;
    }

    @Override
    public String cost() {
        return "Price with water: " + sum();
    }
}

class OrderNoWater implements McDonalds {

    @Override
    public boolean frenchFries() {
        return true;
    }

    @Override
    public boolean hamburger() {
        return true;
    }

    public int sum() {
        return priceHam + priceFrie;
    }

    @Override
    public String cost() {
        return "Price without water: " + sum();
    }
}
