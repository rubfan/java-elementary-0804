package observer;

import java.util.List;

public class Employee implements Observer{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void handleChanges(List<String> changes) {
        System.out.println(this.name + ", we have some changes on report." + changes);
    }
}
