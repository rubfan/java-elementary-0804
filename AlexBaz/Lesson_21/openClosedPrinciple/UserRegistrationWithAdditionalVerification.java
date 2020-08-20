package openClosedPrinciple;

import defaultState.User;
import singleResponsibilityPrinciple.EmailRegistration;

public class UserRegistrationWithAdditionalVerification extends EmailRegistration {
    private int age;

    @Override
    public Boolean processRegistration(User user) {
        if(indicateAge(age)) {
            super.processRegistration(user);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean indicateAge (int age) {
        if (age < 13) {
            System.out.println("You are not old enough. Ask your parents for help");
            return false;
        }
        else {
            return true;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


