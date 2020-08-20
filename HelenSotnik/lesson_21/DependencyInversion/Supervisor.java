package dependency.inversion;

public class Supervisor {
    IEmployee employee;

    public IEmployee getEmployee() {
        return employee;
    }

    public void setEmployee(IEmployee employee) {
        this.employee = employee;
    }

    public String manage() {
        return employee.workForCompany();
    }
}
