package dependency.inversion;

public class DependencyInversionDemo {
    public static void main(String[] args) {
        Supervisor supervisor = new Supervisor();

        supervisor.setEmployee(new Employee());
        System.out.println(supervisor.manage() + "\n");

        supervisor.setEmployee(new SeniorEmployee());
        System.out.println(supervisor.manage() + "\n");
    }
}
