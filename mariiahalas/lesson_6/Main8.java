package task8;

public class Main8 {
    public static void main(String[] args) {
        System.out.println("The lucky tickets is : ");
        for (int i = 100_000; i <1_000_000 ; i++) {
            String luckyTicket = String.valueOf(i);
            int sumBegin = 0, sumEnd = 0;
            for (int j = 0; j < 3; j++)
                sumBegin += Integer.parseInt(String.valueOf(luckyTicket.charAt(j)));
            for (int j = 3; j < 6; j++)
                sumEnd += Integer.parseInt(String.valueOf(luckyTicket.charAt(j)));
            if(sumBegin==sumEnd)
                System.out.println(i);
        }
    }
}
