public class Team {
    public static void main(String[] params) {
        int a = Integer.parseInt(params[0]);
        int b = Integer.parseInt(params[1]);
        int c = a * 100 / b;
        int d = 100 - b * 100 / a ;
        String difference = a > b ? ("Процент опережения команды " + params[2] + " от команды " + params[3] + " равен " + d + "%.")
                : ("Процент отставания команды " + params[2] + " от команды " + params[3] + " равен " + c + "%.");
        System.out.println(difference);
    }
}
