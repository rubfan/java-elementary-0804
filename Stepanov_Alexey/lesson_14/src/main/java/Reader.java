import java.util.Scanner;

public class Reader {
    public static Answer[] answersArray = new Answer[numberOfElements(Text.TEXT)];

    public static void main(String[] args) {
        buildAnswersArray(Text.TEXT);
        buildMenu();
        while (true) {
            int optionIndex = getOption();
            if (optionIndex == -1) {
                break;
            } else if (optionIndex == -2) {
                System.out.println("Wrong option. Try again");
            } else {
                printResult(optionIndex);
                buildMenu();
            }
        }
    }

    public static int numberOfElements(String text) {
        int count = 1;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == '\n' && text.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    private static void buildAnswersArray(String text) {
        int start = 0;
        for (int i = 0; i < answersArray.length; i++) {
            int end = getNextAnswerStart(start);
            String answer = text.substring(start, end);
            int id = parseId(answer);
            answersArray[i] = new Answer(id, answer);
            start = end;
        }
    }

    private static int getOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type number or 'exit' to quit: ");
        String input = scanner.next();
        if (input.equalsIgnoreCase("exit")) {
            return -1;
        }
        int option = Integer.parseInt(input);
        for (int i = 0; i < answersArray.length; i++) {
            if (answersArray[i].getId() == option) {
                return i;
            }
        }
        return -2;
    }

    private static void printResult(int answerIndex) {
        System.out.println(answersArray[answerIndex].getAnswer());
        answersArray[answerIndex].setReviewed(true);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press Enter to continue...");
        scanner.nextLine();
    }

    private static void buildMenu() {
        String review = "Questions to review: ";
        String reviewed = "Reviewed: ";
        for (int i = 0; i < numberOfElements(Text.TEXT); i++) {
            if (answersArray[i].isReviewed()) {
                reviewed += answersArray[i].getId() + " ";
            } else {
                review += answersArray[i].getId() + " ";
            }
        }
        System.out.println(review + "\n" + reviewed);
    }

    private static int parseId(String answer) {
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == '.') {
                String textId = answer.substring(0, i);
                return Integer.parseInt(textId);
            }
        }
        return 100;
    }

    private static int getNextAnswerStart(int currentStartIndex) {
        String text = Text.TEXT;
        int nextStartIndex = currentStartIndex;
        for (int i = currentStartIndex; i < text.length() - 1; i++) {
            nextStartIndex++;
            if (text.charAt(i) == '\n' && text.charAt(i + 1) != ' ') {
                return nextStartIndex;
            }
        }
        return text.length();
    }
}
