package dependencyInversionPrinciple;

import defaultState.User;

public class EmailRegistrationDIP {
    private RegistrationUser registrationUser;
    private ConfirmationUser confirmationUser;

    public EmailRegistrationDIP(RegistrationUser registrationUser, ConfirmationUser confirmationUser) {
        this.registrationUser = registrationUser;
        this.confirmationUser = confirmationUser;
    }

    public Boolean processRegistration(User user) {
        if (registrationUser.isValid(user)) {
            registrationUser.save(user);
            confirmationUser.sendConfirmationEmail(user);
            return true;
        } else {
            System.out.println("A user with the same name or address already exists");
            return false;
        }
    }
}

