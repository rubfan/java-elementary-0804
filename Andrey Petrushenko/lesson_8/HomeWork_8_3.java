public class HomeWork_8_3 {

    public static void main(String[] args) {
        String[] text = {"deleveled", "evitative", "cat", "dog", "deified"};
        int num = 0;
        String word;
        for (String s : text) {
            word = s;
            if (isPalindrome(word))
                num++;
        }
        System.out.println("There are " + num + " palindromes in the text");
    }

    public static String invertString(String word) {
        StringBuilder row = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; --i)
            row.append(word.charAt(i));
        return row.toString();
    }

    public static boolean isPalindrome(String word) {
        invertString(word);
        if (word.equals(invertString(word))) {
            System.out.println(word + " is palindrome");
            return true;
        } else {
            System.out.println(word + "   isn't palindrome");
            return false;
        }
    }
}
