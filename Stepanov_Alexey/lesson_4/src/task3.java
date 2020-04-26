public class task3 {
    public static void main(String[] args) {
        int numb1 = Integer.parseInt(args[0]);
        int numb2 = Integer.parseInt(args[1]);
        int numbSyst = Integer.parseInt(args[2]);
        double powerResult = Math.pow(numb1, numb2);
        String result1 = Integer.toBinaryString((int) powerResult);
        String result2 = Integer.toOctalString((int) powerResult);
        String result3 = Integer.toHexString((int) powerResult);
        String result4 = String.valueOf(powerResult);
        System.out.println(numbSyst == 2 ? result1 : numbSyst == 8 ? result2 : 
        	numbSyst == 16 ? result3 : numbSyst == 10 ? result4 : "");
	}
}