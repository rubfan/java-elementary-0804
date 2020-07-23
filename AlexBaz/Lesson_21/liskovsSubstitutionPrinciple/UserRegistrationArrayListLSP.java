package liskovsSubstitutionPrinciple;

import defaultState.User;

import java.util.ArrayList;
import java.util.List;

public class UserRegistrationArrayListLSP {
    // сохраняем пользователя в базу данных
    private List<User> list = new ArrayList<User>();


    protected void save(User user) {
        list.add(user);
    }

    // проверяем нет ли пользователей с таким же именем и адрессом
    public boolean isValid(User user) {
        boolean valid = false;
        if (list.size() == 0) {
            valid = true;
            save(user);
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (user.getLogin().equals(list.get(i).getLogin()) && user.getEmail().equals(list.get(i).getEmail())) {
                    valid = false;
                    break;
                } else {
                    valid = true;
                    save(user);
                }
            }
        }
        return valid;
    }
}

