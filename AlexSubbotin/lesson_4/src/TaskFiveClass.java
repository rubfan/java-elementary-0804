public class TaskFiveClass {
    public static void main(String[] args) {
        String teamOne = args[0], teamTwo = args[1];
        int scoreOne = Integer.parseInt(args[2]);
        int scoreTwo = Integer.parseInt(args[3]);
        int max = (scoreOne >= scoreTwo) ? scoreOne : scoreTwo;
        int percentage = 100 * max / (scoreOne + scoreTwo);
        String leader = (scoreOne > scoreTwo) ? teamOne : teamTwo;
        String looser = (scoreOne < scoreTwo) ? teamOne : teamTwo;

        String result =  (scoreOne == scoreTwo) ? "Draw in game! Score is equal! "
                : leader + " is " + percentage + "% ahead, while " + looser + " is " + percentage + "% behind.";

        System.out.println(result);
    }
}
