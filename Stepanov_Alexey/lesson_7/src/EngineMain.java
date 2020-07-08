public class EngineMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setModelName("Super drive");
        engine.setCylindersNumber(10);
        engine.setFuelLevel(0.9);
        engine.setHorsePower(300);
        engine.printEngineData();
    }
}
