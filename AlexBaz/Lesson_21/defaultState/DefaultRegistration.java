package defaultState;

import java.util.ArrayList;
import java.util.List;

public class DefaultRegistration {
    private List<User> list = new ArrayList<User>();

    public void processRegistration(User user) {
        if (isValid(user)) {
            // сохраняем пользователя в базу данных
            list.add(user);
            sendConfirmationEmail(user);
        }
        else {
            System.out.println("A user with the same name or address already exists");
        }
    }

    // проверяем нет ли пользователей с таким же именем и адрессом
    private boolean isValid(User user) {
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

    private void sendConfirmationEmail(User user) {
        String login = user.getLogin();
        String email = user.getEmail();
        System.out.println("User with name - " + login + ", and address - " + email + " has been successfully registered!");
        // Шлем письмо пользователю
    }

    public List<User> getList() {
        return list;
    }
}
