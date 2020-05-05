public class Lantern {
    Name name = new Name();
    Shining shining = new Shining();
    Location location = new Location();
    Company company = new Company();
    public static void main(String[] args) {
        Lantern l = new Lantern();
        l.name.sayMyName("Cool Lantern");
        l.shining.shine(2);
        l.location.lie("on the table");
        l.company.sayMyProducer("Phillips");
    }
}
