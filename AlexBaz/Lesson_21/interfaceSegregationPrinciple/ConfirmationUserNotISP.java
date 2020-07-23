package interfaceSegregationPrinciple;

import defaultState.User;

public interface ConfirmationUserNotISP {
    public void sendConfirmationEmail(User user);

    public void sendConfirmationSMS(User user, String numberPhone);

    public void sendConfirmationCall(User user, String numberPhone);
}

class ConfirmationEmailUserNotISP implements ConfirmationUserNotISP {
    public void sendConfirmationEmail(User user) {
        // Шлем письмо пользователю
        String login = user.getLogin();
        String email = user.getEmail();
        System.out.println("User with name - " + login + ", and address - " + email + " has been successfully registered!");
    }

    public void sendConfirmationSMS(User user, String numberPhone) {

    }

    public void sendConfirmationCall(User user, String numberPhone) {

    }
}

interface ConfirmationUserEmailYesISP {
    public void sendConfirmationEmail(User user);
}

interface ConfirmationUserSMSYesISP {

    public void sendConfirmationSMS(User user, String numberPhone);
}


interface ConfirmationUserCallYesISP {

    public void sendConfirmationCall(User user, String numberPhone);
}

class ConfirmationEmailUserYesISP implements ConfirmationUserEmailYesISP {
    public void sendConfirmationEmail(User user) {
        // Шлем письмо пользователю
        String login = user.getLogin();
        String email = user.getEmail();
        System.out.println("User with name - " + login + ", and address - " + email + " has been successfully registered!");
    }
}
