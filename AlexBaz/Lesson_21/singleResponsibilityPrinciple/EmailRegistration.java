package singleResponsibilityPrinciple;

import defaultState.User;

import java.util.ArrayList;
import java.util.List;

public class EmailRegistration {

    UserRegistrationArrayList userRegistrationArrayList = new UserRegistrationArrayList();
    ConfirmationEmailUser confirmationEmailUser = new ConfirmationEmailUser();

    public Boolean processRegistration(User user) {
        if (userRegistrationArrayList.isValid(user)) {
            userRegistrationArrayList.save(user);
            confirmationEmailUser.sendConfirmationEmail(user);
            return true;
        } else {
            System.out.println("A user with the same name or address already exists");
            return false;
        }
    }
}

class UserRegistrationArrayList {
    // сохраняем пользователя в базу данных
    private List<User> list = new ArrayList<User>();

    public void save(User user) {
        list.add(user);
    }

    // проверяем нет ли пользователей с таким же именем и адрессом
    public boolean isValid(User user) {
        boolean valid = false;
        if (list.size() == 0) {
            valid = true;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (user.getLogin().equals(list.get(i).getLogin()) && user.getEmail().equals(list.get(i).getEmail())) {
                    valid = false;
                    break;
                } else {
                    valid = true;
                }
            }
        }
        return valid;
    }
}

class ConfirmationEmailUser {
    public void sendConfirmationEmail(User user) {
        // Шлем письмо пользователю
        String login = user.getLogin();
        String email = user.getEmail();
        System.out.println("User with name - " + login + ", and address - " + email + " has been successfully registered!");
    }
}
