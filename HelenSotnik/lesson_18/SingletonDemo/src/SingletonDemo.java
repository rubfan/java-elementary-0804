package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(singleton.getClass());

        MySingleton singleton2 = MySingleton.getInstance();
        System.out.println(singleton2.hashCode());
        System.out.println(singleton2.getClass());

        MySingleton singleton3 = MySingleton.getInstance();
        System.out.println(singleton3.hashCode());
        System.out.println(singleton3.getClass());
    }
}
