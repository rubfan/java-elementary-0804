package Paint;

public class Author {
    private String nameOfAuthor;
    private int ageOfAuthor;

    public void setNameOfAuthor(String s) {
        nameOfAuthor = s;
    }

    public void setAgeOfAuthor(int i) {
        ageOfAuthor = i;
    }

    public void showInfo() {
        System.out.println("The author name is: " + nameOfAuthor + "and he is " + ageOfAuthor);
    }
}
