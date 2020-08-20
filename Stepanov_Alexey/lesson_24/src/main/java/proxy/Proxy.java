package proxy;

import java.util.Scanner;

public class Proxy {
    private final int TRIES = 3;
    private int currentTry;
    private final Login service;

    public Proxy(Login service) {
        this.service = service;
    }

    public void enter(User user) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(user.getName() + " enter you password: ");
            String password = scanner.next();
            if (user.validate(password)) {
                service.enter(user);
                break;
            } else {
                currentTry++;
            }
            if (currentTry == TRIES) {
                System.out.println("You number of tries exceeded");
                break;
            }
        }
    }
}
