package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        TheatreTimetable theatreTimetable = new ProxyTimetable("sept_timetableOperetta.xml");

        theatreTimetable.display();// has loading
        System.out.println();

        theatreTimetable.display();//doesn't have loading
    }
}
