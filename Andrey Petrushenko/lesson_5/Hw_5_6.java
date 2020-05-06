import com.sun.scenario.effect.impl.sw.java.JSWBlend_OVERLAYPeer;

public class Hw_5_6 {
    public static void main(String[] args) {
        float s = Float.parseFloat(args[0]);
        String l = args[1];
        if (l.equals("terrible") ){
            System.out.println("Чаевые не оставляем");
        }
        else {}
        if (l.equals("poor") ){
            System.out.println("Oставляем чаевые 5% сумма к оплате = " +((s*0.05)+s));
        }
        else {}
        if (l.equals("good") ){
            System.out.println("Oставляем чаевые 10% сумма к оплате = " +((s*0.1)+s));
        }
        else {}
        if (l.equals("great") ){
            System.out.println("Oставляем чаевые 15% сумма к оплате = " +((s*0.15)+s));
        }
        else {}
        if (l.equals("excellent") ){
            System.out.println("Oставляем чаевые 20% сумма к оплате = " +((s*0.2)+s));
        }
        else {}

    }
}
