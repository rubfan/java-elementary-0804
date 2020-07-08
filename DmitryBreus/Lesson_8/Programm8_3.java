import java.util.regex.Pattern;
import java.util.Scanner;
public class Programm8_3 {
    public static void main(String[] args) {
        int leftSide, rightSide, coutChar, countWords;
        String[] array;
        String msg = "";
        countWords = 0;
        System.out.println("Input word array");
        Scanner in = new Scanner(System.in);
        //deleveled, evitative, cat, dog, deified
        String Message = in.nextLine();
        System.out.println(Message);
        Pattern pattrn = Pattern.compile(",\\s");
        array = pattrn.split(Message);
        for (int iWord = 0; iWord != array.length; iWord++) {
            msg = array[iWord];
            if (msg.length() % 2 == 1) {
                leftSide = (msg.length() / 2);
                rightSide = leftSide;
                coutChar = 0;
                for (int i = 0; i != leftSide; ) {
                    for (int j = msg.length() - 1; j != rightSide; j--) {
                        if (msg.charAt(i) == msg.charAt(j)) {
                            coutChar++;
                        }
                        i++;
                    }
                }//for (int i = 0; i != leftSide; )
                if (coutChar == leftSide) {
                    countWords++;
                }
            }//if (msg.length()%2==1)
        }//for (int iWord=0; iWord!=array.length;iWord++)
        System.out.println("There are "+countWords + " palindromes in the text");
    }
}
