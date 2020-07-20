package factoryMethod;

public class Report {
    private String type;

    public Report(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Report{" +
                "type='" + type + '\'' +
                '}';
    }
}
