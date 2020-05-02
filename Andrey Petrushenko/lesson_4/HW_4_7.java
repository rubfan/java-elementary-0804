public class HW_4_7 {
    public static void main (String[] args){
        int nmen=Integer.parseInt(args[0]);
        int knap=(nmen*100);
        int nbot=1;
        nbot=(int) (((knap%750)!=0) ? ((knap/750)+1): (knap/750));
        float ostatok=((nbot*750)-knap);
        System.out.println("Необходимое колличество бут. " + nbot);
        System.out.println("Остаток шампанского " +ostatok +" мл");

    }
}
