package dependencyInversionPrinciple;

import defaultState.User;

public class ConfirmationEmailUserDIP extends ConfirmationUser {
    public void sendConfirmationEmail(User user) {
        // Шлем письмо пользователю
        String login = user.getLogin();
        String email = user.getEmail();
        System.out.println("User with name - " + login + ", and address - " + email + " has been successfully registered!");
    }
}
