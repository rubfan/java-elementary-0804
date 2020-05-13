package main.zoo;

public class Panda {
    int meal;

    public void sayHello() {
        System.out.println("Ni hao, I am panda from China");
    }

    public void kgBamboo(int kgBamboo) {
        meal = kgBamboo;
    }

    public void eatBamboo() {
        if (meal <= 25) {
            System.out.println("Yoommy...Please give me more");
        } else if (meal <= 30) {
            System.out.println("Thank's. I am happy now");
        } else {
            System.out.println("It is too much for one day");
        }
    }
}
