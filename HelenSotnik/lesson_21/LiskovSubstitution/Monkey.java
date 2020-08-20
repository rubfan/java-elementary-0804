package liskovsubstitution;

public class Monkey extends WildAnimal {
    private String type;

    public Monkey(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void nameYourself() {
        System.out.println("Monkey");
    }

    @Override
    public void findFood() {
        System.out.println("Look for fruits upon the trees and insects.");

    }

    @Override
    public void eatFood() {
        System.out.println("Eat your bananas. ");

    }

    @Override
    public void showHabitat() {
        System.out.println(getType() + " lives in monkey forests in Indonesia,and other tropical places.");
    }

    @Override
    public void showYourVoice() {
        System.out.println("Uuuuuaaaa");
    }
}
