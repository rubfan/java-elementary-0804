package facadePattern;

public class FacadeClient {
    public static void main(String[] args) {
        Workflow workflow = new Workflow();
        workflow.prepareCar();
    }

}
