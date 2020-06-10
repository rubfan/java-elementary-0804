public class Task5 {
    public static void main(String[] args) {
        String team1 = args[0], team2 = args[1];
        int score1 = Integer.parseInt(args[2]);
        int score2 = Integer.parseInt(args[3]);
        int max = (score1 >= score2) ? score1 : score2;
        int percentage = 100 * max / (score1 + score2);
        String leader = (score1 > score2) ? team1 : team2;
        String looser = (score1 < score2) ? team1 : team2;
        if (score1 == score2) {
            System.out.println("Draw in game! Score is equal! ");
        } else {
            System.out.println(leader + " is " + percentage + "% ahead, while " + looser + " is " + percentage + "% behind.");
        }
    }
}
