package Lesson7.Lantern;

import java.util.Scanner;

public class LanternMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lantern lantern = new Lantern();
        lantern.printStateLantern();
        while (true) {
            switch (scanner.next()) {
                case "set":
                    System.out.println("Name:");
                    lantern.setName(scanner.next());
                    break;
                case "off":
                    lantern.setOff();
                    break;
                case "white":
                    lantern.setShinesWhite();
                    break;
                case "red":
                    lantern.setShinesRed();
                    break;
                case "blinks":
                    lantern.setBLinks();
                    break;
                case "insert":
                    lantern.insertBattery();
                    break;
                case "remove":
                    lantern.removeBattery();
                    break;
                case "showBat":
                    System.out.println("Batteries in the " + lantern.getName() + ": " + lantern.getBatteries());
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input error!");
            }
            lantern.printStateLantern();
        }
    }
}
