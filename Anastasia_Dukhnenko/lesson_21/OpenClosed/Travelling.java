package OpenClosed;

public class Travelling {
    public static void main(String[] args) {
        TravellingToUSA tr = new TravellingToUSA();
        tr.setDestination("Hawaii");
        tr.setTimeOfFlight(19);
        tr.travelByPlane();
    }
}

interface Plane {
    void travelByPlane();
}

class TravellingToUSA implements Plane {
    private float timeOfFlight;
    private String destination;


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getTimeOfFlight() {
        return timeOfFlight;
    }

    public void setTimeOfFlight(float timeOfFlight) {
        this.timeOfFlight = timeOfFlight;
    }

    @Override
    public void travelByPlane() {
        System.out.println("Your destination: " + destination);
        System.out.println("Time of flight: " + timeOfFlight + " hours.");
    }
}

