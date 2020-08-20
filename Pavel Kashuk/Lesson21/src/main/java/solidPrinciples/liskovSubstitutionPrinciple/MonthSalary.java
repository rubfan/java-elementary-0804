package solidPrinciples.liskovSubstitutionPrinciple;

public class MonthSalary implements ITimeCard {
    @Override
    public void addTimeCardDetails() {
        System.out.println("Add receipt MonthlySalary logic");
    }

    public void monthlySalaryLogic() {
        System.out.println("Monthly salary logic");
    }

    @Override
    public float calculateSalary() {
        System.out.println("Calculate pay for monthly salary");
        return 0;
    }
}
