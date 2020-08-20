package dependency.inversion;

public class SeniorEmployee implements IEmployee {
    @Override
    public String workForCompany() {
        return "Hardworking employee, 60 hours per week";
    }
}
