package prototype;

public class PrototypeDemo {
    public static void main(String[] args) {
        Yacht yacht52Steel = new Yacht();
        yacht52Steel.setName("Santlorenzo");
        yacht52Steel.setType("motor");
        yacht52Steel.setEngine("MTU 12V 4000 M63");
        yacht52Steel.setLength(52);
        yacht52Steel.setDisplacement("1325 kg/m3");
        yacht52Steel.setMaterial("steel and aluminium");
        yacht52Steel.setPassengersCapacity(21);
        yacht52Steel.setMaxSpeed("16.5 knots");

        Yacht yachtAdmiral = (Yacht) yacht52Steel.createPrototype();
        yachtAdmiral.setName("Admiral Grand Explorer");
        yachtAdmiral.setLength(96);
        yachtAdmiral.setPassengersCapacity(66);
        yachtAdmiral.setDisplacement("1505 kg/m3");
    }
}
