package facade;

public class Client {
    public static void main(String[] args) {
        FacadePhone facadePhone = new FacadePhone();

        System.out.println(facadePhone.descriptionApplePhone());
        System.out.println(facadePhone.buildApplePhone());

        System.out.println(facadePhone.descriptionAndroidPhone());
        System.out.println(facadePhone.buildAndroidPhone());

        System.out.println(facadePhone.descriptionMicroSoftPhone());
        System.out.println(facadePhone.buildMicroSoftPhone());
    }
}
