package segregation;

public class UsainBolt implements OlympicRunner {
    @Override
    public String showInfo() {
        return "Usain Bolt represents Jamaica\n" +
                "8fold Olympic Champion and 11fold World Champion\n" +
                "Sport nickname: Lightning Bolt\n";
    }

    @Override
    public String compete() {
        return "Usain Bolt started competing\n";
    }

    @Override
    public String run100m() {
        return "Usain Bolt is running 100m distance\n";
    }

    @Override
    public String run200m() {
        return "Usain Bolt is running 200m distance\n";
    }
}
