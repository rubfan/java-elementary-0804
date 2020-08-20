package singleton;

public class ClientSingleton {
    public static void main(String[] args) {
        Singleton firstSingleton = Singleton.getInstance();
        System.out.println(firstSingleton.hashCode());
        Singleton secondSingleton = Singleton.getInstance();
        System.out.println(secondSingleton.hashCode());
    }
}
