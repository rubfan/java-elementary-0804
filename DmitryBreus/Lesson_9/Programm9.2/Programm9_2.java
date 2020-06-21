import java.util.Scanner;
import java.util.regex.Pattern;

public class Programm9_2 {
    public static void main(String[] args) {
        System.out.println("Введите слова");
        Scanner in = new Scanner(System.in);
        String msg = in.nextLine();
        FunctionList(msg);
    }

    public static void FunctionList(String msg) {
        Pattern pattrn = Pattern.compile("\\s");//символ пробела
        String[] Smbl = pattrn.split(msg);
        String buff = "";
        String outList = "";
        for (String s : Smbl) {
            if (s.length() >= 4) {
                buff = s.substring(0, 1) + s.length() + s.substring(s.length() - 1);
            } else {
                buff = s;
            }
            outList=outList+" "+buff;
        }
        System.out.println(outList);
    }
}
