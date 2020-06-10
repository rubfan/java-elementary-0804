package task7;

public class Main6 {
    public static void main(String[] args) {
        int countPeople = Integer.parseInt(args[16]);
        int bottleNeed = (countPeople*100)/750 +1;
        int freeChampange = bottleNeed * 750 - (countPeople*100);
        System.out.println("You need " +bottleNeed + " bottle of Champagne and you'll have " + freeChampange + "gramms free");
        //System.out.println(1000/750);
    }
}
