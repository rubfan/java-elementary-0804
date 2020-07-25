package solidPrinciples.liskovSubstitutionPrinciple;

public class HourlySalary implements ITimeCard {
    @Override
    public void addTimeCardDetails() {
        System.out.println("Add receipt Hourly time card logic");
    }

    public void hourlySalaryLogic() {
        System.out.println("Hourly salary logic");
    }

    @Override
    public float calculateSalary() {
        System.out.println("Calculate salary logic for Hourly salary");
        return 0;
    }
}
