public class Singleton {
    public static void main(String[] args) {
        Hymn hymn = Hymn.getInstance();
        Hymn hymn2 = Hymn.getInstance();
        System.out.println(hymn.hashCode());
        System.out.println(hymn2.hashCode());
    }
}

class Hymn {
    private static Hymn hymn;
    private Hymn() {}

    public static Hymn getInstance() {
        if (hymn == null) {
            hymn = new Hymn();
        }
        return hymn;
    }
}
