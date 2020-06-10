public class Task3 {
    public static void main(String[] args) {
        String[] words = args[0].split(",");
        int number = 0;
        System.out.println("All words: " + args[0]);
        System.out.print("Palindromes: ");

        for (String word : words) {
            String word2 = reverse(word);
            if (word2.equals(word)) {
                number++;
                System.out.print(word + ",");
            }
        }
        System.out.println();
        System.out.print("There are " + number + " palindromes in the text");
    }

    public static String reverse(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            result = string.charAt(i) + result;
        }
        return result;
    }
}
