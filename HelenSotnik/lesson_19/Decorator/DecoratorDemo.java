package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        BirthdayCake cake = new ChocolateCream(new BirthdayCakeImpl());
        System.out.println(cake.decorate());
        BirthdayCake cake2 = new Berries(new BirthdayCakeImpl());
        System.out.println(cake2.decorate());
    }
}
