package liskovsSubstitutionPrinciple;

import defaultState.User;

public class IsValidUserNotLSP extends UserRegistrationArrayListLSP {
    @Override
    protected void save(User user) {

    }

    @Override
    public boolean isValid(User user) {
        return super.isValid(user);
    }
}
