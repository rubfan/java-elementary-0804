public class Student {
    Name name = new Name();
    HomeWork homeWork = new HomeWork();
    Meeting meeting = new Meeting();
    public static void main(String[] args) {
        Student student = new Student();
        student.name.sayMyname("Настя", 18);
        student.homeWork.doingHW("биологии");
        student.meeting.go("в кино", "мамой");
        student.meeting.drink("пиво", "друзьями");
    }
}
