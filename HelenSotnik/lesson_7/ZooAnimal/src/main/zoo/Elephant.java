package main.zoo;

public class Elephant {
    private String name;

    public void setName(String elephantName) {
        name = elephantName;
    }

    public void sayYourName() {
        System.out.println("Namaste, my name is " + name + ". And I am a big elephant from India ");
    }

    public void takeAShower() {
        System.out.println("Watch  me taking a shower");
        System.out.println("First I will take water by trunk and rise it up, and Voila!");
    }
}
