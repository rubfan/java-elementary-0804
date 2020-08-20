package proxy;

public class ProxyTimetable implements TheatreTimetable {
    private RealTimetable realTimetable;
    private String timetableFileName;

    public ProxyTimetable(String timetableFileName) {
        this.timetableFileName = timetableFileName;
    }

    @Override
    public void display() {
        if (realTimetable == null) {
            realTimetable = new RealTimetable(timetableFileName);
        }
        realTimetable.display();
    }
}
