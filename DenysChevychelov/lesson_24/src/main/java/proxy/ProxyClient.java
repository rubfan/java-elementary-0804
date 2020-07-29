package proxy;

public class ProxyClient {
    public static void main(String[] args) {
        Car car = new ProxyVolvo(true);
        car.move();
    }
}
