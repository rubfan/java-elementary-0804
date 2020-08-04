package Lesson_21;

import java.util.Arrays;

public class SingleResponsibility {
    public static void main(String[] args) {
        Registration user1 = new Registration("Den", "111");
        user1.registrationComplete(user1);

        Login login1 = new Login("Den", "111");
        login1.isMember(login1);

        CheckEmail email = new CheckEmail();
        email.checkMail(login1);
    }

}

class CheckEmail {
    private final String[] messages = {"Hello! ", "Spam"};

    public void checkMail(Login login) {
        if (login.isMember()) {
            System.out.println(Arrays.toString(messages));
        }
    }
}

class Login {
    private final String login;
    private final String pass;
    private boolean isMember;

    public Login(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public boolean isMember() {
        return isMember;
    }

    public void isMember(Login login) {
        for (int i = 0; i < 2; i++) {
            if (Registration.arrOfUsers[i].getLogin().equals(login.login) &&
                    Registration.arrOfUsers[i].getPass().equals(login.pass)) {
                isMember = true;
                break;
            } else {
                isMember = false;
            }
        }
    }

}

class Registration {
    public static Registration[] arrOfUsers = new Registration[10];
    private static int position = 0;
    private String login;
    private String pass;

    public Registration(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public void registrationComplete(Registration reg) {
        arrOfUsers[position] = reg;
        position++;
        description();
    }


    public void description() {
        System.out.println("Congratulations, " + login + "! Now you are the member of our Mail!");
    }
}