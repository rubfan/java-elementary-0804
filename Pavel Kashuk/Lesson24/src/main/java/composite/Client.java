package composite;

public class Client {
    public static void main(String[] args) {
        Developer firstDeveloper = new Developer("Ben", "Senior", 5000);
        Developer secondDeveloper = new Developer("Richard", "Middle", 3000);

        CompanyDirectory devDirectory = new CompanyDirectory();
        devDirectory.addEmployee(firstDeveloper);
        devDirectory.addEmployee(secondDeveloper);

        Manager firstManager = new Manager("Mike", "LeadManager", 4000);
        Manager secondManager = new Manager("Beverly", "JuniorManager", 1000);

        CompanyDirectory managerDirectory = new CompanyDirectory();
        managerDirectory.addEmployee(firstManager);
        managerDirectory.addEmployee(secondManager);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(devDirectory);
        directory.addEmployee(managerDirectory);
        directory.showEmployeeDetails();
    }
}
