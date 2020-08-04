package composite;

public class Developer implements Employee {
    private String name;
    private String position;
    private Integer salary;

    public Developer(String name, String position, Integer salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this.name + " " + this.position + " " + this.salary);
    }
}
