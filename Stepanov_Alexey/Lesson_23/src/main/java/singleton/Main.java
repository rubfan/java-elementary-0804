package singleton;

public class Main {
    public static void main(String[] args) {
        Admin sales = Admin.create("Feodor", 5);
        Admin marketing = Admin.create("Vasya", 5);

        System.out.println(sales.toString());
        System.out.println(marketing.toString());
//        output:
//        Admin{id='Feodor', accessLevel=5}
//        Admin{id='Feodor', accessLevel=5}
    }
}
