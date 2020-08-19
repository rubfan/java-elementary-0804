package SingleResponsibility;

public class StereotypesOfSociety {
    public static void main(String[] args) {
        Man man = new Man();
        man.earnMoney("high");
        Woman woman = new Woman();
        woman.bearChildren(3);
    }
}

class Man {
    public void earnMoney(String ratingOfJob) {
        if (ratingOfJob.equals("low")) {
            System.out.println("Man earns less than 1000$.");
        } else if (ratingOfJob.equals("average")) {
            System.out.println("Man earns nearly 2000$.");
        } else if (ratingOfJob.equals("high")) {
            System.out.println("Man earns more than 3000$.");
        } else {
            System.out.println("Input Error.");
        }
    }
}

class Woman {
    public void bearChildren(int number) {
        System.out.println("Woman bears " + number + " children.");
    }
}

