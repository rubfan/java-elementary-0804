package adapterPattern;

public class AdapterClient {
    public static void main(String[] args) {
        PlugWithThreeLegs plugWithThreeLegs =
                new PlugWithThreeLegs(
                        new PlugToSocketAdapter(
                                new TwoLeggedSocket()));
        plugWithThreeLegs.insertPlug();
    }
}
