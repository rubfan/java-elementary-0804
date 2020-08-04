package facade;

public class FacadePhone {
    private IPhone iPhone;
    private Samsung samsung;
    private MicroSoftPhone microSoftPhone;

    public FacadePhone() {
        this.iPhone = new IPhone();
        this.samsung = new Samsung();
        this.microSoftPhone = new MicroSoftPhone();
    }

    public String buildApplePhone() {
        return this.iPhone.build();
    }

    public String descriptionApplePhone() {
        return this.iPhone.getDescription();
    }

    public String buildMicroSoftPhone() {
        return this.microSoftPhone.build();
    }

    public String descriptionMicroSoftPhone() {
        return this.microSoftPhone.getDescription();
    }

    public String buildAndroidPhone() {
        return this.samsung.build();
    }

    public String descriptionAndroidPhone() {
        return this.samsung.getDescription();
    }
}
