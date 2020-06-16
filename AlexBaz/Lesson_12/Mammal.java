public class Mammal extends Animal {
    private int foot = 4;
    protected String tail = "Have a tail.";

    protected String feedWithMilk() {
        return "Feeds the young with milk.";
    }

    protected String getFoot() {
        return "Have " + foot + " foot.";
    }

    protected String getTail() {
        return tail;
    }
}

