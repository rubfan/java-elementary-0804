package dependencyInversionPrinciple;

import defaultState.User;

abstract public class RegistrationUser {
    public void save(User user) {
    }

    public boolean isValid(User user) {
        return false;
    }
}
