package task5;

public class Main4 {
    public static void main(String[] args) {
        double team1 = Double.parseDouble(args[10]), team2 = Double.parseDouble(args[11]);
        double max = team1 > team2 ? team1 : team2 ;
        double min = team1 < team2 ? team1 : team2;
        double perCent = 100 - (min*100/max);
        System.out.println("Команда " + args[12] + " опереджає команду " + args[13] + " на " + perCent + " процентів");
    }
}
