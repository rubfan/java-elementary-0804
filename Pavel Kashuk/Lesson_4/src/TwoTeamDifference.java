// 5) Написать программу которая на вход метода main получает 2 числа и 2 строки из командной строки,
// которые представляют собой счет 2х спортивных команд с 2мя введеными названиями,
// вывести на экран название команды и процент опережения или отставания команд друг от друга.

public class TwoTeamDifference {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        String firstTeam = args[2];
        String secondTeam = args[3];
        double aTeamWins = (100 - b / (a / 100));
        double bTeamWins = (100 - a / (b / 100));
        String score = a > b ? firstTeam + " wins on " + aTeamWins + " %" : a < b ? secondTeam + " wins on " + bTeamWins + " %" : "Draw";
        System.out.println(score);
    }
}