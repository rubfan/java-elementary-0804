package composite;

public class Manager implements Employee {
    private String name;
    private String position;
    private Integer salary;

    public Manager(String name, String position, Integer salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.name + " " + this.position + " " + this.salary);
    }
}
