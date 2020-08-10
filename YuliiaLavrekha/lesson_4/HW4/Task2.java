package HW4;

public class Task2 {
    public static void main(String[] args) {
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        int third = Integer.parseInt(args[2]);
        boolean firstIsTheBiggest = first > second && first > third;
        boolean secondIsBiggerThanThird = second > third;
        int i = secondIsBiggerThanThird ? second : third;
        int biggestNumber = firstIsTheBiggest ? first : i;
        System.out.println(biggestNumber);
    }
}
