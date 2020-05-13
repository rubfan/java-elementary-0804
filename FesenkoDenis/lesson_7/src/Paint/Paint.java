package Paint;

public class Paint {
    public Name name = new Name();
    public Author author = new Author();
    public InfoAbout infoAbout = new InfoAbout();

    public static void main(String[] args) {
        Paint paint1 = new Paint();
        paint1.name.setNameOfPaint("Mona Liza");
        paint1.name.showName();
        paint1.author.setNameOfAuthor("Da Vinci");
        paint1.author.setAgeOfAuthor(54);
        paint1.author.showInfo();
        paint1.infoAbout.infoAuction();
        paint1.infoAbout.setPrice(1800);
        paint1.infoAbout.setPrice(1900);
    }
}
