import java.util.Scanner;
public class Programm6_9 {
    public static void main(String[] args) {
        String str;
        int i, findIndex, Number, bitNumber, newNumber, base = 0b00000001;
        String strNumber, strNewNumber;
        System.out.println("Введите число и номер бита, который надо установить в 1. Например 98 2");
        Scanner in = new Scanner(System.in);
        str = in.nextLine();
        findIndex = str.indexOf(" ");
        Number = Integer.valueOf(str.substring(0, findIndex));
        bitNumber = Integer.valueOf(str.substring(findIndex + 1));
        strNumber = Integer.toBinaryString(Number);
        i = strNumber.length() - 1;
        while (i != 7) {
            strNumber = "0" + strNumber;
            i++;
        }
        System.out.println("Введено " + Number + " или " + strNumber);
        if (bitNumber == 0) base = 0b00000001;
        if (bitNumber >= 1) base <<= (bitNumber);
        newNumber = base | Number;
        strNewNumber = Integer.toBinaryString(newNumber);
        i = strNewNumber.length() - 1;
        while (i != 7) {
            strNewNumber = "0" + strNewNumber;
            i++;
        }
        System.out.println("Новое число " + newNumber + " или " + strNewNumber);
    }
}
