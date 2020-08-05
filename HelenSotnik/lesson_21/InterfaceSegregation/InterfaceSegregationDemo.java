package segregation;

public class InterfaceSegregationDemo {
    public static void main(String[] args) {
        OlympicSwimmer swimmer = new MichaelFelps();
        OlympicRunner runner = new UsainBolt();

        System.out.println(runner.showInfo() + runner.compete() + runner.run100m() + runner.run200m());
        System.out.println(swimmer.showInfo() + swimmer.compete() + swimmer.swimBreaststroke());
        System.out.println(swimmer.swimCrawl() + swimmer.swimButterfly());
    }
}
