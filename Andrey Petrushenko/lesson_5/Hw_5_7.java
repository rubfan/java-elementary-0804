public class Hw_5_7 {
    public static void main(String[] args) {
        int nd = Integer.parseInt(args[0]);
        int pfd = 40 ;
        if (nd<=5){
           System.out.println("Сумма оплаты за аренду = "+(nd*40)+ " грн");
       }
       else{}
        if (nd>5&&nd<7){
            System.out.println("Сумма оплаты за аренду = "+((nd*40)-20)+ " грн");
        }
        else{}
        if (nd>7){
            System.out.println("Сумма оплаты за аренду = "+((nd*40)-50)+ " грн");
        }
        else{}
    }
}
