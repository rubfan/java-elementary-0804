public class Company {
    private String company;
    public void sayMyProducer(String producer) {
        company = producer;
        System.out.println("I was made by " + producer + ".");
    }
}
