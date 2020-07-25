package solidPrinciples.liskovSubstitutionPrinciple;

public class CommissionSalary implements IPayClassification {
    @Override
    public float calculateSalary() {
        System.out.println("Calculate salary for commission");
        return 0;
    }
}
