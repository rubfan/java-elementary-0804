public class HW_4_2 {
    public static void main (String[] args){
        float a=Float.parseFloat (args[0]);
        float b=Float.parseFloat (args[1]);
        float c=Float.parseFloat (args[2]);
        float biggestNumber = (a > b)&&(a>c) ? biggestNumber=a : (b > a)&&(b>c) ? biggestNumber = b
                : (c > a)&&(c>b) ? biggestNumber=c:0;
        System.out.println(biggestNumber);
    }
}
