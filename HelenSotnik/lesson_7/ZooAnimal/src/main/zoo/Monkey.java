package main.zoo;

public class Monkey {
    private String name;
    private String food;

    public void setName(String monkeyName) {
        name = monkeyName;
    }

    public void sayHi() {
        System.out.println("I'm a monkey " + name + ". I come from Bali");
    }

    public void setFood(String foodName) {
        food = foodName;
    }

    public void feed() {
        switch (food) {
            case ("Bananas"):
                System.out.println(food + " Yoommy....Delicious");
                break;
            case ("Worms"):
                System.out.println(food + " Fantastic... I love that");
                break;
            case ("Potato"):
                System.out.println(food + " Uuuh...Maybe next time");
                break;
            default:
                System.out.println("I am not hungry");
        }
    }
}

