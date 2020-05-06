import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

public class Paragraph1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if (a % 2 == 0) {
            System.out.println("Число " + a + " четное");
            }   else {
            System.out.println("Число " + a + " нечетное");
        }
    }
}
