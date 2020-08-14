public class AbstractFactory {
    public static void main(String[] args) {
        AbstractGarden garden = new ConcreteGarden();
        AbstractProductVegetable vegetable = garden.getVeggie("Cucumber");
        vegetable.putInSalad();
    }
}

interface AbstractGarden {
    AbstractProductVegetable getVeggie(String vegetable);
}

class ConcreteGarden implements AbstractGarden {

    @Override
    public AbstractProductVegetable getVeggie(String vegetable) {
        Tomato t = new Tomato();
        Cucumber c = new Cucumber();
        Pepper p = new Pepper();
        if (vegetable.equals("Tomato")) {
            return new Tomato();
        } else if (vegetable.equals("Cucumber")) {
            return new Cucumber();
        } else if (vegetable.equals("Pepper")) {
            return new Pepper();
        } else {
            System.out.println("Cannot get this veggie now :)");
        }
        return null;
    }
}

interface AbstractProductVegetable {
    void putInSalad();
}

class Tomato implements AbstractProductVegetable {
    @Override
    public void putInSalad() {
        System.out.println("Let's cut this tomato!");
    }
}

class Cucumber implements AbstractProductVegetable {
    @Override
    public void putInSalad() {
        System.out.println("Let's cut this cucumber!");
    }
}

class Pepper implements AbstractProductVegetable {
    @Override
    public void putInSalad() {
        System.out.println("Let's cut this pepper!");
    }
}