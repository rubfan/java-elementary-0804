import java.util.Scanner;
public class Programm12_1 {
    static String nameAnimals;
    public static void main(String[] args) {
        AnimalInfo animalInfo = new AnimalInfo() {
            public void getInfo(String name) {
                switch (name) {
                    case "Spiders":
                        AnimalInfo.Spiders spiders=new  AnimalInfo.Spiders();
                        spiders.getInfo(name);
                        break;
                    case "Bears":
                        AnimalInfo.Bears bears=new AnimalInfo.Bears();
                        bears.getInfo(name);
                        break;
                }
            }
        };
        Scanner in = new Scanner(System.in);
        nameAnimals=in.next();
        animalInfo.getInfo(nameAnimals);
    }
}