public class Main1 {
    public static void main(String[] args) {
        changeSymbols("person@gmail.com");
    }
    public static void changeSymbols(String a) {
        String b = a.replace("@", "[ at ]");
        String c = b.replace(".", "[ dot ]");
        System.out.println(c);
    }
}
