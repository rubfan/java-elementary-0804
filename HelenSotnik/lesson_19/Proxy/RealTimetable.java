package proxy;

public class RealTimetable implements TheatreTimetable {
    private String timetableFileName;

    public RealTimetable(String timetableFileName) {
        this.timetableFileName = timetableFileName;
        loadFromDisk(timetableFileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying Timetable File Name: " + timetableFileName);
    }

    public void loadFromDisk(String timetableFileName) {
        System.out.println("Loading: " + timetableFileName);
    }
}
