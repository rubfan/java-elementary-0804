package main;

import main.zoo.Monkey;
import main.zoo.Elephant;
import main.zoo.Lion;
import main.zoo.Panda;

public class ZooAnimal {
    public Elephant elephant;
    public Lion lion;
    public Monkey monkey;
    public Panda panda;

    public static void main(String[] args) {
        ZooAnimal an = new ZooAnimal();
        an.monkey = new Monkey();
        an.lion = new Lion();
        an.elephant = new Elephant();
        an.panda = new Panda();

        an.monkey.setName("Marsel");
        an.monkey.setFood("Bananas");
        an.elephant.setName("Brunhilda");
        an.panda.kgBamboo(20);
        an.lion.setWord("Rrrr");

        an.monkey.sayHi();
        an.monkey.feed();
        an.elephant.sayYourName();
        an.elephant.takeAShower();
        an.panda.sayHello();
        an.panda.eatBamboo();
        an.lion.sayHi();
        an.lion.sayWord();
        an.lion.bite();
    }
}
