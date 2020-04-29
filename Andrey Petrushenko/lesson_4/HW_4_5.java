public class HW_4_5 {
    public static void main(String[] args) {
        int c = Integer.parseInt(args[0]);
        String C=args[1];
        int c1 = Integer.parseInt(args[2]);
        String C1=args[3];
        float score =  (c>c1) ? score=((c*100)/(c+c1)): 0 ;
        System.out.println(C+ " Win " +score+ " %   "+ C1 +" loose "+ (100-score)+ " %");
    }
}