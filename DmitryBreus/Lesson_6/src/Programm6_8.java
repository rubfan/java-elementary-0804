public class Programm6_8 {
    public static void main(String[] args) {
        System.out.println("Номерация билетов 100000 до 999999");
        for (int iNum = 100000; iNum != 999999; iNum++) {
            String strNum = String.valueOf(iNum);
            char[] charCurrent = new char[6];
            int i = 0;
            int Summ1 = 0, Summ2 = 0;
            while (i <= 5) {
                charCurrent[i] = strNum.charAt(i);
                if (i <= 2) {
                    Summ1 = Summ1 + Character.getNumericValue(charCurrent[i]);
                }
                if (i >= 3) {
                    Summ2 = Summ2 + Character.getNumericValue(charCurrent[i]);
                }
                i++;
            }//    while (i!=strNum.length()-1)
            if (Summ1 == Summ2) {
                System.out.println("Счастливый билет " + iNum);
            }
        }//for (int iNum=100000; iNum!=999999; iNum++)
    }
}
