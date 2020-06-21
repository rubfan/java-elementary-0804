import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programm9_1 {
    public static void main(String[] args) {
        String emailReplace = "";
        System.out.println("Введите e-mail:");
        Scanner in = new Scanner(System.in);
        String email = in.next();
        Pattern pattrn = Pattern.compile("[@.]");
        Matcher matchr = pattrn.matcher(email);
        StringBuffer buff = new StringBuffer();
        while (matchr.find()) {
            String h = matchr.group();
            if (h.matches("@") == true) matchr.appendReplacement(buff, "[at]");
            else matchr.appendReplacement(buff, "[dot]");
        }
        matchr.appendTail(buff);
        System.out.println(buff);
    }
}
