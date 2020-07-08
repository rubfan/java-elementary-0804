public class Task3 {

    public static void main(String[] args) {
        String strings1 = "deleveled, evitative, cat, dog, deified";
        String[] charStr = strings1.split(", ");
        int p = 0;
        for (String str : charStr) {
            char[] array = str.toCharArray();
            char[] arrayR = new char[array.length];
            for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
                arrayR[j] = array[i];
            }
            String charStrR = String.valueOf(arrayR);

            if (str.equals(charStrR)) {
                p++;
            }
        }
        System.out.println("There are " + p + " words palindromes in the line");
    }
}
