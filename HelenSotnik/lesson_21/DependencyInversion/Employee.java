package dependency.inversion;

public class Employee implements IEmployee {
    @Override
    public String workForCompany() {
        return "Average employee, works 45 hours per week";
    }
}
