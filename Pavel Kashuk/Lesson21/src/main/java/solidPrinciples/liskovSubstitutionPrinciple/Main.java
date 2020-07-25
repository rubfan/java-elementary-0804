package solidPrinciples.liskovSubstitutionPrinciple;

public class Main {
    public static void main(String[] args) {
        ITimeCard timeCardPay = new HourlySalary();
        timeCardPay.addTimeCardDetails();
        timeCardPay.calculateSalary();

        IPayClassification pay = new CommissionSalary();
        pay.calculateSalary();
    }
}
